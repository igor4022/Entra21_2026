const btnBuscar = document.querySelector('#buscar');
const usuariosDiv = document.querySelector('#usuarios');
const pesquisa = document.querySelector('#pesquisa');
const quantidade = document.querySelector('#quantidade');
const dataHora = document.querySelector('#dataHora');
const json = document.querySelector('#json');

let usuarios = [];

async function buscarUsuarios() {
    try {

        const resposta = await fetch(
            'https://randomuser.me/api/?results=20'
        );

        const dados = await resposta.json();

        usuarios = dados.results;

        exibirUsuarios(usuarios);

        quantidade.textContent =
            `Quantidade de usuários: ${usuarios.length}`;

        const agora = new Date();

        dataHora.textContent =
            `Consulta realizada em: ${agora.toLocaleDateString()} ${agora.toLocaleTimeString()}`;

        json.value = JSON.stringify(dados, null, 2);

    } catch (erro) {
        console.error('Erro:', erro);
    }
}

function exibirUsuarios(lista) {

    usuariosDiv.innerHTML = '';

    lista.forEach(usuario => {

        usuariosDiv.innerHTML += `
            <div class="usuario">
                <img src="${usuario.picture.large}" alt="">
                <h3>${usuario.name.first} ${usuario.name.last}</h3>
                <p>${usuario.email}</p>
            </div>
        `;
    });
}

pesquisa.addEventListener('input', () => {

    const texto = pesquisa.value.toLowerCase();

    const filtrados = usuarios.filter(usuario => {

        const nomeCompleto =
            `${usuario.name.first} ${usuario.name.last}`.toLowerCase();

        return nomeCompleto.includes(texto);
    });

    exibirUsuarios(filtrados);

    quantidade.textContent =
        `Quantidade de usuários: ${filtrados.length}`;
});

btnBuscar.addEventListener('click', buscarUsuarios);