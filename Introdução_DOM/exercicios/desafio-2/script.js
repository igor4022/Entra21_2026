const adicionar = document.querySelector('#adicionar');
const destacar = document.querySelector('#destacar');
const lista = document.querySelector('#lista');
const corAzul = document.querySelector('.azul');
const corAmarelo = document.querySelector('.amarelo');
const corVerde = document.querySelector('.verde');
const conteudo = document.querySelector('.conteudo');
const nome = document.querySelector('#nome');
const preco = document.querySelector('#preco');
const produtos = [];

adicionar.addEventListener('click', adicionarProduto);

function adicionarProduto(event) {
    event.preventDefault();
    const produto = document.createElement('div');
    produto.classList.add('produto');
    produto.innerHTML = `Nome: ${nome.value} Preço: ${preco.value}`; 
    conteudo.appendChild(produto);
    produtos.push(produto);
    nome.value = '';
    preco.value = '';
}

destacar.addEventListener('click', destacarProduto);

function destacarProduto(event) {
    event.preventDefault();
    const ultimoProduto = produtos[produtos.length-1];
    if(ultimoProduto) {
        ultimoProduto.style.fontWeight = "bold";
    }
}

lista.addEventListener('click', alterarCor);

function alterarCor(event) {
    event.preventDefault()
    produtos.forEach(function(produto){
        const texto = produto.innerHTML;
        const preco = parseFloat(texto.split('Preço:')[1])
        if(preco >= 100) {
            produto.classList.add('amarelo');
        }
    })
}