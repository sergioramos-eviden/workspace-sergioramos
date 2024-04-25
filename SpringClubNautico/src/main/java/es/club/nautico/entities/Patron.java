package es.club.nautico.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patrones")
public class Patron {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_patron")
	private int idPatron;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellidos")
	private String apellidos;

	public Patron() {
		super();
	}

	public Patron(int idPatron, String nombre, String apellidos) {
		super();
		this.idPatron = idPatron;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public int getIdPatron() {
		return idPatron;
	}

	public void setIdPatron(int idPatron) {
		this.idPatron = idPatron;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	
	
}
