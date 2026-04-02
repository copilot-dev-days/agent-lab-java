<!-- l10n-sync: source-file="01-setup.md" -->
# Parte 1: Configuración e Ingeniería de Contexto

[📚 Guía del Lab](https://copilot-dev-days.github.io/agent-lab-java/docs/) • [← Descripción General](00-overview.md)

---

> ⏱️ **Tiempo:** ~15 minutos

En esta sección, configurarás tu entorno de desarrollo y le enseñarás a GitHub Copilot sobre tu código.

---

## 🔧 Configuración Inicial

### Paso 1: Crea Tu Repositorio

1. Abre [github.com/copilot-dev-days/agent-lab-java](https://github.com/copilot-dev-days/agent-lab-java)
2. Haz clic en **Use this template** → **Create a new repository**
   - Nombre: `my-soc-ops-java`
   - Visibilidad: **Public**
3. ✅ ¡Tu propio repositorio de Soc Ops está listo!

### Paso 2: Habilita GitHub Pages

1. Ve a **Settings** → **Pages** de tu repositorio
2. En "Build and deployment", selecciona **GitHub Actions**
3. ✅ Cada commit se publicará automáticamente en: `https://{username}.github.io/{repo-name}`

### Paso 3: Elige Cómo Trabajarás (Clon Local o Codespace)

Después de crear tu propio repositorio, elige una opción:

#### Opción A: Clona Localmente en VS Code

1. Abre VS Code
2. Ejecuta el comando: `Git: Clone` → `Clone from GitHub`
3. Selecciona **tu nuevo repositorio** (no el repositorio de la plantilla)
4. Cuando se te solicite, instala las **extensiones recomendadas**

#### Opción B: Crea un Codespace para Tu Repositorio

1. Abre **tu nuevo repositorio** en GitHub
2. Haz clic en **Code** → **Codespaces**
3. Haz clic en **Create codespace on main**
4. Espera a que termine la configuración

### Paso 4: Ejecuta el Agente de Configuración

En el panel de Chat:

```
/setup
```

El agente:
- Detectará tu entorno
- Instalará las dependencias faltantes
- Iniciará el servidor de desarrollo

✅ **Éxito:** ¡La aplicación está corriendo en tu navegador!

---

## 📚 Entendiendo la Ingeniería de Contexto

La ingeniería de contexto es cómo le enseñas a la IA sobre tu código específico. Esto hace que las sugerencias de Copilot sean más precisas y relevantes.

### Tarea 1: Generar Instrucciones del Workspace

Las instrucciones guían todas las interacciones agénticas, haciéndolas eficientes y confiables.

**Pasos:**

1. Ejecuta el comando: `Chat: Generate Workspace Instructions File`
2. Espera a que el agente analice tu código
3. Revisa las instrucciones generadas (¡probablemente demasiado detalladas!)
4. Continúa con:
   ```
   Compress down by half and add a mandatory development checklist 
   (lint, build, test) to the top
   ```
5. **Haz commit** del archivo de instrucciones

✅ **Resultado:** Todas las solicitudes futuras tendrán un mapa básico de tu workspace.

---

### Tarea 2: Agentes en Segundo Plano para Trabajo en Paralelo

Los agentes en segundo plano se ejecutan en worktrees de git aislados — perfectos para tareas que no necesitan supervisión.

**Pasos:**

1. Haz clic en `+` en el Chat → **New background agent**
2. Escribe:
   ```
   Add linting rules for unused imports and code style; fix any errors
   ```
3. Déjalo correr, luego **Revisa** y **Aplica** los cambios
4. Haz clic derecho en la sesión para eliminarla cuando termines

**Prueba también un Agente en la Nube:**

1. Haz clic en `+` → **New cloud agent**
2. Escribe:
   ```
   Make the README more engaging as a landing page to the project
   ```

✅ **Resultado:** Reglas de linting agregadas, errores corregidos, README mejorado — ¡todo fusionado de vuelta a main!

---

### Tarea 3: Explora las Instrucciones Existentes

Tu repositorio viene con instrucciones preconfiguradas que ayudan a la IA a entender el proyecto.

#### Instrucciones de Utilidades CSS

📄 Consulta `.github/instructions/css-utilities.instructions.md`

Estas documentan las clases CSS personalizadas tipo Tailwind disponibles en este proyecto Spring Boot.

> 💡 **Opcional:** Elimina el texto principal y vuelve a ejecutar el prompt para ver cómo se genera

#### Instrucciones de Diseño Frontend

📄 Consulta `.github/instructions/frontend-design.instructions.md`

Las instrucciones de "no purple gradients" desafían al agente a pensar como un diseñador.

> 💡 **Piensa en esto:** ¿Qué otros sesgos de la IA podrías desafiar y corregir?

---

## ✅ ¡Parte 1 Completa!

Aprendiste a:
- Configurar tu entorno de desarrollo
- Generar y refinar instrucciones del workspace
- Usar agentes en segundo plano y en la nube para trabajo en paralelo
- Entender los archivos de instrucciones existentes
