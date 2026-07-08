CREATE TABLE emails_marketing (
    nome VARCHAR(100),
    email VARCHAR(100)
);
INSERT INTO emails_marketing (nome, email)
SELECT nome, email FROM participante;
CREATE TABLE historico_eventos (
    titulo VARCHAR(100),
    data_evento DATE,
    local_evento VARCHAR(100)
);
INSERT INTO historico_eventos (titulo, data_evento, local_evento)
SELECT titulo, data_evento, local_evento FROM evento;
CREATE TABLE agenda_organizadores (
    organizador VARCHAR(100),
    evento VARCHAR(100)
);
INSERT INTO agenda_organizadores (organizador, evento)
SELECT o.nome, e.titulo FROM organizador o INNER JOIN evento e ON o.id = e.id_organizador;

select * from evento;
select * from organizador;

select o.nome, e.titulo from organizador o 
inner join evento e on o.id = e.id_organizador;

select p. * 
	from participante p 
where p.cidade = 'Blumenal';

select p. *
	from participante p
where upper(p.cidade) = 'BLUMENAL' and p.id = 1;

select p. *
	from participante p
where upper(p.cidade) = 'BLUMENAL' or p.id >= 2; -- Que seja maior ou igual a dois na lista de id

select p. *
	from participante p
where not upper(p.cidade) = 'BLUMENAL';

select p. *
	from participante p
where upper(p.cidade) in ('BLUMENAL', 'INDAIAL'); -- Que tenha Blumenal ou Indaial

select p. *
	from participante p
where upper(p.cidade) in ('BLUMENAL', 'INDAIAL') limit 1; -- Pega a penas uma pessoa

select p. *
	from participante p where P.ID between 2 and 5; -- Começa na 2 pessoa e vai até a 5
    
select * from organizador limit 5 offset 7; -- pega cinco pessoas da tabela depois das 7 primeiras

select * from organizador o where o.nome like '%a%'; -- Que tenham a letra 'a'
select * from organizador o where o.nome like 'j%'; -- Que começe com a letra 'j'
select * from organizador o where o.nome like '%s'; -- Que termine com aletra 's'

select * from organizador o
	where o.nome not like '%Souza%'; -- Pega todos da tabela a menos que seu nome seja 'Souza'

select * from organizador o
	where o.nome like '%a%'
    and o.nome not like '%santos%'
    order by nome desc;
    
select o.nome
	from organizador o
    where length(o.nome) >= 15;

/* desafio 1 */
create database gameShow;
create table participante(
 id int primary key auto_increment,
 nome varchar(100) not null,
 idade int not null,
 cidade varchar(100) not null
);

insert into participante(nome, idade, cidade)
	values('Igor', 17, 'Blumenal'),
    ('Igor', 17, 'Blumenal'),
    ('Lucas', 25, 'Blumenal'),
    ('Nelsi', 35, 'Blumenal'),
    ('Debrair', 35, 'Blumenal');

select p.*
	from participante p 
where p.idade >= 25;

select p.*
	from participante p
where p.cidade = 'Blumenal';

select p.*
	from participante p
where p.id order by p.id asc;

select p.*
 from participante p
where p.id between 2 and 5 order by p.id asc limit 5;

/* Exercício 1*/
create table clientes(
	id int primary key auto_increment,
	nome varchar(100),
    idade int, 
    cidade varchar(100)
);

insert into clientes(nome, idade, cidade) 
	values('Igor', 17, 'Blumenal'),
    ('Lucas', 20, 'Blumenal'),
    ('Nelsi', 25, 'Timbó'),
    ('Debrair', 30, 'Timbó'),
    ('Jelvane', 35, 'Indaial'),
    ('Cleu', 40, 'indaial'),
    ('Adriano', 45, 'Curitiba'),
    ('Valdecir', 50, 'Curitiba');
    
select nome, cidade
	from clientes;
    
select c.*
	from clientes c
where c.idade >= 30;

select c.*
	from clientes c
where c.cidade = 'Blumenal';

select c.*
	from clientes c
where c.idade >= 20 and c.idade <= 40;

select c.*
	from clientes c
where c.nome like 'M%';

select c.*
	from clientes c
where c.idade order by idade asc;

select c.*
	from clientes c
where c.id limit 3;

select c.*
	from clientes c
where c.cidade = 'Blumenal' and c.idade >= 25;

select c.*
	from clientes c
where c.cidade = 'Indaial';

