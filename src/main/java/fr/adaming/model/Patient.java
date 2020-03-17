package fr.adaming.model;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Patient {

/**************************************
 * Les Attributs de la classe patient *	
 **************************************/	
	private long idPatient;
	private String nomPatient;
	private String prenomPatient;
	private Date dateDeNaissance;
	private String pathologie;
	private Medecin medecin;
	
	
	
/**************************************
 * Constructeurs de la classe patient *	
 **************************************/	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Patient(String nomPatient, String prenomPatient, Date dateDeNaissance) {
		super();
		this.nomPatient = nomPatient;
		this.prenomPatient = prenomPatient;
		this.dateDeNaissance = dateDeNaissance;
	}


	

/**********************************
 * Getter et Setter des attributs *	
 **********************************/	
	@Id
	@GeneratedValue
	public long getIdPatient() {
		return idPatient;
	}

	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
	}

	public String getNomPatient() {
		return nomPatient;
	}

	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}

	public String getPrenomPatient() {
		return prenomPatient;
	}

	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getPathologie() {
		return pathologie;
	}

	public void setPathologie(String pathologie) {
		this.pathologie = pathologie;
	}

	@JoinColumn(name = "idMedecin")
	@ManyToOne
	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	
	
	
/*******************************************************
 * methode pour afficher les descritpions d'un medecin *	
 *******************************************************/	
	@Override
	public String toString() {
		return "Patient [idPatient=" + idPatient + ", nomPatient=" + nomPatient + ", prenomPatient=" + prenomPatient
				+ ", dateDeNaissance=" + dateDeNaissance + ", pathologie=" + pathologie + ", medecin=" + medecin + "]";
	}

	
	

}
