package es.club.nautico.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="barcos")
public class Barco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_barco")
	private int idBarco;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "n_matricula")
	private String matricula;

	@ManyToOne
	@JoinColumn(name = "id_socio")
	private Socio socio;
	
	@OneToOne
	@JoinColumn(name = "n_amarre")
	private Amarre amarre;
	
	public Barco(int idBarco, String nombre, String matricula, Socio socio, Amarre nAmarre) {
		super();
		this.idBarco = idBarco;
		this.nombre = nombre;
		this.matricula = matricula;
		this.socio = socio;
		this.amarre = nAmarre;
	}

	public Barco() {
		// TODO Auto-generated constructor stub
	}

	public int getIdBarco() {
		return idBarco;
	}

	public void setIdBarco(int idBarco) {
		this.idBarco = idBarco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public Amarre getAmarre() {
		return amarre;
	}

	public void setAmarre(Amarre nAmarre) {
		this.amarre = nAmarre;
	}
	
	
	
}
