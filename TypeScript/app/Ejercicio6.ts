

function repetir() {
    //Recoge los datos de los dos inputs
    let inputValor: HTMLInputElement = document.querySelector("#valor")!;
    let valor:any = inputValor.value;
    let inputNumber: HTMLInputElement = document.querySelector("#number")!;
    let n:number = parseInt(inputNumber.value);

    //Inserta el valor introducido n veces
    let resultado = [];
    for (let i = 0; i < n; i++) {
        resultado.push(valor);
    }
    //Los imprime en el contenedor
    contenedor.innerHTML += resultado;
}

