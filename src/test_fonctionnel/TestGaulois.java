package test_fonctionnel;
import equipement.Casque;
import equipement.Plastron;
import equipement.Bouclier;
import personnages.Gaulois;
import personnages.Druide;
import personnages.Grade;
import personnages.Soldat;
import personnages.Centurion;
import sites.Village;
import sites.Camp;

public class TestGaulois {
	public static void main(String[] args) {

        Druide panoramix = new Druide("Panoramix");
        panoramix.concocterPotion(3);

		Gaulois asterix = new Gaulois("Astérix", 5);
		Centurion minus = new Centurion("Minus", 6);
        panoramix.boirePotion(asterix, panoramix.getPotion());
        
        Casque casque = new Casque();
        Plastron plastron = new Plastron();
        Bouclier bouclier = new Bouclier();
        minus.equiperCasque(casque);
        minus.equiperPlastron(plastron);
        minus.equiperBouclier(bouclier);
        
		asterix.parler("Bonjour à tous");
		minus.parler("UN GAU.. UN GAUGAU...");
		while ((asterix.getForce() > 0) & (minus.getForce() > 0)) {
			if (asterix.getForce() > 0) {
				asterix.frapper(minus);
			}
			if (minus.getForce() > 0) {
				minus.frapper(asterix);
			}
		}
		
//		Gaulois vercingetorix = new Gaulois("Vercingétorix", 5);
//		Gaulois agecanonix = new Gaulois("Agecanonix", 1);
//		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
//		Gaulois obelix = new Gaulois("Obelix", 15);
//		Gaulois prolix = new Gaulois("Prolix", 2);
//        panoramix.boirePotion(obelix, panoramix.getPotion());
//
//		// Création des soldats
//		Soldat brutus = new Soldat("Brutus", 2,Grade.CENTURION);
//		Soldat milexcus = new Soldat("Milexcus", 2,Grade.OPTIO);
//		Soldat tulliusOctopus = new Soldat("Tullius Octopus", 2,Grade.TESSERARIUS);
//		Soldat ballondebaudrus = new Soldat("Ballondebaudrus", 3,Grade.SOLDAT);
//
//        Village village = new Village(vercingetorix);
//        vercingetorix.parler("Je suis un grand guerrier et je vais créer mon village.");
//
//        Camp camp = new Camp(minus);
//
//		// Ajout des gaulois au village
//		village.ajouterVillageois(agecanonix);
//		village.ajouterVillageois(assurancetourix);
//		village.ajouterVillageois(asterix);
//		village.ajouterVillageois(obelix);
//		village.ajouterVillageois(prolix);
//
//		// Ajout des soldats au camp
//		camp.ajouterSoldat(brutus);
//		camp.ajouterSoldat(milexcus);
//		camp.ajouterSoldat(tulliusOctopus);
//		camp.ajouterSoldat(ballondebaudrus);
//
//        village.afficherVillage();
//        camp.afficherCamp();
//        
//        Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
//        Soldat briseradius = new Soldat("Briseradius", 4, Grade.SOLDAT);
//        Soldat chorus = new Soldat("Chorus", 4, Grade.CENTURION);
//        
//        // Changement de chef et de commandant
//        village.changerChef(abraracourcix);
//        camp.changerCommandant(briseradius);
//        camp.changerCommandant(chorus);
//
//        // Affichage après les changements
//        village.afficherVillage();
//        camp.afficherCamp();
//        
	}
}