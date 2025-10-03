package Personnage;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron(0,0);
	public Druide(String nom,int force) {
		this.nom=nom;
		this.force=force;
		this.chaudron = chaudron;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void fabriquerPotion(int quantite,int forceP) {
		chaudron.remplirChaudron(quantite,forceP);
		parler("J'ai concoct�" + " " + quantite + " " + "doses de potion magique. Elle a une force de " + forceP + ".");
	}
	
	public void booster(Gaulois gaulois) {
		if (chaudron.resterPotion()) {
			
			if (gaulois.getNom() == "Ob�lix") {
				parler("Non, " + gaulois.getNom() + " ! Et tu le sais tr�s bien !");
			}else {
				gaulois.boirePotion(chaudron.prendreLouche());
				parler("Tiens " + gaulois.getNom() + ", voil� une louche de potion !");
			}
			
	    } else {
	    	parler("D�sol� " + gaulois.getNom() + ", il n'y a plus une seule goutte de potion.");
		}
		
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\"");
	}

	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	
	
	

}
