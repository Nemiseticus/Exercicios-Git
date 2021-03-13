CREATE DATABASE db_famarcia_do_bem; -- Criando o banco de dados

USE db_famarcia_do_bem; -- Adicionando banco de dados

-- Criando tabela1

CREATE TABLE tb_categoria(
id BIGINT AUTO_INCREMENT,
nome VARCHAR(10) NOT NULL,
classificacao VARCHAR(30) NOT NULL,
ativo BOOLEAN ,
PRIMARY KEY (id)
);

-- Criando tabela2
CREATE TABLE tb_produto(
id BIGINT AUTO_INCREMENT ,
preco INT (10) NOT NULL,
prescricao BOOLEAN NOT NULL,
tipo VARCHAR (30) NOT NULL,
categoria_id BIGINT (10),
PRIMARY KEY (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

-- Populando tabela1
INSERT INTO tb_categoria (nome, classificacao, ativo) VALUES
("Benegripe", "Tarja amarela", true),
("Rivotril", "Tarja preta", true),
("Ritalina", "Tarja preta", true),
("Amoxil", "Tarja vermelha", true),
("Azitrophar", "Tarja vermelha", true),
("Amoxilina", "Tarja amarela", true),
("Orlistate", "Tarja amarela", true),
("Cinegripe", "Tarja amarela", true);

-- Populando tabela2
INSERT INTO tb_produto (preco, prescricao, tipo, categoria_id) VALUES
(14, TRUE, "Begenerico",1),
(70, FALSE, "generico",2),
(100, TRUE, "referência",1),
(60, FALSE, "generico",3),
(40, TRUE, "referência",4),
(8, TRUE, "generico",5),
(202, FALSE, "referência",2),
(12, TRUE, "generico",4);

-- Fazer busca
SELECT * FROM tb_produto WHERE preco > 50;
SELECT * FROM tb_produto WHERE preco >= 3 AND preco <60;
SELECT * FROM tb_produto WHERE preco LIKE "%Be%";

-- Busque e selecione usando INNER join
SELECT * FROM tb_produto INNER join tb_categoria ON tb_categoria.id = tb_produto.categoria_id where preco like "%PR%"; 

-- Busca e seleciona todos os valores que se repetem entre categoria e ID
SELECT * FROM tb_produto INNER join tb_categoria on tb_categoria.id = tb_produto.categoria_id;


