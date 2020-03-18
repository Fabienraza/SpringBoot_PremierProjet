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
import fr.adaming.model.Medecin;
import fr.adaming.service.IHopitalService;
import fr.adaming.service.IMedecinService;

@RestController
@RequestMapping ("medecin")
public class MedecinController {

	@Autowired
	IMedecinService medecinservice; 	// Lien entre MedecinService et MedecinController
	
	@Autowired
	IHopitalService hopitalservice;		// Lien entre HopitalService et MedecinController
	
	
	
	
/**************************************************************************
 * Lien entre MedecinService et Controller pour ajouter un medecin dan BD *	
 **************************************************************************/
	@PostMapping ("/add")
	public Medecin createMedecindata(@RequestBody Medecin med) {
		return medecinservice.addMedecin(med);
	}

	
/******************************************************************************
 * Lien entre MedecinService et Controller pour supprimer un medecin de la BD *	
 ******************************************************************************/
	@DeleteMapping ("/delete/{id}")
	public int deleteMedecinOnDataB(@PathVariable long id) {
		medecinservice.deleteMedecin(id);
		return 1;
	}

	
/*****************************************************************************************
 * Lien entre MedecinService et Controller pour afficher la liste des medecin dans la BD *	
 *****************************************************************************************/
	@GetMapping ("/all")
	public List<Medecin> getListMedecin() {
		return medecinservice.listAllMedecin();
	}
	

	
/*********************************************************************************
 * Lien entre MedecinService et COntroller pour rechercher un medecin dans la BD *
 *********************************************************************************/
	@GetMapping ("find/{id}")
	public Medecin findMedeinById(@PathVariable long id) {
		return medecinservice.findMedecin(id);
	}
	

	
/**************************************************************************************
 * Lien entre MedecinService et Controller pour modifier les information d'un medecin *	
 **************************************************************************************/
	@PutMapping ("/update/{id}")
	public Medecin updateMedecinData(@PathVariable long id, @RequestBody Medecin med) {
		Medecin medecinAModif = medecinservice.findMedecin(id);
			medecinAModif.setNomMedecin(med.getNomMedecin());
			medecinAModif.setPrenomMedecin(med.getPrenomMedecin());
			medecinAModif.setAdresseMedecin(med.getAdresseMedecin());
		return medecinservice.updateMedecin(medecinAModif);
	}
	
	
	
/*********************************************************************************
 * Lien entre MedecinService et Controller pour affecter un hopital à un medecin *	
 *********************************************************************************/
	@PutMapping ("/addHopital/{idH}/to/{idM}")
	public Medecin addHopitalToMedecin(@PathVariable long idH , @PathVariable long idM) {
		Hopital hop = hopitalservice.findHopital(idH);
		
		Medecin medecinAModif = medecinservice.findMedecin(idM);
			medecinAModif.setHopital(hop);
		
		return medecinservice.updateMedecin(medecinAModif);
	}
	
	

	
}


