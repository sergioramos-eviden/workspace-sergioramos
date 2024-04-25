package es.club.nautico.entities;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="salidas")
public class Salida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_salida")
	private int idSalida;
	
	@Column(name="destino")
	private String destino;
	
	@Column(name="fecha_salida")
	private Date fechaSalida;

	@ManyToOne
	@JoinColumn(name="id_patron")
	private Patron patron;

	@ManyToOne
	@JoinColumn(name="id_barco")
	private Barco barco;

	public Salida(int idSalida, String destino, Date fechaSalida, Patron patron, Barco barco) {
		super();
		this.idSalida = idSalida;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.patron = patron;
		this.barco = barco;
	}

	public Salida() {
		// TODO Auto-generated constructor stub
	}

	public int getIdSalida() {
		return idSalida;
	}

	public void setIdSalida(int idSalida) {
		this.idSalida = idSalida;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Patron getPatron() {
		return patron;
	}

	public void setPatron(Patron patron) {
		this.patron = patron;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}
	
	
}
