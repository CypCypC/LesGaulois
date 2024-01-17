package personnages;

public class Gaulois {
	private String nom;
	private int force;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String parole) {
		System.out.println("le gaulois " + nom + " : " + parole);
	}

	public void frapper(Romain romain) {
		parler("frappe le romain " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

}