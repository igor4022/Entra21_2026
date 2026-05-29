export default function salvarNome() {
    const formulario = document.querySelector('.login')

    formulario.addEventListener('submit', function(event) { 
        event.preventDefault()
        const nome = document.querySelector('#nome').value
        localStorage.setItem('nomeUsuario', nome)
        window.location.href = 'html/conteudo.html'
    })
}

salvarNome()