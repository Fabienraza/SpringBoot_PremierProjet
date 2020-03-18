package fr.adaming;

import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import fr.adaming.model.Hopital;
import fr.adaming.model.Medecin;
import fr.adaming.model.Patient;
import fr.adaming.repository.IHopitalRepository;
import fr.adaming.service.HopitalService;
import fr.adaming.service.IHopitalService;
import fr.adaming.service.IMedecinService;
import fr.adaming.service.IPatientService;



@SpringBootApplication
public class PremierProjetSpringBootApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(PremierProjetSpringBootApplication.class, args);
		

	}
	
	
	
	
	@Autowired
	IMedecinService med;
	
	@Autowired
	IHopitalService hop;
	
	@Autowired
	IPatientService pat;
	
	@Override
	public void run(String... args) throws Exception {
	
		
		//TEST DES METHODES DECRITES DANS SERVICE//

//	Patient p1 = new Patient();
//		p1.setNomPatient("AZERTY");
//		p1.setPrenomPatient("Alphonse");
//		p1.setDateDeNaissance(new Date(2020-05-15));
//		p1.setPathologie("Cyrrhose");
//		p1.setMedecin(med.findMedecin(6));
//
//	pat.addPatient(p1);
		
		//AJOUT D'UN HOPITAL DANS LA BD
//	Hopital hosp = new Hopital("CLCC Curie", "Paris");
//	hop.addHopital(hosp);
	
	
		
	}

}
