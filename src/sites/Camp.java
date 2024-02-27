package sites;

import personnages.Grade;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;
	private Soldat[] soldats;
	private int nombreSoldats;

	public Camp(Soldat commandant) {
		this.commandant = commandant;
		this.soldats = new Soldat[3];
		this.nombreSoldats = 0;
	}

	public Soldat getCommandant() {
		return commandant;
	}

	public void ajouterSoldat(Soldat soldat) {
		if (nombreSoldats < 3) {
			this.soldats[nombreSoldats++] = soldat;
			soldat.parler("Je mets mon épée au service de Rome dans le camp dirigé par "
					+ commandant.getNom() + ".");
		} else {
			commandant.parler("Désolé " + soldat.getNom()
					+ ", notre camp est complet !");
		}
	}

	public void afficherCamp() {
		System.out.println("Le camp dirigé par " + commandant.getNom() + " contient les soldats :");
		for (int i = 0; i < nombreSoldats; i++) {
			System.out.println("- " + soldats[i].getNom());
		}
	}

	public void changerCommandant(Soldat nouveauCommandant) {
		if (nouveauCommandant.getGrade().equals(Grade.CENTURION)) {
			commandant.parler("Je laisse mon rôle à "
					+ nouveauCommandant.getNom() + ".");
			nouveauCommandant.parler("Moi " + nouveauCommandant.getNom()
					+ ", je prends la direction du camp romain.");
			commandant = nouveauCommandant;
		} else {
			commandant.parler("Je ne peux pas laisser la direction du camp à un non-centurion.");
		}
	}
}