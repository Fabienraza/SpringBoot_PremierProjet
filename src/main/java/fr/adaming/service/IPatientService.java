package fr.adaming.service;

import java.util.List;
import fr.adaming.model.Patient;

public interface IPatientService {
	public int addPatient (Patient pat);
	public int deletePatient(long idP);
	public List<Patient> listAllPatient();
	public Patient findPatient(long idP);

}
