function gerarTabuada(){
    let numero = Number(document.getElementById("numero").value);
    let resultado = document.getElementById("resultado");
    if(numero === 0){
        resultado.innerHTML = "Digite um número válido.";
        return;
    }
    resultado.innerHTML = `<h2>Tabuada do ${numero}</h2>`;
    for(let i = 1; i <= 10; i++){
        resultado.innerHTML += `
            <p>${numero} × ${i} = <strong>${numero * i}</strong></p>
        `;
    }
}