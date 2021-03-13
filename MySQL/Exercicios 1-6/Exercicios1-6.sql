create database db_generation_game_online;
use db_generation_game_online;

create table tb_classe(
id bigint (5) auto_increment,
usuario varchar(300) not null,
ativo bigint(10),
primary key (id)
);

create table tb_personagem(
id bigint(5) auto_increment, 
nome varchar(300)not null,
classe varchar(300)not null,
nivel int (100) not null,
poder_ataque bigint(200) not null,
poder_defesa bigint(200) not null,
classe_id bigint,
primary key (id), 
foreign key (classe_id) references tb_classe (id)
);
select* from tb_personagem;


insert into tb_classe (usuario, ativo) values ("Dep", 1);
insert into tb_classe (usuario, ativo) values ("Bad", 2);
insert into tb_classe (usuario, ativo) values ("Tank", 3);
insert into tb_classe (usuario, ativo) values ("Sup", 4);
insert into tb_classe (usuario, ativo) values ("Goh", 5);





insert into tb_personagem (nome, classe, nivel, poder_ataque, poder_defesa, classe_id) values ("nomea", "Mago",       123,   2500,   1000,   1);
insert into tb_personagem (nome, classe, nivel, poder_ataque, poder_defesa, classe_id) values ("nomesaa", "Barbaro",       2,   2500,   1000,   1);
insert into tb_personagem (nome, classe, nivel, poder_ataque, poder_defesa, classe_id) values("nomsdea", "Monge",       12,   2500,   1000,   2);
insert into tb_personagem (nome, classe, nivel, poder_ataque, poder_defesa, classe_id) values("nomafdea", "Caçador",       13,   2500,   1000,   3);
insert into tb_personagem (nome, classe, nivel, poder_ataque, poder_defesa, classe_id) values("nodfmea", "Feiteceiro",       113,   2500,   1000,   4);
insert into tb_personagem (nome, classe, nivel, poder_ataque, poder_defesa, classe_id) values("nomccea", "Sucubus",       13,   324,   345,   1);
insert into tb_personagem (nome, classe, nivel, poder_ataque, poder_defesa, classe_id) values("nowemea", "Mago",       133,   2500,   1000,   1);
insert into tb_personagem (nome, classe, nivel, poder_ataque, poder_defesa, classe_id) values("nomweea", "Caçador",       523,   2500,   1000,   1);
insert into tb_personagem (nome, classe, nivel, poder_ataque, poder_defesa, classe_id) values("noqmea", "Mago",       3,   2500,   1000,   1);






select *from tb_personagem where poder_ataque > 2000;
select *from tb_personagem where poder_defesa >=1000 and poder_defesa < 2000;
select *from tb_personagem where nome like "%C%";

select *from tb_personagem
INNER join tb_classe on tb_classe.id = tb_personagem.classe_id;



