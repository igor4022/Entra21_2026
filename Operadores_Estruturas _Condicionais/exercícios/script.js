const botao = document.querySelector('.botao');
const resultado = document.querySelector('#resultado');
botao.addEventListener('click', (event) => {
    event.preventDefault();
    calcularMedia();
});

function calcularMedia() {
    const valor1 = Number(document.querySelector('#Nota1').value);
    const valor2 = Number(document.querySelector('#Nota2').value);
    const valor3 = Number(document.querySelector('#Nota3').value);
    const media = (valor1 + valor2 + valor3) / 3;
    let div = document.createElement('div');
    let situacao = document.createElement('div');
    let frequencia = document.createElement('div');

    const valor = Number(document.querySelector('#frequencia').value);
    const totalAulas = 100;
    const percentualFrequencia = (valor / totalAulas) * 100;

    frequencia.textContent = `Frequência: ${percentualFrequencia.toFixed(1)}%`;
    resultado.appendChild(frequencia);
    frequencia.classList.add('frequencia');

    resultado.appendChild(situacao);
    situacao.classList.add('situacao');
    situacao.textContent = `Média: ${media.toFixed(1)}`;

    if (media >= 7) {
        resultado.appendChild(div);
        div.classList.add('aprovado');
        div.textContent = 'APROVADO';
    } else if (media >= 5) {
        resultado.appendChild(div);
        div.classList.add('recuperacao');
        div.textContent = 'RECUPERAÇÃO';
    } else {
        resultado.appendChild(div);
        div.classList.add('reprovado');
        div.textContent = 'REPROVADO';
    }
}