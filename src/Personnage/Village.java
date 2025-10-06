package Personnage;

public class Village {
    private String nom;
    private Gaulois chef; 
    private Gaulois[] villageois;
    private int nbVillageois = 0;

    public Village(String nom, Gaulois chef, int tailleMax) {
        this.nom = nom;
        this.chef = chef;
        this.villageois = new Gaulois[tailleMax - 1];
        chef.setVillage(nom);
    }

    public void ajouterVillageois(Gaulois gaulois) {
        if (nbVillageois < villageois.length) {
            villageois[nbVillageois] = gaulois;
            nbVillageois++;
            gaulois.setVillage(nom);
        } else {
            System.out.println("Le village est plein !");
        }
    }

    public Gaulois trouverVillageois(int numero) {
       
        int idx = numero - 1;
        if (idx >= 0 && idx < nbVillageois) {
            return villageois[idx];
        } else {
            System.out.println("Il n'y a pas autant d'habitants dans notre village !");
            return null;
        }
    }

    public void afficherVillageois() {
        System.out.println("Dans le village \"" + nom + "\" du chef " + chef.getNom());
        System.out.println("vivent les légendaires gaulois :");
        for (int i = 0; i < nbVillageois; i++) {
            if (villageois[i] != null) {
                System.out.println("- " + villageois[i].getNom());
            }
        }
    }

    // main demandé par le TP
    public static void main(String[] args) {
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
        Village village = new Village("Village des Irréductibles", abraracourcix, 30);

        // tester trouverVillageois(30) : ne doit pas lancer d'exception mais renvoyer null
        Gaulois g = village.trouverVillageois(30);
        System.out.println(g);

        // ajouter Astérix et tester
        Gaulois asterix = new Gaulois("Astérix", 8);
        village.ajouterVillageois(asterix);

        Gaulois gaulois1 = village.trouverVillageois(1);
        System.out.println(gaulois1 != null ? gaulois1.getNom() : null);

        Gaulois gaulois2 = village.trouverVillageois(2);
        System.out.println(gaulois2);

        // ajouter Obélix et afficher
        Gaulois obelix = new Gaulois("Obélix", 25);
        village.ajouterVillageois(obelix);
        village.afficherVillageois();

        // DoublePolémix
        Gaulois doublePolemix = new Gaulois("DoublePolémix", 4);

        abraracourcix.sePresenter(); // chef
        asterix.sePresenter();       // habitant
        doublePolemix.sePresenter(); // sans village
    }
}
