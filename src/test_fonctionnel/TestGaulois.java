package test_fonctionnel;

import Personnage.Gaulois;
import Personnage.Romain;

public class TestGaulois {
	
	public static void main(String[] args) {
		Gaulois Asterix= new Gaulois("Ast�rix",8);
		Gaulois Obelix = new Gaulois("Ob�lix",16);
		Romain Minus = new Romain("Minus",6);
		
		Asterix.parler("Bonjour Ob�lix.");
		Obelix.parler("Bonjour Ast�rix. Ca te dirais d'aller chasser des sangliers?");
		Asterix.parler("Oui tr�s bonne id�e.");
		System.out.println("Dans la for�t Ast�rix et Ob�lix tombent nez � nez sur le romain Minus.");
		for (int i=0;i<=3;i++) {
			Obelix.frapper(Minus);
		}
		
		
		}


}
