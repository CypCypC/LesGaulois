package personnages;

public class Potion {
	private int quantite;
	private int force;

	public Potion(int quantite, int force) {
		this.quantite = quantite;
		this.force = force;
	}

	// Méthode pour obtenir le nom de la potion
	public int getQuantite() {
		return quantite;
	}

	// Méthode pour obtenir l'effet de la potion
	public int getForce() {
		return force;
	}

}
