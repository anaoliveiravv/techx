CREATE TABLE usuario (
    id_usuario SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE livro (
    id_livro SERIAL PRIMARY KEY,
    titulo VARCHAR(150) NOT NULL,
    isbn VARCHAR(20) UNIQUE
);

CREATE TABLE emprestimo (
    id_emprestimo SERIAL PRIMARY KEY,
    data_emprestimo DATE NOT NULL DEFAULT CURRENT_DATE,
    data_devolucao DATE,

    id_usuario INT NOT NULL,
    id_livro INT NOT NULL,

    FOREIGN KEY (id_usuario)
        REFERENCES usuario(id_usuario),

    FOREIGN KEY (id_livro)
        REFERENCES livro(id_livro)
);

INSERT INTO usuario (nome, email)
VALUES ('Pedro', 'pedro@email.com');

INSERT INTO usuario (nome, email)
VALUES ('Ana', 'ana@email.com');

INSERT INTO usuario (nome, email)
VALUES ('Joao', 'joao@email.com');

INSERT INTO livro (titulo, isbn)
VALUES ('Dom Casmurro', '9788535914849');

INSERT INTO livro (titulo, isbn)
VALUES ('O Pequeno Principe', '9788595081512');

INSERT INTO livro (titulo, isbn)
VALUES ('1984', '9788535914840');

INSERT INTO emprestimo (id_usuario, id_livro)
VALUES (1, 1);

INSERT INTO emprestimo (id_usuario, id_livro)
VALUES (2, 2);

INSERT INTO emprestimo (id_usuario, id_livro)
VALUES (3, 3);

SELECT
    u.nome,
    l.titulo,
    e.data_emprestimo
FROM emprestimo e
INNER JOIN usuario u
    ON e.id_usuario = u.id_usuario
INNER JOIN livro l
    ON e.id_livro = l.id_livro;

SELECT
    u.nome,
    l.titulo,
    e.data_devolucao
FROM emprestimo e
INNER JOIN usuario u
    ON e.id_usuario = u.id_usuario
INNER JOIN livro l
    ON e.id_livro = l.id_livro
WHERE e.data_devolucao IS NULL;