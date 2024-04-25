class Rectangulo{
    private base:number;
    private altura:number;

    constructor(base:number, altura:number){
        this.base = base;
        this.altura = altura;
    }
    public getBase(){
        return this.base;
    }
    public setBase(base:number){
        this.base = base;
    }
    public getAltura(){
        return this.altura;
    }
    public setAltura(altura:number){
        this.base = altura;
    }

    public getArea(){
        return "El área del rectángulo es: " + this.base * this.altura + "m2" + "<br>";
    }
}
let rectangulo = new Rectangulo(10,5);

contenedor.innerHTML+=rectangulo.getArea();
