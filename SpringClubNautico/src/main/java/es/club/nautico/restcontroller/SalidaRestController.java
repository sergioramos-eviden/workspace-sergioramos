package es.club.nautico.restcontroller;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import es.club.nautico.entities.*;
import es.club.nautico.service.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/salidas")
public class SalidaRestController {

	@Autowired
	private SalidaService sservice;
	
	@Autowired
	private BarcoService bservice;
	
	@Autowired
	private PatronService pservice;
	
	@PostMapping("/new")
	public String register(@RequestParam("destino") String destino, @RequestParam("fecha_salida") Date fecha,
		@RequestParam("id_barco") int idBarco, @RequestParam("id_patron") int idPatron) {
		
		Barco barco = bservice.findById(idBarco);
		Patron patron = pservice.findById(idBarco);
		Salida salida = new Salida();
		
		salida.setBarco(barco);
		salida.setDestino(destino);
		salida.setFechaSalida(fecha);
		salida.setPatron(patron);
		
		if(sservice.insertOne(salida) != null) {
			return "Salida insertado correctamente";
		}
		return "Salida no insertado";
	}
	
	@GetMapping("/all")
	public List<Salida> findAll() {
		return sservice.findAll();
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable("id") int idSalida, @RequestParam("destino") String destino, @RequestParam("fecha_salida") Date fecha,
			@RequestParam("id_barco") int idBarco, @RequestParam("id_patron") int idPatron) {
		Salida salida = sservice.findById(idSalida);
		Barco barco = bservice.findById(idBarco);
		Patron patron = pservice.findById(idBarco);
		
		if(salida != null) {
			salida.setBarco(barco);
			salida.setDestino(destino);
			salida.setFechaSalida(fecha);
			salida.setPatron(patron);
			
			sservice.updateOne(salida);
			return "Salida modificado";
		}else {
			return "Salida no modificado";
		}
		
	}
	
	@GetMapping("/find/{id}")
	public Salida findById(@PathVariable("id") int idSalida) {
		return sservice.findById(idSalida);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int idSalida) {
		if(sservice.findById(idSalida) != null) {
			if(sservice.deleteOne(idSalida) == 1) {
				return "Salida eliminado";
			}else {
				return "Salida no eliminado";
			}
		}else {
			return "Salida no existente";
		}
	}
}