package Personnage;

public class Gaulois {

	private String nom;
	private int force;
	private int effetPotion=1;

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
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
	
	public void boirePotion(int forcePotion) {
        this.effetPotion = forcePotion;
        parler("Merci Druide ! Ma force est maintenant multipliée par " + effetPotion);
    }
	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la mâchoire de"  + romain.getNom());
		romain.recevoirCoup((force * effetPotion) / 3);
		}

	
	 
}
