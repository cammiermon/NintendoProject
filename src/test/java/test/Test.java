package test;

import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		
		Console c1 = new Console("XBOX");
		Console c2 = new Console("PS3");
		Console c3 = new Console("Switch");
		
		Jeu j1 = new Jeu("Mario", c1);
		Jeu j2 = new Jeu("Zelda", c2);
		Jeu j3 = new Jeu("Animal crossing", c3);
		Jeu j4 = new Jeu("assassin's creed", c2);
		Jeu j5 = new Jeu("fifa", c2);

        Client client1 = new Client("Saquet", "Frodon");
        Client client2 = new Client("Gamegie", "Sam");
        Adresse adresse1 = new Adresse("1", "Cul-de-Sac", "Hobbiteville");
        Boutique boutique1 = new Boutique("La maison de Bilbo", adresse1);
	}

}
