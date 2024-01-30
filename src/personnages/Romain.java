package personnages;

public class Romain extends Personnage {
	private String nom;
	private int force;

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
	public Romain(String nom, int force) {
		super(nom, force);
	}

	@Override
	protected String auteur() {
		return "Le Romain ";
	}

}
