package Personnage;

public class Druide {
	private String nom;
	private int force;
	
	public Druide(String nom,int force) {
		this.nom=nom;
		this.force=force;
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public void fabriquerPotion(int quantite,int forcePotion) {
		
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	

}
