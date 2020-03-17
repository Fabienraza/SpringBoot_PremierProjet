package fr.adaming.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.model.Medecin;
import fr.adaming.repository.IMedecinRepository;


@Service
public class MedecinService implements IMedecinService {
	
	@Autowired
	IMedecinRepository medecinrepository;
	
	
/***********************************
 * methode pour ajouter un médecin *	
 ***********************************/
	@Override
	public int addMedecin(Medecin med) {
		try {
			medecinrepository.save(med);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERREUR DANS LA METHODE AJOUT MEDECIN");
			return 0;
		}
	}

	
/*************************************
 * methode pour supprimer un medecin *	
 *************************************/
	@Override
	public int deleteMedecin(long idM) {
		medecinrepository.deleteById(idM);
		return 1;
	}


	
/**********************************************************************
 * methode pour afficher la liste des medecins dans la base de donnée *
 **********************************************************************/
	@Override
	public List<Medecin> listAllMedecin() {
		return medecinrepository.findAll();
	}

	
/*******************************************************
 * methode pour chercher un medecin a partir de son iD *
 *******************************************************/
	@Override
	public Medecin findMedecin(long idM) {
		Optional<Medecin> med = medecinrepository.findById(idM);
		return med.get();
	}

	
}
