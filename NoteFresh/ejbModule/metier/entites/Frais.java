package metier.entites;

import java.io.Serializable;

public class Frais implements Serializable {

	private String designation;
	private Double montant;
	private Byte justificatif;
	private Projet project;
	public Frais() {
		super();
	}
	public Frais(String designation, Double montant, Byte justificatif, Projet project) {
		super();
		this.designation = designation;
		this.montant = montant;
		this.justificatif = justificatif;
		this.project = project;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Byte getJustificatif() {
		return justificatif;
	}
	public void setJustificatif(Byte justificatif) {
		this.justificatif = justificatif;
	}
	public Projet getProject() {
		return project;
	}
	public void setProject(Projet project) {
		this.project = project;
	}
	
	
	
	
}
