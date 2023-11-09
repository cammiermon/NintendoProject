package model;

import java.util.List;

public class Client {

	    private String nom;
	    private String prenom;
	    private List<Achat> listachat;
	    
		public Client(String nom, String prenom, List<Achat> listachat) {
			this.nom = nom;
			this.prenom = prenom;
			this.listachat = listachat;
		}

		public String getNom() {
			return nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		
		public List getListachat() {
			return listachat;
		}

		public void setListachat(List<Achat> listachat) {
			this.listachat = listachat;
		}

		@Override
		public String toString() {
			return "Client [nom=" + nom + ", prenom=" + prenom + ", listachat="
					+ listachat + "]";
		}

		
	
}
