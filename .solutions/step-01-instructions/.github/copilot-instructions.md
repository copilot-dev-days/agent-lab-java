# Copilot Workspace Instructions

## Development Checklist

Before committing any changes, ensure:

- [ ] `dotnet build` passes with no errors
- [ ] `dotnet test` passes (when tests exist)
- [ ] Code follows C# conventions (PascalCase for public members)
- [ ] No unused variables or imports

## Project Overview

**Soc Ops** is a Social Bingo game built with Blazor WebAssembly (.NET 10). Players find people who match questions to mark squares and get 5 in a row.

## Architecture

```
SocOps/
├── Components/     # Reusable Blazor components
│   ├── BingoBoard.razor
│   ├── BingoSquare.razor
│   ├── BingoModal.razor
│   ├── GameScreen.razor
│   └── StartScreen.razor
├── Models/         # Data models (BingoSquareData, GameState)
├── Services/       # Business logic
│   ├── BingoGameService.cs    # State management
│   └── BingoLogicService.cs   # Game logic
├── Data/           # Static data (Questions.cs)
├── Pages/          # Routable pages (Home.razor)
└── wwwroot/        # Static assets & CSS
```

## Key Commands

```bash
dotnet build SocOps/SocOps.csproj  # Build
dotnet run --project SocOps       # Run dev server (port 5166)
dotnet test                        # Run tests
```

## Styling

Uses custom CSS utility classes (Tailwind-like) in `wwwroot/css/app.css`:
- Layout: `.flex`, `.grid`, `.items-center`
- Spacing: `.p-4`, `.mb-2`, `.mx-auto`
- Colors: `.bg-accent`, `.bg-marked`, `.text-gray-700`

## State Management

- `BingoGameService` manages game state with event-driven updates
- State persisted to localStorage via JSInterop
- Components subscribe to `OnStateChanged` event
