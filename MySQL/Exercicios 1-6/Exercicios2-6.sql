CREATE DATABASE db_pizzaria_legal; -- CRIANDO BANCO DE DADOS

USE db_pizzaria_legal; -- ADICIONANDO BANCO DE DADOS

 -- CRIANDO A TABELA 1
CREATE TABLE tb_categoria(
id BIGINT(10) AUTO_INCREMENT,
nome VARCHAR(30) NOT NULL,
tipo VARCHAR(30) NOT NULL,
ativo BOOLEAN ,
PRIMARY KEY (id)
);


-- CRIANDO A TABELA 2
CREATE TABLE tb_pizza(
id BIGINT(5) AUTO_INCREMENT,
sabor VARCHAR (30) NOT NULL,
borda VARCHAR(30) NOT NULL,
preco int (10) NOT NULL,
categoria_id BIGINT(10),
PRIMARY KEY (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

-- POPULANDO AS TABELAS.


INSERT INTO tb_categoria (nome, tipo, ativo) VALUES
("Salgado", "Mini", true),
("Doce", "Tradicional", true),
("Doce", "Mini", true),
("Salgado", "Tradicional", true),
("Misto", "Tradicional", true);




INSERT INTO tb_pizza (sabor, borda, preco, categoria_id) VALUES
("Portuguesa", "Sem", 29, 1),
("Mussarela", "Catupiry", 33, 2),
("Italiana", "Sem", 30, 3),
("Calabresa", "Cheddar", 33, 4),
("Abacaxi&LeiteCondensado", "Sem", 70, 5),
("Romeu&Julieta", "Sem", 50, 3),
("Ninho", "Sem", 29, 2),
("Portuguesa", "Sem", 29, 5);

select *from tb_pizza where preco > 50; -- Busque e selecione
select *from tb_pizza where preco >=29 and preco < 60; -- Busque e selecione
select *from tb_pizza where sabor like "%C%"; -- Busque e selecione

-- Busque e selecione usando INNER join
select *from tb_pizza INNER join tb_categoria on tb_categoria.id = tb_pizza.categoria_id where sabor like "%x%"; 


-- Busca e seleciona todos os valores que se repetem entre categoria e ID
select * from tb_pizza INNER join tb_categoria on tb_categoria.id = tb_pizza.categoria_id;







