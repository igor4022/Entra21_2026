export default function exibirNome() {
    const nomeRecebido = localStorage.getItem("nome");
    if(nomeRecebido) {
        document.querySelector('#exibirNome').textContent = nomeRecebido;
    }
}

exibirNome();