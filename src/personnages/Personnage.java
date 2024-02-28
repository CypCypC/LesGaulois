package personnages;

public abstract class Personnage {
	private String nom;
	protected int force;

	protected Personnage(String nom, int force) {
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
		System.out.println(auteur() + nom + ": \"" + parole +"\"");
	}

	public void frapper(Personnage cible) {
		if (cible.getForce() > 0) {
			parler(" frappe " + cible.auteur() + cible.getNom() + " avec une force de " + calculForceFrappe());
			cible.recevoirCoup(calculForceFrappe());
		}
		else {
			parler("il est déjà a terre.");
		}
	}

	protected int calculForceFrappe() {
		return (force/3);
	}
	
	public void recevoirCoup(int degat) {
		force = force - Math.max(1, degat);
		if (force > 0) {
			parler("aie");
		} else {
			force = 0;
			parler("j'abandonne");
		}
	}
	public void modifierForce(int nouvelleForce) {
		this.force = nouvelleForce;
	}
	
}
