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
			System.out.println(
					"Le romain " + soldat.getNom() + " : \"Je mets mon épée au service de Rome dans le camp dirigé par "
							+ commandant.getNom() + "\".");
		} else {
			System.out.println("Le romain " + commandant.getNom() + " : \"Désolé " + soldat.getNom()
					+ ", notre camp est complet !\"");
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
			System.out.println("Le romain " + commandant.getNom() + " : \"Je laisse mon rôle à "
					+ nouveauCommandant.getNom() + ".\"");
			System.out.println("Le romain " + nouveauCommandant.getNom() + " : \"Moi " + nouveauCommandant.getNom()
					+ ", je prends la direction du camp romain.\"");
			commandant = nouveauCommandant;
		} else {
			System.out.println("Le romain " + commandant.getNom()
					+ " : \"Je ne peux pas laisser la direction du camp à un non-centurion.\"");
		}
	}
}