package fr.adaming.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Medecin;
import fr.adaming.model.Patient;
import fr.adaming.service.IMedecinService;
import fr.adaming.service.IPatientService;


@RestController
@RequestMapping ("patient")
public class PatientController {
	
	
	@Autowired
	IPatientService patientservice;		 // Lien entre PatientService et PatientController
	
	@Autowired
	IMedecinService medecinservice;		// Lien entre MedecintService et PatientController
	
	
	
/*******************************************************************************
 *  Lien entre PatientService et Controller pour ajouter un patient dans la BD *	
 *******************************************************************************/
	@GetMapping ("/add")
	public Patient addPatientData(@RequestBody Patient patient){
		return patientservice.addPatient(patient);
	}
	
	
/*******************************************************************************
 * 	Lien entre PatientService et Controller pour supprimer un patient de la BD *
 *******************************************************************************/
	@DeleteMapping ("/delete/{id}")
	public int deletePatientData(@ RequestBody long id) {
		patientservice.deletePatient(id);
		return 1;
	}
	
	
/*******************************************************************************
 * Lien entre PatientService et Controller pour afficher la liste des Patients *	
 *******************************************************************************/
	@GetMapping("/all")
	public List<Patient> getListPatient() {
		return patientservice.listAllPatient();
	}
	
	
/*********************************************************************
 * Lien entre PatientService et Controller pour rechercherun patient *	
 *********************************************************************/
	@GetMapping ("/find/{id}")
	public Patient findPatientData(@PathVariable long id) {
		return patientservice.findPatient(id);
	}
	
	
	
/*************************************************************************
 * Lien entre PatientService et Controller pour modifier donnees patient *	
 *************************************************************************/
	@PutMapping ("/update/{id}")
	public Patient updatePatientData(@PathVariable long id , @RequestBody Patient p) {
		Patient patientAModif = patientservice.findPatient(id);
			patientAModif.setNomPatient(p.getNomPatient());
			patientAModif.setPrenomPatient(p.getPrenomPatient());
			patientAModif.setDateDeNaissance(p.getDateDeNaissance());
			patientAModif.setPathologie(p.getPathologie());
	
		return patientservice.addPatient(patientAModif);
	}
	

/*********************************************************************************
 * Lien entre PatientService et Controller pour affecter un	medecin à un patient *
 *********************************************************************************/
	@PutMapping ("/addMedecin/{idM}/to/{idP}")
	public Patient addMedecinToPatient(@PathVariable long idM, @PathVariable long idP) {
		Medecin docteur = medecinservice.findMedecin(idM);
		
		Patient patientAModif = patientservice.findPatient(idP);
			patientAModif.setMedecin(docteur);
		
		return patientservice.updatePatient(patientAModif);
	}
	
	
	
}
