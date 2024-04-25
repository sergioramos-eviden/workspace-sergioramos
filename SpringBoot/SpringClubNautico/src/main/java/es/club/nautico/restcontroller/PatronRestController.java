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

import es.club.nautico.entities.Patron;
import es.club.nautico.service.PatronService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/patrones")
public class PatronRestController {

	@Autowired
	private PatronService pservice;
	
	
	@PostMapping("/new")
	public String register(@RequestParam("nombre") String nombre, @RequestParam("apellidos") String apellidos) {
		Patron patron = new Patron();
		patron.setNombre(nombre);
		patron.setApellidos(apellidos);
		
		if(pservice.insertOne(patron) != null) {
			return "Patron registrado correctamente";
		}
		return "Patron no registrado";
	}
	
	@GetMapping("/all")
	public List<Patron> findAll() {
		return pservice.findAll();
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable("id") int idPatron, @RequestParam("nombre") String nombre, @RequestParam("apellidos") String apellidos) {
		Patron patron = pservice.findById(idPatron);
		if(patron != null) {
			patron.setApellidos(apellidos);
			patron.setNombre(nombre);
			
			pservice.updateOne(patron);
			return "Patron modificado";
		}else {
			return "Patron no modificado";
		}
		
	}
	
	@GetMapping("/find/{id}")
	public Patron findById(@PathVariable("id") int idPatron) {
		return pservice.findById(idPatron);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int idPatron) {
		if(pservice.findById(idPatron) != null) {
			if(pservice.deleteOne(idPatron) == 1) {
				return "Patron eliminado";
			}else {
				return "Patron no eliminado";
			}
		}else {
			return "Patron no existente";
		}
	}
}
