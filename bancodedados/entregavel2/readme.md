#md
# 📚 Sistema de Biblioteca

## Descrição

Modelo conceitual simplificado de um sistema de biblioteca para controlar usuários, livros e empréstimos.

## Entidades e Atributos

### Usuário
- id_usuario — Chave Primária
- nome
- email

### Livro
- id_livro — Chave Primária
- titulo
- isbn

### Empréstimo
- id_emprestimo — Chave Primária
- data_emprestimo
- data_devolucao
- id_usuario
- id_livro

## Relacionamentos

- **Usuário (1) — (N) Empréstimo**
  - Um usuário pode realizar vários empréstimos.

- **Livro (1) — (N) Empréstimo**
  - Um livro pode aparecer em vários empréstimos ao longo do tempo.
