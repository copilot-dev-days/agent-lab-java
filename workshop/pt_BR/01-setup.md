<!-- l10n-sync: source-file="01-setup.md" -->
# Parte 1: Configuração & Engenharia de Contexto

[📚 Guia do Lab](https://copilot-dev-days.github.io/agent-lab-java/docs/) • [← Visão Geral](00-overview.md)

---

> ⏱️ **Tempo:** ~15 minutos

Nesta seção, você vai configurar seu ambiente de desenvolvimento e ensinar o GitHub Copilot sobre seu codebase.

---

## 🔧 Configuração Inicial

### Passo 1: Crie Seu Repositório

1. Abra [github.com/copilot-dev-days/agent-lab-java](https://github.com/copilot-dev-days/agent-lab-java)
2. Clique em **Use this template** → **Create a new repository**
   - Nome: `my-soc-ops-java`
   - Visibilidade: **Public**
3. ✅ Seu próprio repositório Soc Ops está pronto!

### Passo 2: Ative o GitHub Pages

1. Vá para **Settings** → **Pages** do seu repositório
2. Em "Build and deployment", selecione **GitHub Actions**
3. ✅ Cada commit agora será publicado em: `https://{username}.github.io/{repo-name}`

### Passo 3: Escolha Como Você Vai Trabalhar (Clone Local ou Codespace)

Depois de criar seu próprio repositório, escolha uma opção:

#### Opção A: Clone Localmente no VS Code

1. Abra o VS Code
2. Execute o comando: `Git: Clone` → `Clone from GitHub`
3. Selecione **seu novo repositório** (não o repositório do template)
4. Quando solicitado, instale as **extensões recomendadas**

#### Opção B: Crie um Codespace para Seu Repositório

1. Abra **seu novo repositório** no GitHub
2. Clique em **Code** → **Codespaces**
3. Clique em **Create codespace on main**
4. Aguarde a configuração terminar

### Passo 4: Execute o Agente de Configuração

No painel de Chat:

```
/setup
```

O agente vai:
- Detectar seu ambiente
- Instalar dependências faltantes
- Iniciar o servidor de desenvolvimento

✅ **Sucesso:** O app está rodando no seu navegador!

---

## 📚 Entendendo a Engenharia de Contexto

Engenharia de contexto é como você ensina a IA sobre seu codebase específico. Isso torna as sugestões do Copilot mais precisas e relevantes.

### Tarefa 1: Gerar Instruções do Workspace

Instruções orientam todas as interações agênticas, tornando-as eficientes e confiáveis.

**Passos:**

1. Execute o comando: `Chat: Generate Workspace Instructions File`
2. Aguarde o agente analisar seu codebase
3. Revise as instruções geradas (provavelmente muito detalhadas!)
4. Continue com:
   ```
   Compress down by half and add a mandatory development checklist 
   (lint, build, test) to the top
   ```
5. **Faça commit** do arquivo de instruções

✅ **Resultado:** Todas as futuras requisições terão um mapa básico do seu workspace.

---

### Tarefa 2: Agentes em Segundo Plano para Trabalho Paralelo

Agentes em segundo plano rodam em worktrees git isolados — perfeitos para tarefas que não precisam de supervisão.

**Passos:**

1. Clique em `+` no Chat → **New background agent**
2. Digite:
   ```
   Add linting rules for unused imports and code style; fix any errors
   ```
3. Deixe rodar, depois **Revise** e **Aplique** as mudanças
4. Clique com o botão direito na sessão para deletá-la quando terminar

**Experimente um Agente na Nuvem também:**

1. Clique em `+` → **New cloud agent**
2. Digite:
   ```
   Make the README more engaging as a landing page to the project
   ```

✅ **Resultado:** Regras de linting adicionadas, erros corrigidos, README melhorado — tudo integrado de volta ao main!

---

### Tarefa 3: Explore as Instruções Existentes

Seu repositório já vem com instruções pré-configuradas que ajudam a IA a entender o projeto.

#### Instruções de Utilitários CSS

📄 Veja `.github/instructions/css-utilities.instructions.md`

Estas documentam as classes CSS estilo Tailwind disponíveis neste projeto Spring Boot.

> 💡 **Opcional:** Delete o texto principal e re-execute o prompt para ver como ele gera

#### Instruções de Design do Frontend

📄 Veja `.github/instructions/frontend-design.instructions.md`

As instruções "sem gradientes roxos" desafiam o agente a pensar como um designer.

> 💡 **Pense sobre:** Que outros vieses da IA você poderia desafiar e direcionar?

---

## ✅ Parte 1 Completa!

Você aprendeu como:
- Configurar seu ambiente de desenvolvimento
- Gerar e refinar instruções do workspace
- Usar agentes em segundo plano e na nuvem para trabalho paralelo
- Entender arquivos de instruções existentes
