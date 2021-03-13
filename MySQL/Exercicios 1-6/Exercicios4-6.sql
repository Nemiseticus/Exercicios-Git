CREATE DATABASE db_cidade_das_carnes; -- Criando o banco de dados

USE db_cidade_das_carnes; -- Adicionando o banco de dados

-- Criando tabela1
CREATE TABLE tb_categoria(
id BIGINT AUTO_INCREMENT,
nome VARCHAR(30) NOT NULL,
qualidade VARCHAR (30) NOT NULL,
ativo BOOLEAN,
PRIMARY KEY (id)
);

-- Criando tabela2
CREATE TABLE tb_produto(
id BIGINT AUTO_INCREMENT,
preco INT(10) NOT NULL,
peso INT(10) NOT NULL,
ativo BOOLEAN ,
categoria_id BIGINT,
PRIMARY KEY (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

-- Populando Tabelas começando sempre pela primaria1
INSERT INTO tb_categoria (nome, qualidade, ativo, categoria_id) VALUES
("Paleta", "Nobre", true,1),
("Angus", "Nobre", true,2),
("Maminha", "Nobre", true,3),
("Coxão Mole", "Nobre", true,4),
("Fraldinha", "Nobre", true,5),
("Lombo", "Segunda", true,2),
("Acém", "Segunda", true,1),
("Cupim", "Segunda", true,3);

-- -- Populando Tabelas começando sempre depois da primaria1
INSERT INTO tb_produto (preco, peso, ativo) VALUES
(60, 1, TRUE),
(100, 2, TRUE),
(120, 2, TRUE),
(50, 1, TRUE),
(40, 1, TRUE),
(340, 4, TRUE),
(210, 2, TRUE),
(300, 3, TRUE);

-- Fazendo buscas com SELECT *FROM..... WHERE
SELECT * FROM tb_produto WHERE preco >50;
SELECT * FROM tb_produto WHERE preco >=3 AND preco <60;
SELECT * FROM tb_produto WHERE preco LIKE "%C%";

SELECT * FROM tb_produto INNER join tb_categoria ON tb_categoria.id = tb_produto.categoria_id where preco like "%0%"; 

-- Busca e seleciona todos os valores que se repetem entre categoria e ID
SELECT * FROM tb_produto INNER join tb_categoria on tb_categoria.id = tb_produto.categoria_id;



