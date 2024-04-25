"use strict";
let nombre = "Sergio";
let edad = 19;
let mayorDeEdad = true;
const contenedor = document.getElementById("contenedor");
let numeros = [1, 2, 3, 4, 5, 6];
for (const i of numeros) {
    contenedor.innerHTML += ("n: " + i) + "<br>";
}
// Se piden 2 numeros, que serán los que sumen
function sumar(a, b) {
    //Se imprime la suma en el div contenedor
    contenedor.innerHTML += "El resultado es: " + (a + b) + "<br>";
}
//Se ejecuta la función
sumar(1, 2);
//Se crea un objeto de tipo persona con sus atributos
let pablo = { nombre: "Pablo", edad: 19 };
//La función recoge el objeto de tipo persona e imprime 
// sus atributos nombre y edad
function getInfo(persona) {
    let html = "";
    html += "Nombre: " + persona.nombre + "<br>";
    html += "Edad: " + persona.edad;
    html += "<br>";
    contenedor.innerHTML += html;
}
getInfo(pablo);
class Rectangulo {
    constructor(base, altura) {
        this.base = base;
        this.altura = altura;
    }
    getBase() {
        return this.base;
    }
    setBase(base) {
        this.base = base;
    }
    getAltura() {
        return this.altura;
    }
    setAltura(altura) {
        this.base = altura;
    }
    getArea() {
        return "El área del rectángulo es: " + this.base * this.altura + "m2" + "<br>";
    }
}
let rectangulo = new Rectangulo(10, 5);
contenedor.innerHTML += rectangulo.getArea();
function repetir() {
    //Recoge los datos de los dos inputs
    let inputValor = document.querySelector("#valor");
    let valor = inputValor.value;
    let inputNumber = document.querySelector("#number");
    let n = parseInt(inputNumber.value);
    //Inserta el valor introducido n veces
    let resultado = [];
    for (let i = 0; i < n; i++) {
        resultado.push(valor);
    }
    //Los imprime en el contenedor
    contenedor.innerHTML += resultado;
}
//Busca del div que queremos que camvie de color
const cuadrado = document.querySelector("#genero");
//Comprueba que el valor es hombre o mujer,
// y cambia el color del div
function genero(valor) {
    if (valor == "Hombre") {
        cuadrado.style.backgroundColor = "blue";
    }
    else if (valor == "Mujer") {
        cuadrado.style.backgroundColor = "pink";
    }
    else {
        cuadrado.style.backgroundColor = "red";
    }
}
function conditional() {
    const input = document.querySelector("#conditional");
    let value = input.value;
    const div = document.querySelector("#type");
    //Intenta cambiar el valor introducido a entero,
    //si lo consigue significa que es un numero
    if (parseInt(value)) {
        div.innerHTML = "It's number";
    }
    else if (typeof value == 'string') {
        div.innerHTML = "It's a string";
    }
    else {
        div.innerHTML = "Neither string nor number";
    }
}
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
const divLlamada = document.querySelector("#llamada");
function log(constructor) {
    console.log(constructor);
}
let Llamada = class Llamada {
    constructor() {
    }
};
Llamada = __decorate([
    log
], Llamada);
let llamada = new Llamada();
// llamada.Llamar();
