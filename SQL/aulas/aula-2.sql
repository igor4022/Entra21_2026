create database eventos;
create table organizador(
	id int primary key auto_increment,
    nome varchar(100) not null,
    telefone varchar(20),
    email varchar(100)
);

create table evento(
	id int primary key auto_increment,
    titulo varchar(150),
    data_evento date,
    local_evento varchar(100),
    id_organizador int,
    foreign key(id_organizador) references organizador(id)
);

create table participante(
	id int primary key auto_increment,
    nome varchar(100),
    cidade varchar(80),
    email varchar(100)
);

create table participante_backup(
	id int,
    nome varchar(100),
    cidade varchar(80),
    email varchar(100)
);
select * from participante_backup;
insert into participante_backup(id, nome, cidade, email) select id, nome, cidade, email from participante;

create table inscricao(
	id int primary key auto_increment,
    date_inscricao date,
    valor decimal(10,2),
    id_evento int,
    id_participante int,
    foreign key(id_evento) references evento(id),
    foreign key(id_participante) references participante(id)
);

create table participantes_evento(
	participante varchar(100),
    evento varchar(150)
);

insert into organizador(nome, telefone, email)
	values ('Igor', '479988687323', 'caloes@gmail.com'),
	('Ana', '479037893975', 'ana@email.com'),
    ('João', '579320759374', 'joao@gamil.com'),
    ('Fernanda', '478998389390', 'fernanda@gamil.com');
select * from organizador;
insert into evento(titulo, data_evento, local_evento, id_organizador) 
	values('festival1', str_to_date('01/07/2026', '%d/%m/%Y'), 'centro1', 1),
    ('festival2', str_to_date('02/07/2026', '%d/%m/%Y'), 'centro2', 2),
    ('festival3', str_to_date('03/07/2026', '%d/%m/%Y'), 'centro3', 3);
select * from evento;

insert into participante(nome, cidade, email)
	values('Igor', 'Blumenal', 'Igor@email'),
    ('Lucas', 'Blumenal', 'Lucas@email');


/* Desafio 1 */

create database empresa;
create table backup_participante(
	id int primary key auto_increment,
	nome varchar(100) not null,
    email varchar(100) not null,
    valor decimal(10,2) not null
);

create table valores_cadastro(
	id int,
	nome varchar(100) not null,
    email varchar(100) not null
);

insert into participantes_evento(participante, evento)
	select p.nome, e.titulo from participante p
    inner join incricao i on p.id = i.id_participante
    inner join evento e on e.id=i.id_evento;

insert into backup_participante(nome, email, valor) 
	values('Igor', 'Igor@gamil.com', '100.00'),
    ('Lucas', 'Lucas@gamail.com', '200.00');
select * from backup_participante;


/* Continuação da aula */