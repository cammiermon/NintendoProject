package test;

import java.time.LocalDate;

import model.Adresse;
import model.Boutique;
import model.Client;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		
		Console c1 = new Console("XBOX", 479.99, LocalDate.of(2001, 11, 15));
		Console c2 = new Console("PS3", 600.20, LocalDate.of(2007, 3, 23));
		Console c3 = new Console("Switch", 329.99, LocalDate.of(2017, 3, 3));
		
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
