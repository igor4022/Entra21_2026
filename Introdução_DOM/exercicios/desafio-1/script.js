const nome = document.querySelector('#nome');
const profissao = document.querySelector('#profissao');
const bio = document.querySelector('#bio');
const botao = document.querySelector('#botao');
const initNome = document.createElement('p');
const initProfissao = document.createElement('p');
const initBio = document.createElement('p');
const conteudo = document.querySelector('.conteudo');

botao.addEventListener('click', criarCartao);

function criarCartao(event) {
    event.preventDefault();
    conteudo.appendChild(initNome);
    initNome.classList.add('nome');
    initNome.innerText = nome.value;
    conteudo.appendChild(initProfissao);
    initProfissao.classList.add('profissao')
    initProfissao.innerText = profissao.value
    conteudo.appendChild(initBio);
    initBio.classList.add('bio');
    initBio.innerText = bio.value;
}