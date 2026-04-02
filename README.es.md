<!-- l10n-sync: source-file="README.md" -->
# Soc Ops

Juego de Social Bingo para encuentros presenciales. ¡Encuentra personas que coincidan con las preguntas y consigue 5 en línea!

📚 **[Ver Guía del Lab](workshop/es/GUIDE.md)**

---

## 📚 Guía del Lab

| Parte | Título |
|-------|--------|
| [**00**](workshop/es/00-overview.md) | Descripción General y Lista de Verificación |
| [**01**](workshop/es/01-setup.md) | Configuración e Ingeniería de Contexto |
| [**02**](workshop/es/02-design.md) | Desarrollo Frontend Orientado al Diseño |
| [**03**](workshop/es/03-quiz-master.md) | Quiz Master Personalizado |
| [**04**](workshop/es/04-multi-agent.md) | Desarrollo Multi-Agente |

> 📝 Las guías del lab también están disponibles en la carpeta [`workshop/es/`](workshop/es/) para lectura sin conexión.

---

## Requisitos Previos

- [Java 21 JDK](https://adoptium.net/) o superior
- [Apache Maven 3.9+](https://maven.apache.org/) (o usa el Maven Wrapper incluido)

## Ejecutar

```bash
cd socops
./mvnw spring-boot:run
```

## Compilar

```bash
cd socops
./mvnw clean package
```

## Pruebas

```bash
cd socops
./mvnw test
```

Se despliega automáticamente a GitHub Pages con cada push a `main`.
