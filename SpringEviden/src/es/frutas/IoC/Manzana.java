package es.frutas.IoC;

public class Manzana implements Frutas{ 

	
	//Crear campo de creación de sabor
	private CreacionSabores sabor;
	
	//Constructor que inyecta la dependencia

	@Override 
	public String getColor() { 
		// TODO Auto-generated method stub 
		return "rojo"; 

	}

	public Manzana(CreacionSabores sabor) {
		this.sabor = sabor;
	}

	@Override
	public String getSabor() {
		// TODO Auto-generated method stub
		return "El sabor de esta manzana es " + sabor.getSabor();
	} 

	public void setSabor(CreacionSabores sabor) {
		this.sabor = sabor;
	}

} 