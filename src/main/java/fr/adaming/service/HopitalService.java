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
	public int addHopital(Hopital hosp) {
		hopitalrepository.save(hosp);
		return 1;
	}



/************************************
 * methode pour modifier un hopital *
 ************************************/
	@Override
	public int updateHopital(long id) {
		Hopital hosp = new Hopital();
			hosp.setIdHopital(id);
		hopitalrepository.save(hosp);
		return 1;
	}


	
/*************************************
 * methode pour supprimer un hopital *
 *************************************/
	@Override
	public int deleteHopital(long id) {
		hopitalrepository.deleteById(id);
		return 1;
	}


/*******************************************************
 * methode pour chercher un hopital à partir de son id *	
 *******************************************************/
	@Override
	public Hopital findHopital(long id) {
		Optional<Hopital> hosp = hopitalrepository.findById(id);
		return hosp.get(); 
	}

}
