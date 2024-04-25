package es.club.nautico.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="amarres")
public class Amarre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="n_amarre")
	private int nAmarre;
	
	@Column(name="cuota")
	private Double cuota;

	public Amarre() {
		super();
	}

	public Amarre(int nAmarre, Double cuota) {
		super();
		this.nAmarre = nAmarre;
		this.cuota = cuota;
	}

	public int getnAmarre() {
		return nAmarre;
	}

	public void setnAmarre(int nAmarre) {
		this.nAmarre = nAmarre;
	}

	public Double getCuota() {
		return cuota;
	}

	public void setCuota(Double cuota) {
		this.cuota = cuota;
	}
	
}
