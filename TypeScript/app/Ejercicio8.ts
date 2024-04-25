
function conditional(){
    const input:HTMLInputElement = document.querySelector("#conditional")!;
    let value = input.value;
    const div:HTMLElement = document.querySelector("#type")!;


    //Intenta cambiar el valor introducido a entero,
    //si lo consigue significa que es un numero
    if(parseInt(value)){
        div.innerHTML = "It's number";
    }else if(typeof value == 'string'){
        div.innerHTML = "It's a string";
    }else{
        div.innerHTML = "Neither string nor number";
    }
    
}