const alunos = document.querySelector('#numero');
const botao = document.querySelector('.botao');
const nomes = document.querySelector('.nomes');
const idades = document.querySelector('.idades');
const reiniciar = document.querySelector('.reiniciar');

botao.addEventListener('click', estatisticas);

function estatisticas(event) {
    event.preventDefault();
    const quantidadeAlunos = parseInt(alunos.value)
    let i = 0;
    let nome;
    let idade;
    do {
        nome = prompt('Coloque o nome do aluno:');
        idade = prompt(`coloque a idade de ${nome}:`);
        i++
        const nomeAlunos = document.createElement('div');
        const idadeAlunos = document.createElement('div');
        nomes.appendChild(nomeAlunos);
        nomeAlunos.innerText = nome;
        idades.appendChild(idadeAlunos);
        idadeAlunos.innerText = idade;

        const situacoes = document.querySelector('.situacoes');
        const situacaoAlunos = document.createElement('div');
        situacoes.appendChild(situacaoAlunos);

        if(idade < 18) {
            situacaoAlunos.innerText = 'Menor de Idade';
        } else {
            situacaoAlunos.innerText = 'Maior de Idade';
        }

        const total = document.querySelector('.totalAlunos');
        const totalAlunos = document.createElement('div');
        total.appendChild(totalAlunos);
        totalAlunos.innerHTML = `Total de alunos: ${i}`;

        const maiorIdade = Math.max(idade);
        const maior = document.querySelector('.maiorIdade');
        maior.innerHTML = `Maior Idade: ${maiorIdade}`;

        const menorIdade = Math.min(idade);
        const menor = document.querySelector('.menorIdade');
        menor.innerHTML = `Menor Idade: ${menorIdade}`;

        const media = idade / i;
        const mediaIdade = document.querySelector('.mediaIdade');
        mediaIdade.innerHTML = `Média Idade ${media} anos`;
    } while(i < quantidadeAlunos );
}