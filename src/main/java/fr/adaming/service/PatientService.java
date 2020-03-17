package fr.adaming.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.model.Patient;
import fr.adaming.repository.IPatientRepository;


@Service
public class PatientService implements IPatientService {
	
	@Autowired
	IPatientRepository patientrepository;

	
/***********************************
 * methode pour ajouter un patient *	
 ***********************************/
	@Override
	public int addPatient(Patient pat) {
		patientrepository.save(pat);
		return 1;
	}

	
	
/*************************************
 * methode pour supprimer un patient *	
 *************************************/
	@Override
	public int deletePatient(long idP) {
		Patient p = new Patient();
			p.setIdPatient(idP);
		patientrepository.delete(p);
		return 1;
	}

	

	
/**********************************************
 * methode pour afficher laliste des patients *
 **********************************************/
	@Override
	public List<Patient> listAllPatient() {
		return patientrepository.findAll();
	}
	
	
	
	
/**********************************************************
 * methode pour rechercher un patient  a partir de son id *
 **********************************************************/
	@Override
	public Patient findPatient(long idP) {
		Optional<Patient> p = patientrepository.findById(idP);
		return p.get();
	}

}
