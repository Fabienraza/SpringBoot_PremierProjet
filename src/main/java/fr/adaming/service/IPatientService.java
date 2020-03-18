package fr.adaming.service;

import java.util.List;
import fr.adaming.model.Patient;

public interface IPatientService {
	public Patient addPatient (Patient pat);
	public int deletePatient(long idP);
	public List<Patient> listAllPatient();
	public Patient findPatient(long idP);
	public Patient updatePatient (Patient patient);

}
