<!-- l10n-sync: source-file="02-design.md" -->
# Parte 2: Desarrollo Frontend Orientado al Diseño

[📚 Guía del Lab](https://copilot-dev-days.github.io/agent-lab-java/docs/) • [← Parte 1](01-setup.md)

---

> ⏱️ **Tiempo:** ~15 minutos

Ahora que el contexto de tu repositorio está configurado, ¡vamos a ser creativos! Rediseñarás toda la UI usando desarrollo asistido por IA.

---

## 🎨 Tarea 1: Hazlo Tuyo

Usa **Plan Mode** para comenzar cualquier tarea más grande. Itera sobre el plan (¡2 o más veces!) con ajustes y aclaraciones.

### Pasos

1. En el Chat, cambia a **Plan Mode** (botón en la parte inferior)
2. Escribe tu visión:
   ```
   Let's do a full redesign. Make it [YOUR THEME]
   ```
3. Revisa el plan generado
4. Pide ajustes hasta que estés satisfecho
5. Haz clic en **Implement** para ejecutar

### 🎭 Ideas de Temas

Elige uno que te inspire:

| Categoría | Temas |
|-----------|-------|
| **Minimal** | Minimalist Mono, Scandinavian Calm, Desert Sand Minimal |
| **Retro** | Retro Terminal Green, Pixel Arcade Style, Vaporwave Sunset |
| **Dark** | Cyberpunk Neon, Dark Mode Noir, Space Galaxy Glow |
| **Playful** | Playful Candy Pop, Toybox Primary Colors, Anime Bubble |
| **Professional** | Corporate Clean Blue, Gradient Glass UI, Metallic Chrome |
| **Creative** | Brutalist Blocks, Geometric Memphis, Bold Constructivist |
| **Cozy** | Cozy Coffee Shop, Soft Pastel Clouds, Notebook Doodle |
| **Unique** | Skeuomorphic Stickers, Paper Card Cutouts, Chalkboard |

✅ **Resultado:** Las instrucciones del frontend y las utilidades CSS se combinan para crear un diseño hermoso.

---

## 📝 Tarea 2: Mantén las Instrucciones Actualizadas

Cuando hagas cambios importantes en la arquitectura, el diseño o las dependencias, ¡actualiza tus instrucciones!

### Pasos

1. Después de tu rediseño, continúa con:
   ```
   Add a design guide section to copilot-instructions.md
   ```
2. Revisa los cambios
3. **Haz commit y push**

> 💡 ¡Verifica que GitHub Pages se esté actualizando con tu nuevo diseño!

---

## 🚀 Tarea 3: Escala la Exploración con Agentes en la Nube

Genera múltiples variaciones de diseño en paralelo usando agentes en la nube.

### Pasos

1. Inicia un **nuevo Chat** en Plan Mode
2. Escribe:
   ```
   Redesign the start screen as a more engaging landing page
   ```
3. Observa las variaciones sugeridas en el plan
4. Ejecuta el prompt de exploración:
   ```
   /cloud-explore design variations
   ```
   📄 Consulta `.github/prompts/cloud-explore.prompt.md`

5. Revisa **Agent Sessions** para seguir los 3 nuevos agentes en la nube
6. Haz clic en cualquier sesión para seguir el progreso o abrir en la web

### Qué Está Pasando

El prompt inicia **3 agentes en la nube en paralelo**, cada uno explorando una dirección de diseño diferente. Ellos:
- Crean ramas
- Implementan variaciones
- Toman capturas de pantalla
- Abren PRs para tu revisión

✅ **Resultado:** ¡3 variaciones de diseño para comparar, todas ejecutándose en paralelo!

> ⏰ Esto toma unos minutos. Continúa con la Parte 3 mientras se ejecutan.

---

## 🖼️ Galería de Diseño

Así se ve el tema **Cyberpunk Neon**:

```
┌─────────────────────────────────────────────┐
│  ╔═══════════════════════════════════════╗  │
│  ║     🎮 SOC OPS - SOCIAL BINGO 🎮      ║  │
│  ╚═══════════════════════════════════════╝  │
│                                             │
│  ┌─────┬─────┬─────┬─────┬─────┐          │
│  │ ▓▓▓ │ ░░░ │ ▓▓▓ │ ░░░ │ ▓▓▓ │          │
│  ├─────┼─────┼─────┼─────┼─────┤          │
│  │ ░░░ │ ▓▓▓ │ ░░░ │ ▓▓▓ │ ░░░ │  NEON   │
│  ├─────┼─────┼─────┼─────┼─────┤  GLOW   │
│  │ ▓▓▓ │ ░░░ │ ★★★ │ ░░░ │ ▓▓▓ │          │
│  ├─────┼─────┼─────┼─────┼─────┤          │
│  │ ░░░ │ ▓▓▓ │ ░░░ │ ▓▓▓ │ ░░░ │          │
│  ├─────┼─────┼─────┼─────┼─────┤          │
│  │ ▓▓▓ │ ░░░ │ ▓▓▓ │ ░░░ │ ▓▓▓ │          │
│  └─────┴─────┴─────┴─────┴─────┘          │
│                                             │
│         [ 🔄 NEW GAME ]  [ 🎯 BINGO! ]      │
└─────────────────────────────────────────────┘
```

---

## ✅ ¡Parte 2 Completa!

Aprendiste a:
- Usar Plan Mode para tareas de diseño complejas
- Iterar sobre planes antes de implementar
- Mantener las instrucciones actualizadas con los cambios
- Escalar la exploración con agentes en la nube en paralelo
