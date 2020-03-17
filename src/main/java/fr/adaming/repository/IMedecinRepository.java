package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.adaming.model.Medecin;


public interface IMedecinRepository extends JpaRepository<Medecin, Long> {

}
