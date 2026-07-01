create database loja_codificado;
create table cliente(
	id_cliente int primary key auto_increment not null,
    nome varchar(100) not null,
    cpf varchar(14) not null unique,
    telefone varchar(14) not null
);
insert into cliente(nome, CPF, telefone) values('joão', '00413682231', '004767888981'); -- adiciona em uma tabela informações
insert into cliente(nome, CPF, telefone) values('Maria','00415682231','0047993233214');
select * from cliente; -- verifica a tabela
select count(*) from cliente; -- contas quantoas tem em uma tabela
select * from cliente order by nome desc; -- decrecente
select * from cliente order by nome asc; -- crecente

create table produto(
	id_produto int primary key auto_increment not null,
    descricao varchar(1000),
    preco varchar(1000)
);

create table pedido(
	id_pedido int primary key auto_increment not null,
    data_pedido datetime not null,
    valor_total varchar(100) not null
);

/* exercícios */

select 500 + 300 as soma, 1000 - 250, as subtracao, 50 * 8 as multiplicacao, roud(900 / 3,2) as divisao;

/* desafio 3*/

insert into cliente(nome, cpf, telefone) values('João', '00429042421532', '00475847939493');
insert into cliente(nome, cpf, telefone) values('Maria', '00092094820420', '00478404820345');
insert into cliente(nome, cpf, telefone) values('Leticha', '00234142432424', '00475847939493');
insert into cliente(nome, cpf, telefone) values('Chuesnegher', '00374839432982', '00478404820345');
insert into cliente(nome, cpf, telefone) values('godrofedro', '00432390437394', '00475847939493');
select * from cliente;
select * from cliente order by id_cliente desc;
select * from cliente order by id_cliente asc;
select count(*) from cliente;


