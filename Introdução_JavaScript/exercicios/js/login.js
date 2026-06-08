export default function salvar() {
    const nome = document.querySelector('#nome');
    const form = document.querySelector('#formulario');
    

    if (!nome || !form) return;
    const nomePrompt = prompt('Digite seu nome:');
    if(nomePrompt) {
        name.value = nomePrompt;
    }
    form.addEventListener('submit', function(event) {
        event.preventDefault();
        const nomeDigitado = nome.value;
        localStorage.setItem('nome', nomeDigitado);
        alert(`Olá, ${nome.value}! Seja bem-vindo!`);
        console.log(`O nome do usuário é: ${nome.value}`);
        window.location.href = 'conteudo.html'; 
    })
}