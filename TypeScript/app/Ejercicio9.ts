const divLlamada:HTMLElement = document.querySelector("#llamada")!;

function log(constructor:Function):void{
    console.log(constructor);

}

@log
class Llamada{
    constructor(){

    }
}

let llamada = new Llamada();
// llamada.Llamar();