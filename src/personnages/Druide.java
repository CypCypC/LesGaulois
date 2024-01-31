package personnages;

import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
	private Potion potion;
	Random random;

	public Druide(String nom) {
		super(nom, 0);
	}
	
	public Potion getPotion() {
		return potion;
	}

	public Potion concocterPotion(int quantiteConcocte) {
		try {
			random = SecureRandom.getInstanceStrong();
			potion = new Potion(quantiteConcocte, random.nextInt(5) + 2);
			int forcePotion = potion.getForce();

			parler(" : \"J'ai concocté " + quantiteConcocte + " dose de potion magique, Elle a une force de "
					+ forcePotion + "\"");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return potion;
	}

}
