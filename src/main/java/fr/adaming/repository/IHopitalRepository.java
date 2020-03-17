package fr.adaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.adaming.model.Hopital;


public interface IHopitalRepository extends JpaRepository<Hopital, Long> {

}
