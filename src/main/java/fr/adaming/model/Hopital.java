package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
//@Table (name = "tb_hopital") pour donner un nom personnaliser à la table hopital dans mySQL
public class Hopital {
	
/**************************************
 * Les Attributs de la classe hopital *	
 **************************************/
	private long idHopital;
	private String nomHopital;
	private String adresseHopital;
	
	
	
	
/**************************************
 * Constructeurs de la classe hopital *	
 **************************************/
	public Hopital() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Hopital(String nomHopital, String adresseHopital) {
		super();
		this.nomHopital = nomHopital;
		this.adresseHopital = adresseHopital;
	}



/**********************************
 * Getter et Setter des attributs *	
 **********************************/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	// @Column (name="id_hopital") pour donner un nom personnaliser à la colonne idHopital dans mySQL
	public long getIdHopital() {
		return idHopital;
	}

	public void setIdHopital(long idHopital) {
		this.idHopital = idHopital;
	}

	public String getNomHopital() {
		return nomHopital;
	}

	public void setNomHopital(String nomHopital) {
		this.nomHopital = nomHopital;
	}

	public String getAdresseHopital() {
		return adresseHopital;
	}

	public void setAdresseHopital(String adresseHopital) {
		this.adresseHopital = adresseHopital;
	}
	
/*******************************************************
 * methode pour afficher les descritpions d'un hopital *	
 *******************************************************/
	@Override
	public String toString() {
		return "Hopital [idHopital=" + idHopital + ", nomHopital=" + nomHopital + ", adresseHopital=" + adresseHopital
				+ "]";
	}
	

}
