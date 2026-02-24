# 🎯 Soc Ops — Social Bingo

> **Break the ice, make connections, win at networking!**

Soc Ops is an interactive social bingo game designed for in-person mixers, team events, and conferences. Find people who match the prompts, mark your card, and race to get 5 in a row!

## ✨ Features

- 🎲 **Randomized boards** — Every player gets a unique arrangement
- 💾 **Auto-save progress** — Pick up where you left off (localStorage)
- 🏆 **Bingo detection** — Automatic win detection for rows, columns, and diagonals
- 🎉 **Celebration modal** — Confetti-worthy victory screen
- 📱 **Mobile-first** — Works great on phones at events

## 🚀 Quick Start

### Prerequisites
- [Java 21 JDK](https://adoptium.net/) or higher
- [Apache Maven 3.9+](https://maven.apache.org/) (or use the included Maven Wrapper)

### Run Locally
```bash
cd socops
./mvnw spring-boot:run
# Open http://localhost:8080
```

### Build
```bash
cd socops
./mvnw clean package
```

### Test
```bash
cd socops
./mvnw test
```

## 🎨 Customize Your Game

### Change Questions
Edit `socops/src/main/java/com/socops/data/IcebreakerPrompts.java` to add your own icebreaker prompts:
```java
public static final List<String> ALL_PROMPTS = List.of(
    "has a pet",
    "speaks more than 2 languages",
    "your custom question here",
    // ... 24 questions for a full board
);
```

### Workshop Guide
👉 Follow the [Lab Guide](workshop/GUIDE.md) for a hands-on workshop experience with GitHub Copilot agents.

## 🛠️ Tech Stack

- **Runtime**: Java 21
- **Framework**: Spring Boot 3.4.2 with Thymeleaf
- **Styling**: Custom CSS utilities (Tailwind-inspired)
- **State**: Client-side JavaScript with localStorage persistence
- **Build**: Apache Maven with Maven Wrapper
- **Deployment**: GitHub Pages via Actions

## 📁 Project Structure

```
socops/
├── src/main/java/com/socops/
│   ├── web/            # Controllers & REST endpoints
│   ├── model/          # Game records & enums
│   ├── service/        # Board assembly & game logic
│   └── data/           # Question bank
├── src/main/resources/
│   ├── templates/      # Thymeleaf templates
│   └── static/         # CSS & static assets
└── src/test/           # Unit tests
```

## 🚢 Deployment

Automatically deploys to GitHub Pages on push to `main`:
- Your game: `https://{username}.github.io/{repo-name}`

## 📝 License

MIT — use it for your next event!
