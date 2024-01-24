package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		asterix.parler(": Bonjour à tous");
		minus.parler(": UN GAU.. UN GAUGAU...");
		for (int i = 0; i < 3; i++) {
			if (asterix.getForce() > 0) {
				asterix.frapper(minus);
			}
			if (minus.getForce() > 0) {
				minus.frapper(asterix);
			}
		}
	}
}