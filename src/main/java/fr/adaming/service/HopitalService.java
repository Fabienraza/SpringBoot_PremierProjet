package fr.adaming.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.model.Hopital;
import fr.adaming.repository.IHopitalRepository;


@Service
public class HopitalService implements IHopitalService {
	
	@Autowired
	IHopitalRepository hopitalrepository;
	

/********************************************************************
 * methode pour afficher la liste des hopitaux de la base de donnee *	
 ********************************************************************/
	@Override
	public List<Hopital> getAllHopital() {
		return hopitalrepository.findAll();
	}

	
	
/***********************************
 * methode pour ajouter un hopital *
 ***********************************/
	@Override
	public Hopital addHopital(Hopital hosp) {
		try {
			return hopitalrepository.save(hosp);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERREUR DANS LA METHODE AJOUT HOPITAL");
			return null;
		}
	}


	
/*************************************
 * methode pour supprimer un hopital *
 *************************************/
	@Override
	public int deleteHopital(long idH) {
		try {
			hopitalrepository.deleteById(idH);
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERREUR DANS LA METHODE SUPPRESSION HOPITAL");
			return 0;
		}
	}


/*******************************************************
 * methode pour chercher un hopital à partir de son id *	
 *******************************************************/
	@Override
	public Hopital findHopital(long idH) {
		Optional<Hopital> hopitalOptional = hopitalrepository.findById(idH);
		
		Hopital hop = new Hopital();
		
		if(hopitalOptional.isPresent() == true) //methode isPresent() retourne true si l'id est present dans la BD
			{
			hop = hopitalOptional.get();
			}
		
		return hop; 
	}


	
/*******************************************************
 * Methode pour mettre à jour des donnees d'un hopital *
 *******************************************************/
	@Override
	public Hopital updateHopital(Hopital hopital) {
		try {
			return hopitalrepository.save(hopital);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERREUR DANS LA METHODE MODIFIER");
			return null;
		}
	}
	
	

}
