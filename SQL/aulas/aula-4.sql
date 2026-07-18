CREATE DATABASE empresa2;
USE empresa2;
CREATE TABLE cliente(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100),
	cidade VARCHAR(60),
	telefone VARCHAR(20),
	email VARCHAR(100),
    produto decimal(10,2)
);
drop table cliente;

INSERT INTO cliente(nome,cidade,telefone,email,produto)
	VALUES('Maria','Blumenau','4799991111','maria@email.com',20000),
	('João','Indaial','4798882222','joao@email.com',500000),
	('Pedro','Timbó','4797773333','pedro@email.com',30000),
	('Ana','Pomerode','4796664444','ana@email.com',70000);

CREATE TABLE produto(id INT AUTO_INCREMENT PRIMARY KEY,descricao VARCHAR(100),
preco DECIMAL(10,2),estoque INT);
INSERT INTO produto(descricao,preco,estoque)
	VALUES('Notebook',4200,15),
	('Mouse',80,100),
	('Teclado',150,50),
	('Monitor',950,20);

select * from cliente;
update cliente set cidade = 'Gaspar' where id = 1;
update cliente c
	set c.nome = 'Luiz', 
    c.idade = 'Rio dos Cedros',
    c.telefone = '478902938382983'
where c.id = 1; /*and c.nome like %Ana% */

select * from produto;
update produte p
	set p.descricao = 'Notbook Gamer'
where id = 1;

update produto set preco = preco+(preco*01) where id=3;
update produto set preco = preco * 8.85 where id = 1;
update produto p
	set p.preco = p.preco+(p.preco*0.10)
where p.estoque between 50 and 100 and p.id >= 1;

select * from cliente;
delete from cliente c where c.id = 4;

insert into cliente(nome, cidade, telefone, email)
	values('Nick', 'Timbó', '478923792834', 'Nick@gamil.com');

/* Exerício 1 */
select * from cliente;
update cliente c 
	set c.cidade = 'Blumenau'
where id = 2;

update cliente c
	set c.telefone = '12454392832'
where id = 1;

select * from produto;
update produto p
	set p.preco = '700000'
where id = 5;

update produto p
	set p.estoque = p.estoque + 20
where id >= 1;

update produto p
	set p.preco = p.preco + 1.05
where id >= 1;

update produto p
	set p.preco = p.preco * 0.90 and p.preco >= '100000'
where id >= 1;

/* desafio 1 */
select * from produto;
update produto p
	set p.preco = '4800'
where id = 5;

update produto p
	set p.estoque = p.estoque + 15
where id >= 1;

update produto p
	set p.estoque = p.estoque - 5
 where id = 2;
 
 update produto p
	set p.preco = (case when p.preco >= 1000 then p.preco + 0.08 end)
where id >= 1;

delete from produto
where estoque = 0;
select * from produto where estoque = 0;

update cliente c
	set c.email = 'mariaoutrodenovo@email.com'
where id = 1;
select * from cliente;

update cliente c
	set c.cidade = 'Timbó'
where id = 2;
select * from cliente;

/* desafio 2 */

update cliente c
	set c.cidade = 'Blumenau', c.telefone = '123849834323'
 where id = 3;
 select * from cliente;
 
update cliente c
	set c.produto = c.produto * 0.80
where c.id >= 1;

update cliente c
	set c.produto = (case when c.produto <= 10 then c.produto = 30 end)
where c.id >= 1;
select * from cliente;

delete from cliente
	where email not like '%@%';
