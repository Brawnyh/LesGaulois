package test_fonctionnel;

import Personnage.Gaulois;

public class TestGaulois {
	
	public static void main(String[] args) {
		Gaulois Asterix= new Gaulois("Astérix",8);
		Gaulois Obelix = new Gaulois("Obélix",16);
		Asterix.parler("Bonjour Obélix.");
		Obelix.parler("Bonjour Astérix. Ca te dirais d'aller chasser des sangliers?");
		Asterix.parler("Oui très bonne idée.");
		
		}


}
