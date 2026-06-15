const nome = document.querySelector('.nome');
const idade = document.querySelector('.idade');
const curso = document.querySelector('.curso');
const nota = document.querySelector('.nota');
const enviar = document.querySelectorAll('#enviar');

const initNome = document.querySelector('#nome');
const initIdade = document.querySelector('#idade');
const initCurso = document.querySelector('#curso');
const initNota = document.querySelector('#nota');



enviar.forEach(envia => {
    envia.addEventListener('click', cadastrar)
});
function cadastrar(event) {
    event.preventDefault()
    let valorNome = document.createElement('p');
    let valorIdade = document.createElement('p');
    let valorCurso = document.createElement('p');
    let valorNota = document.createElement('p');

    let aluno = {
        nome: initNome.value,
        idade: initIdade.value,
        curso: initCurso.value,
        nota: initIdade.value,
    }

    nome.appendChild(valorNome);
    valorNome.innerText = aluno.nome;
    idade.appendChild(valorIdade);
    valorIdade.innerText = aluno.idade;
    curso.appendChild(valorCurso);
    valorCurso.innerText = aluno.curso;

    if(initNota.value >= 7) {
        nota.appendChild(valorNota);
        valorNota.classList.add('aprovado')
        valorNota.innerText = 'APROVADO';
    } else if(initNota.value >= 5) {
        nota.appendChild(valorNota);
        valorNota.classList.add('recuperacao');
        valorNota.innerText = 'RECUPERAÇÃO';
    } else {
        nota.appendChild(valorNota);
        valorNota.classList.add('reprovado');
        valorNota.innerText = 'REPROVADO';
    }
}