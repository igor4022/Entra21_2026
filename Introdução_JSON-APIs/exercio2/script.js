const cepInput = document.querySelector('#cep');
const btnBuscar = document.querySelector('#buscar');
const resultado = document.querySelector('#resultado');
const dataHora = document.querySelector('#dataHora');
const json = document.querySelector('#json');

async function buscarCEP() {

    const cep = cepInput.value.trim();

    if (cep.length !== 8) {
        alert('Digite um CEP válido com 8 números!');
        return;
    }

    try {

        const resposta = await fetch(
            `https://viacep.com.br/ws/${cep}/json/`
        );

        const dados = await resposta.json();

        if (dados.erro) {
            resultado.innerHTML = '<p>CEP não encontrado!</p>';
            return;
        }

        resultado.innerHTML = `
            <h3>Endereço Encontrado</h3>

            <p><strong>CEP:</strong> ${dados.cep}</p>

            <p><strong>Logradouro:</strong> ${dados.logradouro}</p>

            <p><strong>Bairro:</strong> ${dados.bairro}</p>

            <p><strong>Cidade:</strong> ${dados.localidade}</p>

            <p><strong>Estado:</strong> ${dados.uf}</p>

            <p><strong>DDD:</strong> ${dados.ddd}</p>
        `;

        const agora = new Date();

        dataHora.textContent =
            `Consulta realizada em ${agora.toLocaleDateString()} às ${agora.toLocaleTimeString()}`;

        json.value = JSON.stringify(dados, null, 2);

    } catch (erro) {

        resultado.innerHTML =
            '<p>Erro ao consultar o CEP.</p>';

        console.error(erro);
    }
}

btnBuscar.addEventListener('click', buscarCEP);