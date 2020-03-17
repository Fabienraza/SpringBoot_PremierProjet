package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Medecin;

public interface IMedecinService {
	public int addMedecin(Medecin med);
	public int deleteMedecin(long id);
	public int updateMedecin(long id);
	public List<Medecin> listAllMedecin();
	public Medecin findMedecin(long id);
}
