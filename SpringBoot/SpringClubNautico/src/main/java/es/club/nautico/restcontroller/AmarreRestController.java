package es.club.nautico.restcontroller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import es.club.nautico.entities.*;
import es.club.nautico.service.*;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/amarres")
public class AmarreRestController {

	@Autowired
	private AmarreService aservice;
	
	@PostMapping("/new")
	public String register(@RequestParam("cuota") double cuota) {
		
		Amarre Amarre = new Amarre();
		Amarre.setCuota(cuota);
		
		if(aservice.insertOne(Amarre) != null) {
			return "Amarre insertado correctamente";
		}
		return "Amarre no insertado";
	}
	
	@GetMapping("/all")
	public List<Amarre> findAll() {
		return aservice.findAll();
	}
	
	@PutMapping("/update/{id}")
	public String update(@PathVariable("id") int idAmarre, @RequestParam("cuota") double cuota ) {
		Amarre Amarre = aservice.findById(idAmarre);
		
		if(Amarre != null) {
			Amarre.setCuota(cuota);
			
			aservice.updateOne(Amarre);
			return "Amarre modificado";
		}else {
			return "Amarre no modificado";
		}
		
	}
	
	@GetMapping("/find/{id}")
	public Amarre findById(@PathVariable("id") int idAmarre) {
		return aservice.findById(idAmarre);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable("id") int idAmarre) {
		if(aservice.findById(idAmarre) != null) {
			if(aservice.deleteOne(idAmarre) == 1) {
				return "Amarre eliminado";
			}else {
				return "Amarre no eliminado";
			}
		}else {
			return "Amarre no existente";
		}
	}
}