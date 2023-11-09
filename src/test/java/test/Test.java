package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Achat;
import model.Adresse;
import model.Boutique;
import model.Client;
import model.Jeu;
import model.Salon;
import model.Hybride;


public class Test {

	public static void main(String[] args) {
		
		Salon c1 = new Salon("XBOX", 479.99, LocalDate.of(2001, 11, 15));
		Salon c2 = new Salon("PS3", 600.20, LocalDate.of(2007, 3, 23));
		Hybride c3 = new Hybride("Switch", 329.99, LocalDate.of(2017, 3, 3));
		
		Jeu j1 = new Jeu("Mario", c1);
		Jeu j2 = new Jeu("Zelda", c2);
		Jeu j3 = new Jeu("Animal crossing", c3);
		Jeu j4 = new Jeu("assassin's creed", c2);
		Jeu j5 = new Jeu("fifa", c2);

		Achat a1 = new Achat(j1, LocalDate.now(), 20);
		Achat a2 = new Achat(j2, LocalDate.now(), 30); 
		Achat a3 = new Achat(j3, LocalDate.now(), 10);  
		
		List<Achat> l1 = new ArrayList();
			l1.add(a1);
			l1.add(a3);
			
		List<Achat> l2 = new ArrayList();
			l2.add(a2);
			l2.add(a3);	
		
        Client client1 = new Client("Saquet", "Frodon",l1);
        Client client2 = new Client("Gamegie", "Sam",l2);
        Adresse adresse1 = new Adresse("1", "Cul-de-Sac", "Hobbiteville");
        Boutique boutique1 = new Boutique("La maison de Bilbo", adresse1);
	}

}
