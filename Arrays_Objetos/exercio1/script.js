const cor = document.querySelector('.cores');
const adicona = document.querySelector('.adiciona');
const remover = document.querySelector('.remover');
const final = document.querySelector('.final');

let cores = ['Azul','Verde','Amarelo'];

console.log(cores);

console.log(cores.length);

cores.push('Vermelho');
console.log(cores);

cores.pop('Vermelho');
console.log(cores);

console.log(cores.length);