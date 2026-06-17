// FORMULÁRIO COM VALIDAÇÃO
const formulario = document.getElementById("formCadastro");
//let resultado = document.getElementById("resultado");

formulario.addEventListener("submit", function (event) {
    event.preventDefault();

    let nome = document.getElementById("nome").value;
    let email = document.getElementById("email").value;
    let mensagem = document.getElementById("mensagem");
    let valor = document.getElementById('valor');

    if (nome.trim() === "" || email.trim() === "") {
        mensagem.textContent = "Preencha todos os campos.";
        mensagem.className = "erro";
        return;
    }
    mensagem.textContent = "Cadastro realizado com sucesso!";
    mensagem.className = "sucesso";
   /* resultado.innerHTML = 
    `<h3>Resultado: ${mensagem.textContent}</h3> <br> 
    `;*/
    valor.innerText = nome.length;
});

const limpar = document.querySelector('.limpar');
limpar.addEventListener('click', btnLimpar);
function btnLimpar(event) {
    event.preventDefault();
    let nome = document.getElementById("nome");
    let email = document.getElementById("email");
    let mensagem = document.getElementById("mensagem");
    let valor = document.getElementById('valor');
    const resposta = confirm('Deseja apagar o campo do formulário');
    if(resposta == true) {
        nome.value = "";
        email.value = "";
        mensagem.innerText = "";
        valor.innerText = "";
    } else {
        console.log('ok');
    }
    
}

// CONTADOR INTERATIVO
let valor = 0;
const contador = document.getElementById("contador");

document
    .getElementById("btnMais")
    .addEventListener("click", function () {
        valor++;
        contador.textContent = valor;
    });
document
    .getElementById("btnMenos")
    .addEventListener("click", function () {
        if(valor != 0) {
            valor--;
        }
        contador.textContent = valor;
    });
const zerar = document.querySelector('#btnZerar');
zerar.addEventListener('click', zerarValor)

function zerarValor(event) {
    event.preventDefault();
    valor = 0;
    contador.textContent = valor;
}

// TROCA DE TEMA
document
    .getElementById("btnTema")
    .addEventListener("click", function () {
        document.body.classList.toggle(
            "tema-escuro"
        );
    });
document.querySelector('#trocarTema')
        .addEventListener('click', function () {
            document.body.classList.toggle('temaAmarelo');
});
// MOUSEOVER
const caixa = document.getElementById("caixa");
caixa.addEventListener("mouseover", function () {
    caixa.style.backgroundColor = "#ffc107";
});

caixa.addEventListener("mouseout", function () {
    caixa.style.backgroundColor = "#ddd";
});

// KEYDOWN
const teclado = document.getElementById("teclado");
const saida = document.getElementById("saidaTecla");
teclado.addEventListener("keydown", function (event) {
saida.textContent = "Tecla pressionada: " + event.key;
});

