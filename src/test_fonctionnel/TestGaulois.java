package test_fonctionnel;

import Personnage.Gaulois;

public class TestGaulois {
	
	public static void main(String[] args) {
		Gaulois Asterix= new Gaulois("Ast�rix",8);
		Gaulois Obelix = new Gaulois("Ob�lix",16);
		Asterix.parler("Bonjour Ob�lix.");
		Obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers?");
		Asterix.parler("Oui tr�s bonne id�e.");
		
		}


}
