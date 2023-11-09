package model;

public class Boutique {

	private String nom;
	private Adresse adresse;
	
	public Boutique(String nom, Adresse adresse) {
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public String getNom() {
		return nom;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
		
	public String toString() {
		return "Boutique [nom=" + nom + ", adresse=" + adresse + "]";
	}
	
}

