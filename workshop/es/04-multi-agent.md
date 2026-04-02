<!-- l10n-sync: source-file="04-multi-agent.md" -->
# Parte 4: Desarrollo Multi-Agente

[📚 Guía del Lab](GUIDE.md) • [← Parte 3](03-quiz-master.md)

---

> ⏱️ **Tiempo:** ~20 minutos

Construye nuevas funcionalidades usando agentes especializados: agentes TDD para código confiable y agentes de diseño para una UI atractiva.

---

## 🧪 Tarea 1: Modo Búsqueda del Tesoro (con TDD)

Los agentes personalizados con transferencias dividen flujos de trabajo complejos en pasos más pequeños, manteniéndote en control para las decisiones críticas.

### Qué Vamos a Construir

Un nuevo modo de **Búsqueda del Tesoro**:
- Las mismas preguntas que el bingo
- Mostradas como una lista simple con checkboxes
- Medidor de progreso en la parte superior
- Clic para marcar los elementos como completados

### Pasos

#### Fase 1: Planificar

1. Inicia un nuevo Chat en **Plan Mode**
2. Escribe:
   ```
   Add a new Scavenger Hunt mode: same questions, but shown as a 
   simple list with checkboxes and a progress meter
   ```
3. **Itera sobre el plan** — verifica que:
   - ✅ Agregue el modo a la pantalla de inicio
   - ✅ Cree un nuevo componente para la vista de lista
   - ✅ Incluya un indicador de progreso
   - ❌ No se exceda con funcionalidades

#### Fase 2: TDD Red (Escribir Pruebas que Fallen)

1. Selecciona el agente **TDD Red**
2. Haz clic en **Start**
3. Observa cómo escribe pruebas para:
   - Renderizado de componentes
   - Interacciones con checkboxes
   - Cálculo de progreso
   - Manejo de estado

4. Revisa el **Test Explorer** de VS Code para ver las pruebas fallando

#### Fase 3: TDD Green (Hacer que las Pruebas Pasen)

1. Cuando Red termine, selecciona el agente **TDD Green**
2. Observa cómo:
   - Implementa el código mínimo para pasar las pruebas
   - Ejecuta las pruebas después de cada cambio
   - Itera hasta que todas las pruebas pasen

#### Fase 4: Refactorizar (Limpiar)

1. Selecciona el agente **TDD Refactor**
2. Déjalo limpiar el código mientras mantiene las pruebas en verde

### Recuperación con Checkpoints

Si algo sale mal:
1. Usa los **Checkpoints** del Chat para revertir
2. Regresa al punto antes de que "TDD Red" comenzara
3. Intenta de nuevo con prompts ajustados

> 💡 **Bonus:** Prueba **TDD Supervisor** para un flujo TDD completamente automatizado

✅ **Resultado:** ¡Una funcionalidad de Búsqueda del Tesoro completamente probada, construida con TDD disciplinado!

---

## 🎴 Tarea 2: Modo Baraja de Cartas (Orientado al Diseño)

Usa el agente **Pixel Jam** para enfocarte en la iteración de UI mientras construyes nuevas funcionalidades.

### Qué Vamos a Construir

Un nuevo modo de **Card Deck Shuffle**:
- El jugador abre el juego
- Toca para obtener una carta aleatoria
- La carta se voltea con una animación
- Muestra una pregunta para discutir

### Pasos

1. Inicia un nuevo Chat
2. Selecciona **Pixel Jam** como agente
3. Escribe:
   ```
   New mode: Card Deck Shuffle. Every player opens the game, 
   taps, and gets a random card with a question
   ```
4. Observa cómo itera sobre la UI
5. Da seguimiento para refinar:
   ```
   Add a cool 3D flip animation when revealing the card
   ```
   ```
   Make the card styling match the cyberpunk theme
   ```
6. **Haz commit** cuando estés satisfecho

### Qué Hace Pixel Jam de Manera Diferente

- Se enfoca en el **diseño visual** primero
- Itera sobre **UI/UX** antes de la lógica
- Usa las instrucciones de diseño frontend
- Crea interfaces pulidas y animadas

---

## 🔍 Tarea 3: Agente de Revisión UX

Combina herramientas MCP, flujos personalizados y aislamiento de subagentes para capacidades de revisión potentes.

### Pasos

1. Inicia un nuevo Chat con **Pixel Jam**
2. Escribe:
   ```
   Run review
   ```
3. Cuando se te solicite, haz clic en **Allow for this Workspace** para el acceso a la herramienta Playwright
4. Observa cómo:
   - Toma capturas de pantalla de cada página
   - Analiza problemas de usabilidad
   - Verifica accesibilidad
   - Revisa consistencia visual

### Qué Se Revisa

| Categoría | Verificaciones |
|-----------|----------------|
| **Usabilidad** | Flujo de navegación, claridad de botones, retroalimentación |
| **Accesibilidad** | Contraste de color, navegación por teclado, lectores de pantalla |
| **Visual** | Consistencia, espaciado, alineación |
| **Interacción** | Áreas táctiles, estados hover, animaciones |

### Acciones de Seguimiento

Después de la revisión:
```
File the critical findings as GitHub issues
```
```
Fix the accessibility issues you found
```
```
Assign the navigation bug to a background agent
```

✅ **Resultado:** ¡Una revisión UX completa con hallazgos accionables!

---

## 🎯 Desafíos Bonus

Si tienes tiempo, prueba estos:

| Desafío | Enfoque |
|---------|---------|
| Corregir problemas de UX | Delegar a un agente en segundo plano o en la nube |
| Múltiples temas | Agregar un selector de temas a la pantalla de inicio |
| Compartir en redes | Agregar botón de compartir al estado de victoria |
| Tabla de posiciones | Registrar y mostrar las puntuaciones más altas |
| Efectos de sonido | Agregar retroalimentación de audio para las interacciones |

---

## ✅ ¡Parte 4 Completa!

Aprendiste a:
- Usar agentes TDD para desarrollo guiado por pruebas
- Construir funcionalidades con el ciclo Red-Green-Refactor
- Usar agentes enfocados en diseño como Pixel Jam
- Ejecutar revisiones UX completas
- Combinar múltiples agentes para flujos de trabajo complejos

---

## 🎉 ¡Workshop Completado!

¡Felicidades! Completaste el VS Code GitHub Copilot Agent Lab.

### Lo que Construiste

- ✅ Una aplicación de Social Bingo completamente rediseñada
- ✅ Temas de quiz personalizados
- ✅ Modo Búsqueda del Tesoro (construido con TDD)
- ✅ Modo Card Deck Shuffle (orientado al diseño)

### Lo que Aprendiste

1. **Ingeniería de Contexto** — Enseñarle a la IA sobre tu código
2. **Primitivas Agénticas** — Agentes en segundo plano, en la nube y personalizados
3. **Desarrollo Orientado al Diseño** — Iteración de UI con asistencia de IA
4. **Desarrollo Guiado por Pruebas** — Código confiable con agentes TDD

### Sigue Adelante

- 📺 [VS Code en YouTube](https://www.youtube.com/code)
- 📖 [VS Code Copilot Docs](https://code.visualstudio.com/docs/copilot/overview)
- 🌟 [Awesome Copilot](https://github.com/github/awesome-copilot)
