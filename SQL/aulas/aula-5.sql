create database empresa3;
create table produto(
	id int auto_increment primary key,
    descricao varchar(100),
    categoria varchar(50),
    preco decimal(10,2),
    estoque int
);

insert into produto(descricao, categoria, preco, estoque)
VALUES('Notebook','Informática',4200,15),
('Mouse','Informática',80,120),
('Teclado','Informática',150,60),
('Monitor','Informática',950,20),
('Mesa Escritório','Móveis',800,12),
('Cadeira Gamer','Móveis',1450,8),
('Impressora','Periféricos',980,10),
('HD Externo','Periféricos',420,35);

select * from produto;
select count(*) from produto p -- Contar todos as unidades;
	where p.categoria = 'Informática';
select  count(categoria) from produto; -- Contar unidades com 'Informática';
select sum(p.preco) from produto p; -- Soma os preços dos produtos;
select p.preco from produto p;
select sum(p.preco) from produto p
	where p.estoque > 10;
select p.categoria, sum(p.estoque) as soma_estoque, sum(p.preco) as soma_preco
	from produto p
group by p.categoria; -- Somando cada estoque e cada preço de cada categoria;
select p.categoria, count(p.categoria) as soma_categoria, sum(p.preco) as soma_preco
	from produto p
group by p.categoria; -- Somando cada categoria ezistente e o total do preço de cada uma;

select p.categoria, 
	round(avg(p.preco),2) as media_preco,
    round(avg(p.estoque),2) as media_estoque
from produto p;

select p.categoria, max(p.preco) as maior_preco,
	min(p.preco) as menor_preco, sum(p.estoque) as soma_qtde,
    round(avg(p.estoque)) as media_estoque,
    count(*) as qtde_prod
from produto p
group by p.categoria having count(*) = 2;

CREATE TABLE cliente(
	id INT AUTO_INCREMENT PRIMARY KEY,
	nome VARCHAR(100),
	cidade VARCHAR(60)
);

CREATE TABLE pedido(id INT AUTO_INCREMENT PRIMARY KEY,
	data_pedido DATE,
	valor DECIMAL(10,2),
	id_cliente INT,
	FOREIGN KEY(id_cliente)
	REFERENCES cliente(id)
);

INSERT INTO cliente(nome,cidade)
VALUES('Maria','Blumenau'),
('João','Indaial'),
('Pedro','Timbó');

INSERT INTO pedido(data_pedido,valor,id_cliente)
VALUES('2026-08-01',250,1),
('2026-08-03',120,1),
('2026-08-04',950,2);

select c.nome, sum(p.valor) as soma_valor from cliente c
	inner join pedido p on c.id = p.id_cliente
group by c.nome;

select c.nome, sum(coalesce(p.valor,0)) as soma_valor from cliente c
	left outer join pedido p on c.id = p.id_cliente
group by c.nome;

/* Desafio */
/*
	Uma empresa deseja gerar um relatório para a diretoria.
	Crie consultas que retornem:
	Total de produtos cadastrados. 
	Valor total do estoque (preço × quantidade). 
	Preço médio dos produtos. 
	Produto mais caro. 
	Produto mais barato. 
	Quantidade de produtos por categoria. 
	Estoque total por categoria. 
	Média de preços por categoria. 
	Categorias com estoque superior a 20 unidades. 
	Relatório completo utilizando COUNT, SUM, AVG, MAX, MIN, GROUP BY e HAVING. 
*/
select * from produto;

select count(*) as total_produtos
from produto;

select sum(preco * quantidade) as valor_total_estoque
from produto;

select avg(preco) as media_preco
from produto;

select nome, preco
	from produto
where preco = (select max(preco) from produto);

select nome, preco
	from produto
where preco = (select min(preco) from produto);

select categoria, count(*) as quantidades_produtos
	from produto
group by categoria;

select categoria, sum(quantidade) as quantidades_estoque
	from produto
group by categoria;

select categoria, avg(preco) media_preco
	from produto
group by categoria;

select categoria, 
	count(*) as total_produtos, 
	sum(quantidades) as estoque_total, 
    avg(preco) as media_preco, 
	max(preco) as preco_maior, 
	min(preco) as preco_menor 
from produto
group by categoria
having sum(quantidade) > 10;