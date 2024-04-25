//Declaramos el tipo
type Genero = "Hombre" | "Mujer";
//Busca del div que queremos que camvie de color
const cuadrado:HTMLElement =  document.querySelector("#genero")!;

//Comprueba que el valor es hombre o mujer,
// y cambia el color del div
function genero(valor:Genero){
    if(valor == "Hombre"){
       cuadrado.style.backgroundColor = "blue";
    }else if(valor == "Mujer"){
        cuadrado.style.backgroundColor = "pink";
    }else{
        cuadrado.style.backgroundColor = "red";
    }
}