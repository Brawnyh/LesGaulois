package Personnage;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	public Chaudron(int quantitePotion,int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public void remplirChaudron(int quantite , int forceP) {
		quantitePotion=quantitePotion + quantite;
		forcePotion = forcePotion + forceP ;
	}
	
	public boolean resterPotion() {
		if (quantitePotion<0) {
			return false;
		}else {
			return true;
		}
	
	}
	
	public int prendreLouche() {
		
	}
}
