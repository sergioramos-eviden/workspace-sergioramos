package es.frutas.IoC;


public class Naranja implements Frutas { 

	@Override 
	public String getColor() { 
		// TODO Auto-generated method stub 
		return "naranja"; 

	}

	@Override
	public String getSabor() {
		// TODO Auto-generated method stub
		return "El sabor de esta naranja es " + sabor.getSabor();
	} 

	public void setSabor(CreacionSabores sabor) {
		this.sabor = sabor;
	}
	
	//Crear campo de creación de sabor
	private CreacionSabores sabor;
	
	//Constructor que inyecta la dependencia
	public Naranja(CreacionSabores sabor) {
		this.sabor = sabor;
		
	}
} 