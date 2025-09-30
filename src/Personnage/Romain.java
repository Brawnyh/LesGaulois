package Personnage;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceG) {
		
		if (force>=1) {
			force=force-forceG;
			parler( "AUCHHHH!");
			
		}else {
			parler("j'abandonne");
		}
		
	}


	//hello world
	
	
}


