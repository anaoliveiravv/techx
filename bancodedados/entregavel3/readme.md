#md
# 📚 Sistema de Biblioteca

## Descrição

Este projeto apresenta o modelo lógico de um sistema de biblioteca, utilizando as entidades **Usuário**, **Livro** e **Empréstimo**.

O modelo foi estruturado e normalizado até a **Terceira Forma Normal (3FN)**.

## Entidades

### Usuário

- `id_usuario` — Chave Primária (PK)
- `nome`
- `email`

### Livro

- `id_livro` — Chave Primária (PK)
- `titulo`
- `isbn`

### Empréstimo

- `id_emprestimo` — Chave Primária (PK)
- `data_emprestimo`
- `data_devolucao`
- `id_usuario` — Chave Estrangeira (FK)
- `id_livro` — Chave Estrangeira (FK)

## Relacionamentos

- Um usuário pode realizar vários empréstimos.
- Cada empréstimo pertence a apenas um usuário.
- Um livro pode aparecer em vários empréstimos ao longo do tempo.
- Cada empréstimo está relacionado a apenas um livro.

## Normalização até 3FN

### 1FN — Primeira Forma Normal

Todos os atributos possuem valores atômicos, ou seja, cada campo armazena apenas um valor.

### 2FN — Segunda Forma Normal

Todos os atributos dependem completamente da chave primária de sua respectiva tabela.

### 3FN — Terceira Forma Normal

Não existem dependências entre atributos que não sejam chave.

Os dados dos usuários são armazenados apenas na tabela `usuario`, os dados dos livros apenas na tabela `livro` e os dados referentes aos empréstimos ficam na tabela `emprestimo`.

Dessa forma, evitamos duplicação de informações e mantemos o banco de dados mais organizado.
