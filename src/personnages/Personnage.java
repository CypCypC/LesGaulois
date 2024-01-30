package personnages;

public abstract class Personnage {
	private String nom;
	private int force;

	public Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	protected abstract String auteur();

	public void parler(String parole) {
		System.out.println(auteur() + nom + parole);
	}

	public void frapper(Personnage cible) {
		parler(" frappe " + cible.auteur() + cible.getNom());
		cible.recevoirCoup(force / 3);
	}

	public void recevoirCoup(int degat) {
		force = force - degat;
		if (force > 0) {
			parler(": \"aie\"");
		} else {
			force = 0;
			parler(": \"j'abandonne\"");
		}
	}
}
