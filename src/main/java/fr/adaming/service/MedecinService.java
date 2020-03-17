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
		medecinrepository.save(med);
		return 1;
	}

	
/*************************************
 * methode pour supprimer un medecin *	
 *************************************/
	@Override
	public int deleteMedecin(long id) {
		medecinrepository.deleteById(id);
		return 1;
	}

	
/********************************************
 * methode pour modifier infos d'un medecin *	
 ********************************************/
	@Override
	public int updateMedecin(long id) {
		Medecin med = new Medecin();
			med.setIdMedecin(id);
		medecinrepository.save(med);
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
	public Medecin findMedecin(long id) {
		Optional<Medecin> med = medecinrepository.findById(id);
		return med.get();
	}

	
}
