package personnages;
import equipement.Equipement;

public class Romain extends Personnage {
//	private String nom;
//	private int force;

//	public Romain(String nom, int force) {
//		this.nom = nom;
//		this.force = force;
//	}
//
//	public String getNom() {
//		return nom;
//	}
//	
//	public int getForce() {
//		return force;
//	}
//
//	public void parler(String parole) {
//		System.out.println("le romain " + nom + parole);
//	}
//
//	public void recevoirCoup(int degat) {
//		force = force - degat;
//		if (force > 0) {
//			parler(": aie");
//		} else {
//			force = 0;
//			parler(": j'abandonne");
//		}
//	}
//
//	public void frapper(Gaulois gaulois) {
//		parler(" frappe le gaulois " + gaulois.getNom());
//		gaulois.recevoirCoup(force / 3);
//	}
    private Equipement[] equipements;
    public void equiperCasque(equipement.Casque casque) {
        equipements[0] = casque;
        parler("je m'équipe d'un casque");
    }

    public void equiperPlastron(equipement.Plastron plastron) {
        equipements[1] = plastron;
        parler("je m'équipe d'un plastron");
    }

    public void equiperBouclier(equipement.Bouclier bouclier) {
        equipements[2] = bouclier;
        parler("je m'équipe d'un bouclier");
    }
    

	public Romain(String nom, int force) {
		super(nom, force);
		this.equipements = new Equipement[3];
	}

	@Override
	protected String auteur() {
		return "Le Romain ";
	}
	
	@Override
	public void recevoirCoup(int degat) {
	    for (Equipement equipement : equipements) {
	        if (equipement != null) {
	            degat -= equipement.getBonus();
	            System.out.println("Le " + equipement.getNomEquipement() + " absorbe " + equipement.getBonus() + " du coup.");
	        }
	    }

	    force = force - degat;

	    if (force > 0) {
	        parler("aie");
	    } else {
	        force = 0;
	        parler("j'abandonne");
	    }
	}

}
