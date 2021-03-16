CREATE DATABASE minha_casa_mais_bonita; -- Criando o banco de dados

USE minha_casa_mais_bonita; -- Adicionando banco de dados

CREATE TABLE tb_categoria( -- Criando tabela 1
id BIGINT AUTO_INCREMENT,
ambiente VARCHAR(30) NOT NULL,
movel VARCHAR(30) NOT NULL,
item_de_decoracao VARCHAR(30) NOT NULL,
ativo BOOLEAN,
PRIMARY KEY (id)
);

CREATE TABLE tb_produto( -- Criando tabela 2
id BIGINT AUTO_INCREMENT,
raque VARCHAR(30)NOT NULL,
armario VARCHAR(30)NOT NULL,
balcao VARCHAR(30)NOT NULL,
vaso VARCHAR(30)NOT NULL,
planta VARCHAR(30)NOT NULL,
almofada BOOLEAN ,
luminaria VARCHAR(30)NOT NULL,
preco INT (30) NOT NULL,
categoria_id BIGINT,
PRIMARY KEY (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

CREATE TABLE tb_usuario( -- Criando tabela 3
id BIGINT AUTO_INCREMENT,
funcionario VARCHAR(30)NOT NULL,
cliente VARCHAR(30)NOT NULL,
endereco VARCHAR(30)NOT NULL,
imovel VARCHAR(30)NOT NULL,
PRIMARY KEY (id)

);

-- Pupolando tabela 1

INSERT INTO tb_categoria (ambiente, movel, item_de_decoracao, ativo) VALUES
("Quarto", "Guarda-roupa", "Luminária", TRUE),
("Sala", "Sofá", "Porta-Retrato", TRUE),
("Cozinha", "Bancada", "Faqueiro", TRUE),
("Banheiro", "Armário", "Aromatizador", TRUE),
("Escritório", "Escrivaninha", "Porta-lápis", TRUE);

-- Populando a tabela 2

INSERT INTO tb_produto (raque, armario, balcao, vaso, planta, almofada, luminaria, preco, categoria_id) VALUES
("Suspenso",     "Porta de correr",   "Ilha",       "Porcelana",        "Ráfia",        TRUE, "Embutidas", 10000, 1),
("com painel",   "De giro",           "Com gaveta", "Ceramica",         "Samambaia",    TRUE, "Lustres",   10000,2),
("Embutido",     "Porta de canto",    "MDP",        "Conjunto",         "Suculentas",   TRUE, "Pendentes", 80000,3),
("Pratileira",   "Sapateira",         "MDF",         "Cachepop",         "Orquídeas",   TRUE,  "Luminária", 7000,4),
("Gaveteiro",     "Armário-Arquivo",  "Bar",        "CimentoQueimado",  "Jasmim",      TRUE,  "Pendente",   7000,5);

-- Popule a tabela 3

INSERT INTO tb_usuario (funcionario, cliente, endereco, imovel) VALUES
("Jasmin", "Felipe", "Colombia", "apartamento"),
("Juana", "Miranda", "Chile", "casa"),
("Jaqueline", "Pietra", "Canadá", "sobrado"),
("Julieide", "Clarice", "Espanha", "apartamento"),
("Julia", "Magali", "Itália", "casa");



SELECT * FROM tb_produto WHERE preco >500;
SELECT * FROM tb_produto WHERE preco >=3000 and preco <=5000;
SELECT * FROM tb_produto WHERE preco LIKE "%B%";
SELECT * FROM tb_usuario WHERE cliente LIKE "%C%";


SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id;
SELECT * FROM tb_produto INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id WHERE raque LIKE "%J%"; 




