package Personnage;

public class Gaulois {

	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", getNom()=" + getNom() + ", prendreParole()="
				+ prendreParole() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
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
		return "Le gaulois " + nom + " : ";
	}
	
	public static void main(String[] args) {
		Gaulois Asterix= new Gaulois("Asterix",8);
		
		System.out.println(Asterix);
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la mâchoire de"  + romain.getNom());
		romain.recevoirCoup(force / 3);
		}

}
