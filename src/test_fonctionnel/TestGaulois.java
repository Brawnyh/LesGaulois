package test_fonctionnel;

import Objets.Equipement;
import Personnage.Druide;
import Personnage.Gaulois;
import Personnage.Romain;
import Personnage.Village;

public class TestGaulois {
	
	public static void main(String[] args) {
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        Village village = new Village("Village des Irréductibles", abraracourcix, 30);

      
        Gaulois g = village.trouverVillageois(30);
        System.out.println(g);

        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);

        Gaulois gaulois1 = village.trouverVillageois(1);
        System.out.println(gaulois1 != null ? gaulois1.getNom() : null);

        Gaulois gaulois2 = village.trouverVillageois(2);
        System.out.println(gaulois2);

        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);
        village.afficherVillageois();

        Gaulois doublePolemix = new Gaulois("DoublePolémix", 4);

        abraracourcix.sePresenter(); // chef
        asterix.sePresenter();       // habitant
        doublePolemix.sePresenter(); // sans village
        
        
        //TEST EQUIPEMENT
        Romain Pleido = new Romain("Pleido",29);
		Pleido.sEquiper(Equipement.CASQUE);
		Pleido.sEquiper(Equipement.BOUCLIER);
		Pleido.sEquiper(Equipement.BOUCLIER);
		
		}


}
