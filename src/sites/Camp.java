package sites;

import personnages.Centurion;
import personnages.Soldat;

public class Camp {
	private Soldat commandant;

	public Camp(Centurion commandant) {
		this.commandant = commandant;
	}

	public Soldat getCommandant() {
		return commandant;
	}
}