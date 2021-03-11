-- Criando um banco de dado RH
create database db_RH;
-- Acessando o banco de dados
use db_RH;
-- Criando a tabela de Cargo
create table tb_cargo(
id bigint auto_increment,
setor varchar(10) not null,
salario decimal (5,2) not null,
ativo boolean not null,
primary key(id)
);

-- Excluindo a coluna setor da tabela cargo
alter table tb_cargo drop column setor;

-- Re-Criando a coluna setor da tabela cargo com um número maior de caracteres 
alter table tb_cargo add column setor varchar(30) not null;

-- Excluindo a coluna salário da tabela cargo
alter table tb_cargo drop column salario;

-- Re-Criando a coluna salário da tabela cargo com número maior de caracteres
alter table tb_cargo add column salario decimal(12,2);

-- Populando a tabela cargo
insert into tb_cargo(setor, salario, ativo) values ("Desenvolvedor", 4500.00, true);
insert into tb_cargo(setor, salario, ativo) values ("Gestor", 8200.00, true);
insert into tb_cargo(setor, salario, ativo) values ("Segurança da Informação", 7000.00, true);
insert into tb_cargo(setor, salario, ativo) values ("Marketing", 3000.00, true);

-- Chamando o conteúdo da tabela
select * from tb_cargo;

-- Criando a tabela funcionário
create table tb_funcionario(
id bigint auto_increment,
nome varchar(30)not null,
matricula int(10) not null,
numeroDependentes int(2),
telefone int(9) not null,
primary key (id),
foreign key (cargo_id) references tb_cargo(id)
);

-- Populando a tabela funcionário
insert into tb_funcionario(nome, matricula, numeroDependentes, telefone, cargo_id)
values ("Paula", 2314, 2, 923456789,2);
insert into tb_funcionario(nome, matricula, numeroDependentes, telefone, cargo_id)
values ("Luana", 3454, 0, 823456789,1);
insert into tb_funcionario(nome, matricula, numeroDependentes, telefone, cargo_id)
values ("Patrik", 0934, 3, 723456789,3);
insert into tb_funcionario(nome, matricula, numeroDependentes, telefone, cargo_id)
values ("Dolores", 6572, 1, 623456789,5);
insert into tb_funcionario(nome, matricula, numeroDependentes, telefone, cargo_id)
values ("Raul", 0973, 2, 523456789,4);

-- Excluindo a coluna de salário da tabela cargo
alter table tb_cargo drop column salario;

-- Adicionando a tabela salário na tabela funcionario
alter table tb_funcionario add column salario float(15) not null;

-- Adicionando dados na coluna salario
UPDATE tb_funcionario SET salario = 4500.00 WHERE id = 1;
UPDATE tb_funcionario SET salario = 8200.00 WHERE id = 2;
UPDATE tb_funcionario SET salario = 7000.00 WHERE id = 3;
UPDATE tb_funcionario SET salario = 3000.00 WHERE id = 4;
 
 -- Chamando funcionarios com o salario maior que 2000
 select * from tb_funcionario where salario>2000;
 
 -- Chamando funcionarios com salario menor que 2000
  select * from tb_funcionario where salario<2000;
  
  -- Chamando funcionarios que tenha as letra De no nome
   select * from tb_funcionario where nome like "%De%";

