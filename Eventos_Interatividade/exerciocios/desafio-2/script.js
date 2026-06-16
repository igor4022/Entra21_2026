const nome = document.querySelector('.nome');
const senha = document.querySelector('.senha');
const botao = document.querySelector('.botao');
const resultado = document.querySelector('.resultado');

botao.addEventListener('click', mostrarResultado);

function mostrarResultado(event) {
    event.preventDefault();
    const valor = document.createElement('div');
    
    resultado.appendChild(valor);
    valor.classList.add('resultadoFinal')
    
    valor.innerHTML = `Cadastro feito com secesso!<br>
    ${nome.value}<br>${senha.value}`
}