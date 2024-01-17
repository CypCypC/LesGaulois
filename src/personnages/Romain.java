package personnages;

public class Romain {
	private String nom;
	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String parole) {
		System.out.println("le romain " + nom + " : " + parole);
	}

	public void recevoirCoup(int degat) {
		force = force - degat;
		if (force > 0) {
			parler("aie");
		} else {
			force = 0;
			parler("j'abandonne");
		}
	}
}
