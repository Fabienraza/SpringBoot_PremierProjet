package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Medecin {

/**************************************
 * Les Attributs de la classe medecin *	
 **************************************/
	private long idMedecin;
	private String nomMedecin;
	private String prenomMedecin;
	private String adresseMedecin;
	private Hopital hopital;
	

/**************************************
 * Constructeurs de la classe medecin *	
 **************************************/	
	public Medecin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Medecin(String nomMedecin, String prenomMedecin, String adresseMedecin) {
		super();
		this.nomMedecin = nomMedecin;
		this.prenomMedecin = prenomMedecin;
		this.adresseMedecin = adresseMedecin;
	}


	

/**********************************
 * Getter et Setter des attributs *	
 **********************************/
	
	@Id
	@GeneratedValue
	public long getIdMedecin() {
		return idMedecin;
	}

	public void setIdMedecin(long idMedecin) {
		this.idMedecin = idMedecin;
	}

	public String getNomMedecin() {
		return nomMedecin;
	}

	public void setNomMedecin(String nomMedecin) {
		this.nomMedecin = nomMedecin;
	}

	public String getPrenomMedecin() {
		return prenomMedecin;
	}

	public void setPrenomMedecin(String prenomMedecin) {
		this.prenomMedecin = prenomMedecin;
	}

	public String getAdresseMedecin() {
		return adresseMedecin;
	}

	public void setAdresseMedecin(String adresseMedecin) {
		this.adresseMedecin = adresseMedecin;
	}

	@JoinColumn(name = "idHopital")
	@ManyToOne
	public Hopital getHopital() {
		return hopital;
	}

	public void setHopital(Hopital hopital) {
		this.hopital = hopital;
	}

/*******************************************************
 * methode pour afficher les descritpions d'un medecin *	
 *******************************************************/	
	@Override
	public String toString() {
		return "Medecin [idMedecin=" + idMedecin + ", nomMedecin=" + nomMedecin + ", prenomMedecin=" + prenomMedecin
				+ ", adresseMedecin=" + adresseMedecin + ", hopital=" + hopital + "]";
	}



	
}
