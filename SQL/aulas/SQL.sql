create database escola;
create table if not exists alunos(
	id int auto_increment primary key,
	nome varchar(100) not null,
	email varchar(100) unique,
	data_cadastro datetime default current_timestamp
);

create database loja;
create table alunos(
	cliente varchar(100) not null,
    nome varchar(100) not null,
    cpf  varchar(14) not null unique,
    telefone varchar(14) not null unique
);