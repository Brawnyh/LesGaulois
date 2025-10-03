package test_fonctionnel;

import Personnage.Druide;
import Personnage.Gaulois;
import Personnage.Romain;

public class TestGaulois {
	
	public static void main(String[] args) {
		Gaulois Asterix= new Gaulois("Astérix",8);
		Gaulois Obelix = new Gaulois("Obélix",16);
		Romain Minus = new Romain("Brutus",14);
		Druide Panoramix =new Druide("Panoramix",2);
		
		
		
		Panoramix.fabriquerPotion(4, 3);
		
		Panoramix.booster(Obelix);
		Panoramix.booster(Asterix);
		for (int i=0;i<3;i++) {
			Asterix.frapper(Minus);
		}
		
		
		}


}
