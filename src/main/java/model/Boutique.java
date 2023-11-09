package model;


public class Boutique extends Adresse {

	private String nom;
	private String adresse;
	
	public Boutique(String numero, String rue, String ville, String nom, String adresse) {
		super(numero, rue, ville);
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public String getNom() {
		return nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
		
	public String toString() {
		return "Boutique [nom=" + nom + ", adresse=" + adresse + "]";
	}
	
}

