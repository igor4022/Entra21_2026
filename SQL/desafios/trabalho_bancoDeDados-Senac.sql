create database clinica_veterinaria;

/* Criando tabelas e adiconando dados*/
create table tutor(
	id_tutor int auto_increment primary key,
    nome varchar(100) not null,
    telefone varchar(12),
    salario decimal(10,2),
    idade date
);
 
INSERT INTO tutor (nome, telefone, salario, idade) VALUES
('João Silva', '47999990001', 3500.00, '1985-03-15'),
('Maria Souza', '47999990002', 4200.00, '1990-08-22'),
('João Silva', '47999990001', 3500.00, '1985-03-15'),
('Maria Souza', '47999990002', 4200.00, '1990-08-22'),
('João Silva', '47999990001', 3500.00, '1985-03-15'),
('Maria Souza', '47999990002', 4200.00, '1990-08-22'),
('João Silva', '47999990001', 3500.00, '1985-03-15'),
('Carlos Lima', '47999990003', 3800.00, '1978-11-05');
 
create table animal(
	id_animal int auto_increment primary key,
    id_tutor int not null,
    nome varchar(100) not null,
    idade date,
    foreign key(id_tutor) references tutor(id_tutor)
);
 
INSERT INTO animal (id_tutor, nome, idade) 
VALUES(1, 'Rex', '2021-04-10'),
(1, 'Mel', '2020-09-18'),
(2, 'Luna', '2022-01-30'),
(1, 'Bob', '2019-12-12'),
(2, 'Re', '2021-04-10'),
(1, 'M', '2020-09-18'),
(2, 'Luna', '2022-01-30'),
(1, 'Melk', '2020-09-18'),
(2, 'Lunad', '2022-01-30'),
(1, 'Bobf', '2019-12-12'),
(2, 'Rexdd', '2021-04-10'),
(1, 'Melfs', '2020-09-18'),
(2, 'Lunad', '2022-01-30'),
(1, 'Meldd', '2020-09-18'),
(2, 'Lunaa', '2022-01-30'),
(1, 'Bobad', '2019-12-12');
 
create table veterinario(
	id_veterinario int auto_increment primary key,
    nome varchar(100) not null,
    salario decimal(10,2),
    idade date
);
 
INSERT INTO veterinario (nome, salario, idade) 
VALUES ('Dr. Pedro Alves', 8500.00, '1980-06-20'),
('Dra. Ana Costa', 9200.00, '1988-02-14'),
('Dr. Pedro Alves', 8500.00, '1980-06-20'),
('Dra. Ana Costa', 9200.00, '1988-02-14'),
('Dra. Ana Costa', 9200.00, '1988-02-14');
 
create table consulta(
	id_consulta int auto_increment primary key,
    id_animal int not null,
    id_veterinario int not null,
    nome_paciente varchar(100) not null,
    valor_consulta decimal(10,2) not null,
    data_consulta date not null,
    foreign key(id_animal) references animal(id_animal),
    foreign key(id_veterinario) references veterinario(id_veterinario)
);
 
insert into consulta
(id_animal, id_veterinario, nome_paciente, valor_consulta, data_consulta)
values
(49,1,'Rex',150.00,'2026-01-15'),
(50,2,'Mel',200.00,'2026-02-10'),
(51,1,'Luna',180.00,'2026-03-05'),
(52,2,'Bob',250.00,'2026-03-20'),
(53,1,'Re',120.00,'2026-04-12'),
(54,2,'M',300.00,'2026-04-25'),
(55,1,'Luna',220.00,'2026-05-08'),
(56,2,'Melk',170.00,'2026-05-18'),
(57,1,'Lunad',190.00,'2026-06-02'),
(58,2,'Bobf',280.00,'2026-06-15'),
(59,1,'Rexdd',350.00,'2026-07-01'),
(60,2,'Melfs',210.00,'2026-07-03'),
(61,1,'Lunad',260.00,'2026-07-05'),
(62,2,'Meldd',140.00,'2026-07-07'),
(63,1,'Lunaa',320.00,'2026-07-10'),
(64,2,'Bobad',230.00,'2026-07-14');
    
select * from animal;
 
/* seleções e updates */
select * from animal;
select * from consulta;
 
update consulta c
	set c.valor_consulta = (case when c.valor_consulta >= 1000 then c.valor_consulta * 0.80 end)
where id_consulta >= 1;
 
select id_veterinario, sum(valor_consulta) as total_consulta
	from consulta
group by id_veterinario
having sum(valor_consulta) > 100;
 
select id_veterinario, avg(valor_consulta) as media_consulta
from consulta
group by id_veterinario
having avg(valor_consulta) > 20;
select id_veterinario, max(valor_consulta) as maior_consulta
	from consulta
group by id_veterinario;
 
select id_veterinario, min(valor_consulta) as menor_consulta
	from consulta
group by id_veterinario;
 
select id_veterinario, count(id_consulta) as quantas_consultas
	from consulta
group by id_veterinario;

/* updates */
select * from tutor;
update tutor t
	set t.telefone = '102947387289'
where id_tutor = 1;
 
select * from animal;
update animal n
	set n.nome = 'Luna a colonizadora de luas'
where id_animal = 3;
 
select * from consulta;
update consulta c
	set c.valor_consulta = 100
where id_consulta = 7;
 
/* Deletando */
 
select * from consulta;
delete from consulta
where id_consulta = 9;
 
select * from animal;
delete from animal
where id_animal = 1;
 
/* Consulta do tuotor, anima e veterinario */
select
    animal.nome as Animal,
    tutor.nome as Tutor,
    veterinario.nome as Veterinario,
    consulta.data_consulta as Data_da_Consulta,
    consulta.valor_consulta as Valor_da_Consulta
from animal
inner join tutor
	on animal.id_tutor = tutor.id_tutor
inner join consulta
	on animal.id_animal = consulta.id_animal
inner join veterinario
	on consulta.id_veterinario = veterinario.id_veterinario;
    
/*  Desafio */
create table historico_consultas(
	 id_historico_consultas int auto_increment primary key,
	 id_animal int not null,
	 nome_animal varchar(100),
	 data_consulta date,
	 observacao varchar(255)
);
insert into historico_consultas(id_animal,nome_animal,data_consulta,observacao)
select
	a.id_animal,
    a.nome,
    c.data_consulta,
    c.observaca
from animal a
inner join consulta c
on a.id_animal = c.id_animal;

select * from consulta;