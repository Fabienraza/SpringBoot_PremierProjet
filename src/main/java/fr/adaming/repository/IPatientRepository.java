package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.model.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Long> {

}
