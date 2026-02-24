# Soc Ops

Social Bingo game for in-person mixers. Find people who match the questions and get 5 in a row!

📚 **[View Lab Guide](workshop/GUIDE.md)**

---

## 📚 Lab Guide

| Part | Title |
|------|-------|
| [**00**](workshop/00-overview.md) | Overview & Checklist |
| [**01**](workshop/01-setup.md) | Setup & Context Engineering |
| [**02**](workshop/02-design.md) | Design-First Frontend |
| [**03**](workshop/03-quiz-master.md) | Custom Quiz Master |
| [**04**](workshop/04-multi-agent.md) | Multi-Agent Development |

> 📝 Lab guides are also available in the [`workshop/`](workshop/) folder for offline reading.

---

## Prerequisites

- [Java 21 JDK](https://adoptium.net/) or higher
- [Apache Maven 3.9+](https://maven.apache.org/) (or use the included Maven Wrapper)

## Run

```bash
cd socops
./mvnw spring-boot:run
```

## Build

```bash
cd socops
./mvnw clean package
```

## Test

```bash
cd socops
./mvnw test
```

Deploys automatically to GitHub Pages on push to `main`.
