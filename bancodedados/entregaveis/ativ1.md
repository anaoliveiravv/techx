# Sistema de Biblioteca

## 1. Cenário

O sistema tem como objetivo gerenciar uma biblioteca, permitindo o cadastro de leitores e livros, além do registro dos empréstimos realizados.

## 2. Requisitos

- Cadastrar leitores.
- Cadastrar livros disponíveis na biblioteca.
- Registrar empréstimos realizados pelos leitores.
- Permitir que um leitor realize vários empréstimos.
- Permitir que diferentes livros sejam registrados nos empréstimos.

## 3. Entidades e Atributos

### Leitor

- **id_leitor (Chave Primária)**
- nome
- email
- data_nascimento

### Livro

- **id_livro (Chave Primária)**
- titulo
- autor
- genero

### Empréstimo

- **id_emprestimo (Chave Primária)**
- data_emprestimo
- data_devolucao
- **id_leitor (Chave Estrangeira)**
- **id_livro (Chave Estrangeira)**

## 4. Relacionamentos e Cardinalidade

### Leitor e Empréstimo — 1:N

Um **leitor pode realizar vários empréstimos**, enquanto cada **empréstimo pertence a apenas um leitor**.

**Cardinalidade:** Leitor **1:N** Empréstimo.

### Livro e Empréstimo — 1:N

Um **livro pode aparecer em vários empréstimos**, enquanto cada **empréstimo está relacionado a apenas um livro**.

**Cardinalidade:** Livro **1:N** Empréstimo.

## 5. Resumo dos Relacionamentos

- **Leitor → Empréstimo:** 1:N
- **Empréstimo → Leitor:** N:1
- **Livro → Empréstimo:** 1:N
- **Empréstimo → Livro:** N:1