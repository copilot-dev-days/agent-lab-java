<!-- l10n-sync: source-file="03-quiz-master.md" -->
# Parte 3: Quiz Master Personalizado

[📚 Guia do Lab](GUIDE.md) • [← Parte 2](02-design.md)

---

> ⏱️ **Tempo:** ~10 minutos

Crie seus próprios temas de quiz especializados usando agentes personalizados — workflows que vão além de prompts genéricos de código.

---

## 🎲 Entendendo Agentes Personalizados

Agentes personalizados são definidos em `.github/agents/` e oferecem:
- **Conhecimento especializado** para tarefas específicas
- **Workflows consistentes** para processos repetíveis
- **Contexto focado** que melhora a qualidade do resultado

📄 Confira: `.github/agents/quiz-master.agent.md`

---

## 🎯 Tarefa: Seu Próprio Quiz Master

### Passos

1. Inicie um **novo Chat**
2. Selecione **Quiz Master** como o agente personalizado (no seletor de agentes)
3. Digite seu tema:
   ```
   Update questions to [YOUR THEME]
   ```
   Ou simplesmente:
   ```
   Update quiz
   ```

4. Revise as perguntas geradas
5. Peça mais criatividade:
   ```
   Make them more chaotic and unexpected!
   ```

### 🎭 Ideias de Temas

| Categoria | Temas |
|-----------|-------|
| **Profissional** | Skill Bingo, Team Bingo, Work Culture Bingo |
| **Pessoal** | Personality Bingo, Lifestyle Bingo, Travel Bingo |
| **Tech** | Tech Life Bingo, Fandom Bingo, Dev Memes Bingo |
| **Interativo** | Secret Challenge Bingo, Micro-Challenge Bingo, Mystery Bingo |
| **Diversão** | Office Humor Bingo, Chaos Bingo, Opposites Bingo |
| **Profundo** | Deep Chat Bingo, Creative Bingo, Reflective Bingo |

### Descrições dos Temas

- **Skill Bingo** — Habilidades profissionais ou técnicas no lugar de fatos pessoais
- **Personality Bingo** — Preferências, manias e características divertidas
- **Secret Challenge Bingo** — Micro-tarefas rápidas com pessoas que você conhecer
- **Team Bingo** — Categorias por departamento ou equipe
- **Tech Life Bingo** — Linguagens de programação, atalhos, frameworks, memes de dev
- **Chaos Bingo** — Prompts surpreendentes, absurdos e imprevisíveis
- **Opposites Bingo** — Encontre alguém que é seu oposto em eixos específicos

---

## ☁️ Tarefa: Geração de Quiz na Nuvem

Execute o Quiz Master como agente na nuvem para geração assíncrona.

### Passos

1. Clique em `+` → **New cloud agent**
2. Selecione **Quiz Master**
3. Digite um tema diferente:
   ```
   Create a Tech Life Bingo with questions about 
   coding habits, IDE preferences, and developer culture
   ```
4. Deixe rodar em segundo plano
5. Revise o PR quando estiver pronto

✅ **Resultado:** O agente personalizado gera perguntas criativas e temáticas enquanto você continua trabalhando.

---

## 📝 Exemplo de Resultado: Tech Life Bingo

Veja o que um tema Tech Life pode gerar:

```
┌────────────────────────────────────────────────┐
│  Uses dark mode     │  Has 50+ browser tabs   │
│  for everything     │  open right now         │
├────────────────────────────────────────────────┤
│  Knows vim          │  Has a mechanical       │
│  keybindings        │  keyboard               │
├────────────────────────────────────────────────┤
│  Prefers tabs       │  Has strong opinions    │
│  over spaces        │  about semicolons       │
├────────────────────────────────────────────────┤
│  Uses AI to write   │  Has a dotfiles         │
│  commit messages    │  repository             │
└────────────────────────────────────────────────┘
```

---

## 💡 Dicas

1. **Seja específico** — "Faça perguntas sobre cultura de startup" funciona melhor que "faça engraçado"
2. **Itere** — Continue refinando o tom e a criatividade
3. **Misture temas** — "Combine Tech Life com Chaos Bingo" para resultados inesperados
4. **Teste localmente** — Rode o app para ver como as perguntas ficam no grid do bingo

---

## ✅ Parte 3 Completa!

Você aprendeu como:
- Usar agentes personalizados para workflows especializados
- Gerar perguntas de quiz temáticas
- Executar agentes personalizados na nuvem
- Iterar no resultado do agente para melhores resultados
