package Personnage;

public class Chaudron {
	private int quantitePotion;
	private int forcePotion;
	
	public Chaudron(int quantitePotion,int forcePotion) {
		this.quantitePotion = quantitePotion;
		this.forcePotion = forcePotion;
	}
	
	public void remplirChaudron(int quantite , int forceP) {
		this.quantitePotion= this.quantitePotion+quantite;
		this.forcePotion = this.forcePotion +forceP ;
	}
	
	public boolean resterPotion() {
		return quantitePotion>0;
	}
	
	public int prendreLouche() {
		if ( quantitePotion>0) {
			quantitePotion -=1;
		}
		
		return quantitePotion;
		
	}
	
	public void parler(String texte) {
		System.out.println("J'ai concoct�" + quantitePotion + "doses de potion magique. Elle a une force de " + forcePotion + ".");
		
	}
}
