interface Persona {
    nombre: string;
    edad: number;
}

//Se crea un objeto de tipo persona con sus atributos
let pablo: Persona = { nombre: "Pablo", edad: 19 };


//La función recoge el objeto de tipo persona e imprime 
// sus atributos nombre y edad
function getInfo(persona: Persona) {
    let html = "";
    html += "Nombre: " + persona.nombre + "<br>";
    html += "Edad: " + persona.edad;
    html += "<br>";
    contenedor.innerHTML += html;
}

getInfo(pablo);
