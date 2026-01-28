# 🎯 Soc Ops — Social Bingo

> **Break the ice, make connections, win at networking!**

Soc Ops is an interactive social bingo game designed for in-person mixers, team events, and conferences. Find people who match the prompts, mark your card, and race to get 5 in a row!

<p align="center">
  <img src="https://github.com/user-attachments/assets/2c6d0c33-72ec-47e8-b6bc-20837e7d830b" alt="Start Screen" width="300" />
  <img src="https://github.com/user-attachments/assets/4785afd4-c22a-4b1c-9b78-64d426c599e9" alt="Game Board" width="300" />
</p>

## ✨ Features

- 🎲 **Randomized boards** — Every player gets a unique arrangement
- 💾 **Auto-save progress** — Pick up where you left off
- 🏆 **Bingo detection** — Automatic win detection for rows, columns, and diagonals
- 🎉 **Celebration modal** — Confetti-worthy victory screen
- 📱 **Mobile-first** — Works great on phones at events

## 🚀 Quick Start

### Prerequisites
- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)

### Run Locally
```bash
cd SocOps
dotnet run
# Open http://localhost:5166
```

### Build
```bash
dotnet build SocOps/SocOps.csproj
```

## 🎨 Customize Your Game

### Change Questions
Edit `SocOps/Data/Questions.cs` to add your own icebreaker prompts:
```csharp
public static readonly List<string> QuestionsList = new()
{
    "has a pet",
    "speaks more than 2 languages",
    "your custom question here",
    // ... 24+ questions for a full board
};
```

### Workshop Guide
👉 Follow the [Lab Guide](.lab/GUIDE.md) for a hands-on workshop experience with GitHub Copilot agents.

## 🛠️ Tech Stack

- **Framework**: Blazor WebAssembly (.NET 10)
- **Styling**: Custom CSS utilities (Tailwind-inspired)
- **State**: Scoped services with localStorage persistence
- **Deployment**: GitHub Pages via Actions

## 📁 Project Structure

```
SocOps/
├── Components/     # BingoBoard, BingoSquare, Modals
├── Models/         # Game state & data models
├── Services/       # Game logic & state management
├── Data/           # Question bank
└── wwwroot/        # Static assets
```

## 🚢 Deployment

Automatically deploys to GitHub Pages on push to `main`:
- Your game: `https://{username}.github.io/{repo-name}`

## 📝 License

MIT — use it for your next event!
