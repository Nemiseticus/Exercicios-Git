CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

CREATE TABLE tb_categoria(
id BIGINT AUTO_INCREMENT,
nome VARCHAR(10) NOT NULL,
matricula int(10) NOT NULL,
ativo BOOLEAN,
PRIMARY KEY(id)
);

CREATE TABLE tb_produto(
id BIGINT AUTO_INCREMENT,
curso VARCHAR(20) NOT NULL,
periodo VARCHAR(20) NOT NULL,
ativo BOOLEAN,
categoria_id BIGINT,
PRIMARY KEY(id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);


INSERT INTO tb_categoria(nome, matricula, ativo) VALUES
("Felipe", 0293847, true),
("Paula", 083847, true),
("Pedro", 0233847, true),
("Helder", 053847, true),
("Igones", 0293347, true),
("Angela", 0256847, true),
("Yuri", 090847, true),
("Mariana", 0343847, true);

INSERT INTO tb_produto(curso, periodo, ativo, categoria_id) VALUES
("DesenvolvedorJava", "Integral", TRUE, 1),
("ProgramadorGame", "Integral", TRUE, 2),
("DesenvolvedorPHP", "Integral", TRUE, 3),
("Desenvolvedor", "Integral", TRUE, 4),
("Engenharia", "Integral", TRUE, 5),
("Farmacia", "Integral", TRUE, 1),
("Teologia", "Integral", TRUE, 2),
("Administração", "Integral", TRUE, 3);


SELECT * FROM tb_produto WHERE curso >50;
SELECT * FROM tb_produto WHERE curso >=3 AND curso <60;
SELECT * FROM tb_produto WHERE curso LIKE "%C%";

SELECT * FROM tb_produto INNER join tb_categoria ON tb_categoria.id = tb_produto.categoria_id where curso like "%J%"; 

-- Busca e seleciona todos os valores que se repetem entre categoria e ID
SELECT * FROM tb_produto INNER join tb_categoria on tb_categoria.id = tb_produto.categoria_id;