package es.frutas.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProbandoFrutas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Frutas naranja = context.getBean("miFruta", Frutas.class);
		
		System.out.println("Color: " + naranja.getColor());
		System.out.println(naranja.getSabor());
		context.close();
		
	}
}
