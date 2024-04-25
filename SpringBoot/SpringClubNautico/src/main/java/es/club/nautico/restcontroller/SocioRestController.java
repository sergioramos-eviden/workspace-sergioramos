package es.club.nautico.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.club.nautico.entities.Socio;
import es.club.nautico.service.SocioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/socios")
public class SocioRestController {

	@Autowired
	private SocioService sservice;
	
	
	@PostMapping("/new")
	public String register(@RequestParam("nombre") String nombre, @RequestParam("apellidos") String apellidos) {
		Socio socio = new Socio();
		socio.setNombre(nombre);
		socio.setApellidos(apellidos);
		
		if(sservice.insertOne(socio) != null) {
			return "Socio registrado correctamente";
		}
		return "Socio no registrado";
	}
	
	@GetMapping("/all")
	public List<Socio> findAll() {
		return sservice.findAll();
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable("id") int idSocio, @RequestParam("nombre") String nombre, @RequestParam("apellidos") String apellidos) {
		Socio socio = sservice.findById(idSocio);
		if(socio != null) {
			socio.setApellidos(apellidos);
			socio.setNombre(nombre);
			
			sservice.updateOne(socio);
			return "Socio modificado";
		}else {
			return "Socio no modificado";
		}
		
	}
	
	@GetMapping("/find/{id}")
	public Socio findById(@PathVariable("id") int idSocio) {
		return sservice.findById(idSocio);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int idSocio) {
		if(sservice.findById(idSocio) != null) {
			if(sservice.deleteOne(idSocio) == 1) {
				return "Socio eliminado";
			}else {
				return "Socio no eliminado";
			}
		}else {
			return "Socio no existente";
		}
	}
}
