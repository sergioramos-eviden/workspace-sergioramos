package es.club.nautico.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import es.club.nautico.entities.*;
import es.club.nautico.repository.*;
import es.club.nautico.service.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/barcos")
public class BarcoRestController {

	@Autowired
	private BarcoService bservice;
	@Autowired
	private AmarreRepository arepo;
	@Autowired
	private SalidaRepository srepo;
	@Autowired
	private SocioService sservice;
	
	@PostMapping("/new")
	public String register(@RequestParam("nombre") String nombre, @RequestParam("matricula") String matricula,
			@RequestParam("amarre") int n_amarre, @RequestParam("socio") int idSocio ) {
		
		Barco barco = new Barco();
		Amarre amarre =	arepo.findById(n_amarre).orElse(null);
		Socio socio = sservice.findById(idSocio);
		
		barco.setNombre(nombre);
		barco.setAmarre(amarre);
		barco.setSocio(socio);
		barco.setMatricula(matricula);
		
		if(bservice.insertOne(barco) != null) {
			return "Baco insertado correctamente";
		}
		return "Barco no insertado";
	}
	
	@GetMapping("/all")
	public List<Barco> findAll() {
		return bservice.findAll();
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable("id") int idBarco, @RequestParam("nombre") String nombre, @RequestParam("matricula") String matricula,
	@RequestParam("amarre") int n_amarre, @RequestParam("socio") int idSocio ) {
		Barco barco = bservice.findById(idBarco);
		Amarre amarre =	arepo.findById(n_amarre).orElse(null);
		Socio socio = sservice.findById(idSocio);
		
		if(barco != null) {
			barco.setNombre(nombre);
			barco.setAmarre(amarre);
			barco.setSocio(socio);
			barco.setMatricula(matricula);
			
			bservice.updateOne(barco);
			return "Barco modificado";
		}else {
			return "Barco no modificado";
		}
		
	}
	
	@GetMapping("/find/{id}")
	public Barco findById(@PathVariable("id") int idBarco) {
		return bservice.findById(idBarco);
	}
	
	@GetMapping("/salidas/{id}")
	public List<Salida> salidasByBarco(@PathVariable("id") int idBarco) {
		Barco barco = bservice.findById(idBarco);
		return srepo.findByBarco(barco);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int idBarco) {
		if(bservice.findById(idBarco) != null) {
			if(bservice.deleteOne(idBarco) == 1) {
				return "Barco eliminado";
			}else {
				return "Barco no eliminado";
			}
		}else {
			return "Barco no existente";
		}
	}
}