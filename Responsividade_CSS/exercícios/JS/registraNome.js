export default function registrarNome() {
    const nomeRecuperado = localStorage.getItem('nomeUsuario')

    if(nomeRecuperado) {
        document.querySelector('.exibeNome').textContent = nomeRecuperado
    }
}

registrarNome()