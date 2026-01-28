using SocOps.Models;
using System.Text.Json;
using Microsoft.JSInterop;

namespace SocOps.Services;

public class BingoGameService
{
    private const string STORAGE_KEY = "bingo-game-state";
    private const int STORAGE_VERSION = 2;

    private readonly IJSRuntime _jsRuntime;

    public GameState CurrentGameState { get; private set; } = GameState.Start;
    public GameMode CurrentGameMode { get; private set; } = GameMode.Bingo;
    public List<BingoSquareData> Board { get; private set; } = new();
    public BingoLine? WinningLine { get; private set; }
    public HashSet<int> WinningSquareIds => BingoLogicService.GetWinningSquareIds(WinningLine);
    public bool ShowBingoModal { get; private set; }

    public event Action? OnStateChanged;

    public BingoGameService(IJSRuntime jsRuntime)
    {
        _jsRuntime = jsRuntime;
    }

    public async Task InitializeAsync()
    {
        await LoadGameStateAsync();
    }

    public void StartGame(GameMode mode = GameMode.Bingo)
    {
        CurrentGameMode = mode;
        
        if (mode == GameMode.Bingo)
        {
            Board = BingoLogicService.GenerateBoard();
            WinningLine = null;
            CurrentGameState = GameState.Playing;
        }
        else if (mode == GameMode.ScavengerHunt)
        {
            CurrentGameState = GameState.ScavengerHunt;
        }
        else if (mode == GameMode.CardDeck)
        {
            CurrentGameState = GameState.CardDeck;
        }
        
        ShowBingoModal = false;
        _ = SaveGameStateAsync();
        NotifyStateChanged();
    }

    public void HandleSquareClick(int squareId)
    {
        Board = BingoLogicService.ToggleSquare(Board, squareId);

        // Check for bingo after toggling
        if (WinningLine == null)
        {
            var bingo = BingoLogicService.CheckBingo(Board);
            if (bingo != null)
            {
                WinningLine = bingo;
                CurrentGameState = GameState.Bingo;
                ShowBingoModal = true;
            }
        }

        _ = SaveGameStateAsync();
        NotifyStateChanged();
    }

    public void ResetGame()
    {
        CurrentGameState = GameState.Start;
        Board = new();
        WinningLine = null;
        ShowBingoModal = false;
        _ = SaveGameStateAsync();
        NotifyStateChanged();
    }

    public void DismissModal()
    {
        ShowBingoModal = false;
        NotifyStateChanged();
    }

    private void NotifyStateChanged() => OnStateChanged?.Invoke();

    private async Task LoadGameStateAsync()
    {
        try
        {
            var saved = await _jsRuntime.InvokeAsync<string?>("localStorage.getItem", STORAGE_KEY);
            if (!string.IsNullOrEmpty(saved))
            {
                var data = JsonSerializer.Deserialize<StoredGameData>(saved);
                if (data != null && data.Version == STORAGE_VERSION)
                {
                    CurrentGameState = data.GameState;
                    CurrentGameMode = data.GameMode;
                    Board = data.Board;
                    WinningLine = data.WinningLine;
                }
            }
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Failed to load game state: {ex.Message}");
        }
    }

    private async Task SaveGameStateAsync()
    {
        try
        {
            var data = new StoredGameData
            {
                Version = STORAGE_VERSION,
                GameState = CurrentGameState,
                GameMode = CurrentGameMode,
                Board = Board,
                WinningLine = WinningLine
            };
            var json = JsonSerializer.Serialize(data);
            await _jsRuntime.InvokeVoidAsync("localStorage.setItem", STORAGE_KEY, json);
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Failed to save game state: {ex.Message}");
        }
    }

    private class StoredGameData
    {
        public int Version { get; set; }
        public GameState GameState { get; set; }
        public GameMode GameMode { get; set; }
        public List<BingoSquareData> Board { get; set; } = new();
        public BingoLine? WinningLine { get; set; }
    }
}
