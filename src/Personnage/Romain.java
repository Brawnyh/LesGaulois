package Personnage;

import Objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	
    private Equipement[] equipements = new Equipement[2];
    private int nbEquipement = 0;
	

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert isInvariantVerified();
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


    private boolean isInvariantVerified() {
        return force >= 0;
    }
    
    
    public void sEquiper(Equipement equipement) {
        switch (nbEquipement) {
            case 0:
                equipements[0] = equipement;
                nbEquipement++;
                afficherEquipementAction("s'équipe avec un", equipement);
                break;
            case 1:
                if (equipements[0] == equipement) {
                    System.out.println("Le soldat " + nom + " possède déjà un " + equipement + " !");
                } else {
                    equipements[1] = equipement;
                    nbEquipement++;
                    afficherEquipementAction("s'équipe avec un", equipement);
                }
                break;
            default:
                System.out.println("Le soldat " + nom + " est déjà bien protégé !");
                break;
        }
    }

    private void afficherEquipementAction(String action, Equipement e) {
        System.out.println("Le soldat " + nom + " " + action + " " + e + ".");
    }
	
    

}


