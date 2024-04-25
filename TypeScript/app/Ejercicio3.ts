// Se piden 2 numeros, que serán los que sumen
function sumar(a:number, b:number){
    //Se imprime la suma en el div contenedor
    contenedor.innerHTML += "El resultado es: " + (a + b) + "<br>";
}
//Se ejecuta la función
sumar(1,2);