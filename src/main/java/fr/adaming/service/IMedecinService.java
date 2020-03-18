package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Medecin;

public interface IMedecinService {
	public Medecin addMedecin(Medecin med);
	public int deleteMedecin(long idM);
	public List<Medecin> listAllMedecin();
	public Medecin findMedecin(long idM);
	public Medecin updateMedecin(Medecin med);
}
