package sites;

import personnages.Gaulois;

public class Village {
    private Gaulois chef;
    private Gaulois[] villageois;
    private int nombreVillageois;

    public Village(Gaulois chef) {
        this.chef = chef;
        this.villageois = new Gaulois[4];
        this.nombreVillageois = 0;
    }

    public Gaulois getChef() {
        return chef;
    }

    public void ajouterVillageois(Gaulois villageois) {
        if (nombreVillageois < 4) {
            this.villageois[nombreVillageois++] = villageois;
            chef.parler(": \"Bienvenue " + villageois.getNom() + " !\"");
        } else {
            chef.parler(" : \"Désolé " + villageois.getNom() + ", mon village est déjà bien rempli !\"");
        }
    }
    
    public void afficherVillage() {
        System.out.println("Village de " + chef.getNom() + " est habité par :");
        for (int i = 0; i < nombreVillageois; i++) {
            System.out.println("- " + villageois[i].getNom());
        }
    }
    
    public void changerChef(Gaulois nouveauChef) {
    	chef.parler(" : \" Je laisse mon grand bouclier au grand " + nouveauChef.getNom() + ".\"");
    	nouveauChef.parler(" : \" Merci !\"");
        chef = nouveauChef;
    }
}