<!-- l10n-sync: source-file="README.md" -->
# Soc Ops

Jogo de Social Bingo para encontros presenciais. Encontre pessoas que correspondam às perguntas e faça 5 em linha!

📚 **[Ver Guia do Lab](workshop/pt_BR/GUIDE.md)**

---

## 📚 Guia do Lab

| Parte | Título |
|-------|--------|
| [**00**](workshop/pt_BR/00-overview.md) | Visão Geral & Lista Rápida |
| [**01**](workshop/pt_BR/01-setup.md) | Configuração & Engenharia de Contexto |
| [**02**](workshop/pt_BR/02-design.md) | Frontend Design-First |
| [**03**](workshop/pt_BR/03-quiz-master.md) | Quiz Master Personalizado |
| [**04**](workshop/pt_BR/04-multi-agent.md) | Desenvolvimento Multi-Agente |

> 📝 Os guias do lab também estão disponíveis na pasta [`workshop/pt_BR/`](workshop/pt_BR/) para leitura offline.

---

## Pré-requisitos

- [Java 21 JDK](https://adoptium.net/) ou superior
- [Apache Maven 3.9+](https://maven.apache.org/) (ou use o Maven Wrapper incluído)

## Executar

```bash
cd socops
./mvnw spring-boot:run
```

## Build

```bash
cd socops
./mvnw clean package
```

## Testes

```bash
cd socops
./mvnw test
```

O deploy é feito automaticamente no GitHub Pages ao fazer push para `main`.
