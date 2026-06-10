const botao = document.querySelector('.botao');
const resultado = document.querySelector('#resultado');
const valor = document.querySelector('#frequencia');
botao.addEventListener('click', (event) => {
    event.preventDefault();
    calcularMedia();
    botao.disabled = true;
});

function calcularMedia() {
    const valor1 = Number(document.querySelector('#Nota1').value);
    const valor2 = Number(document.querySelector('#Nota2').value);
    const valor3 = Number(document.querySelector('#Nota3').value);
    const media = (valor1 + valor2 + valor3) / 3;
    let div = document.createElement('div');
    let situacao = document.createElement('div');
    let frequencia = document.createElement('div');
    let data = document.createElement('div');
    let tempoReal = document.createElement('div');

    let dataAtual = new Date();
    let dataReferencia = new Date(dataAtual.getFullYear(), 11, 31);
    const horas = String(dataAtual.getHours()).padStart(2, '0');
    const minutos = String(dataAtual.getMinutes()).padStart(2, '0');
    const segundos = String(dataAtual.getSeconds()).padStart(2, '0');
    let tempo = `${horas}h ${minutos}m ${segundos}s`;
    resultado.appendChild(data);
    data.classList.add('data');
    data.textContent = `Data: ${dataAtual.toLocaleDateString()}`;
    data.textContent = `Data: ${new Date().toLocaleDateString()}`;
    resultado.appendChild(tempoReal);
    tempoReal.classList.add('tempo-real');
    tempoReal.textContent = `Tempo Real: ${tempo}`;


    const valor = Number(document.querySelector('#frequencia').value);
    const totalAulas = 100;
    const percentualFrequencia = (valor / totalAulas) * 100;


    resultado.appendChild(situacao);
    situacao.classList.add('situacao');
    situacao.textContent = `Média: ${media.toFixed(1)}`;

    if (media >= 7) {
        resultado.appendChild(div);
        div.classList.add('aprovado');
        div.textContent = 'APROVADO';

    } else if (media >= 5 ) {
        resultado.appendChild(div);
        div.classList.add('recuperacao');
        div.textContent = 'RECUPERAÇÃO';
    } else {
        resultado.appendChild(div);
        div.classList.add('reprovado');
        div.textContent = 'REPROVADO';
    }
    if (valor >= 70) {
        resultado.appendChild(frequencia);
        frequencia.classList.add('aprovado');
        frequencia.textContent = `Frequência: ${percentualFrequencia.toFixed(1)}%`;
    } else if (valor >= 50 ) {
        resultado.appendChild(frequencia);
        frequencia.classList.add('recuperacao');
        frequencia.textContent = `Frequência: ${percentualFrequencia.toFixed(1)}%`;
    } else {
        resultado.appendChild(frequencia);
        frequencia.classList.add('reprovado');
        frequencia.textContent = `Frequência: ${percentualFrequencia.toFixed(1)}%`;
    }
}