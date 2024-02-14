package personnages;

public class Gaulois extends Personnage {
//	private String nom;
//	private int force;
//
//	public Gaulois(String nom, int force) {
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
//		System.out.println("le gaulois " + nom + parole);
//	}
//
//	public void frapper(Romain romain) {
//		parler(" frappe le romain " + romain.getNom());
//		romain.recevoirCoup(force / 3);
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

	private int forceBase = getForce();
	private double forceBoost;
	
	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	protected String auteur() {
		return "Le Gaulois ";
	}
	
	public void boirePotion(Potion potion) {
		this.forceBoost = potion.getForce();
	}
	
	@Override
		protected int calculForceFrappe() {
			int forcePotion = super.calculForceFrappe();
			forcePotion = (int) (forcePotion * this.forceBoost);
			usagePotion();
			return forcePotion;
		}
	
	public void usagePotion() {
		if (this.forceBoost > 1) {
			this.forceBoost = this.forceBoost - 0.5;
			modifierForce((int) (this.forceBase * this.forceBoost));
		}
	}
	
}