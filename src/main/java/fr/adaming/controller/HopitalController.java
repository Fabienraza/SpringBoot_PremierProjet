package fr.adaming.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.adaming.model.Hopital;
import fr.adaming.service.IHopitalService;



@RestController
@RequestMapping ("hopital") //URL du Webservice, chemin vers cette classe HopitalController
public class HopitalController {
	
	
	
	@Autowired
	IHopitalService hopitalservice; 	//lien entre la partie service et le controller

	
/*****************************************************
 * methode permettant afficher la liste des hopitaux *
 *****************************************************/
	@GetMapping ("/all") 	//représente la methode get sur le controller "/hopital"
	public List<Hopital> getlisteHopitaux() {
		return hopitalservice.getAllHopital();
	}

	
	
/*********************************************************************************
 * methode du web service pour rechercher un hopital à partir de son identifiant *	
 *********************************************************************************/
	@GetMapping ("/find/{id}")
	public Hopital findHopitalByID(@PathVariable long id) {		//@PathVariable : correspond à la variable indiqué dans URI
		Hopital hop = new Hopital();
			hop = hopitalservice.findHopital(id);
		return hop;
	}
	
	
/**********************************************************
 * methode du web service pour ajouter un hopital dans BD *	
 **********************************************************/
	@PostMapping ("/add")
	public Hopital addHopital(@RequestBody Hopital hop) {
		return hopitalservice.addHopital(hop);
		
	}
	
	
/************************************************************************
 * methode du web sevice pour supprimer un hopital de la base de donnee *	
 ************************************************************************/
	@DeleteMapping("/delete/{id}")
	public int deleteHopitalById (@PathVariable long id) {
		hopitalservice.deleteHopital(id);
		return 1;
	}


/*****************************************************************
 * methode du web service pour modifier les données d'un hopital *
 *****************************************************************/
	@PutMapping ("/update/{id}")
	public Hopital updateHopitaldata (@PathVariable long id , @RequestBody Hopital hop) {
		Hopital hopitalAModifier = hopitalservice.findHopital(id);
			hopitalAModifier.setNomHopital(hop.getNomHopital());
			hopitalAModifier.setAdresseHopital(hop.getAdresseHopital());
			
		return hopitalservice.updateHopital(hopitalAModifier);
	}

	
	
}
