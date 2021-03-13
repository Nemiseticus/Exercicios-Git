CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

CREATE TABLE tb_categoria(
id BIGINT AUTO_INCREMENT,
material VARCHAR(30) NOT NULL,
instalacao BOOLEAN,
ativo BOOLEAN,
PRIMARY KEY (id)
);

CREATE TABLE tb_produto(
id BIGINT AUTO_INCREMENT,
preco INT(10) NOT NULL,
peso INT (10) NOT NULL,
categoria_id BIGINT,
PRIMARY KEY (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

INSERT INTO tb_categoria(material, instalacao, ativo) VALUES
("MDP", TRUE, TRUE),
("MDF", TRUE, TRUE),
("Areia", FALSE, FALSE),
("Cimento", FALSE, TRUE),
("Massa", FALSE, TRUE),
("Tinta", TRUE, TRUE),
("Ferramentas", TRUE, TRUE),
("Tijolos", TRUE, TRUE);

INSERT INTO tb_produto(preco, peso, categoria_id) VALUES
(20, 2, 1),
(34, 3, 2),
(12, 4, 3),
(43, 5, 4),
(53, 1, 5),
(60, 9, 2),
(12, 12, 2),
(43, 2, 4);

SELECT * FROM tb_produto WHERE preco >50;
SELECT * FROM tb_produto WHERE preco >=3 AND preco <60;
SELECT * FROM tb_produto WHERE preco LIKE "%C%";

SELECT * FROM tb_produto INNER join tb_categoria ON tb_categoria.id = tb_produto.categoria_id where preco like "%0%"; 

-- Busca e seleciona todos os valores que se repetem entre categoria e ID
SELECT * FROM tb_produto INNER join tb_categoria on tb_categoria.id = tb_produto.categoria_id;


