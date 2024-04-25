package es.club.nautico.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="socios")
public class Socio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_socio")
	private int idSocio;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellidos")
	private String apellidos;

	public Socio(int idSocio, String nombre, String apellidos) {
		super();
		this.idSocio = idSocio;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public Socio() {
		// TODO Auto-generated constructor stub
	}

	public int getIdSocio() {
		return idSocio;
	}

	public void setIdSocio(int idSocio) {
		this.idSocio = idSocio;
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
