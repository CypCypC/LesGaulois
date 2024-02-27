package equipement;

public abstract class Equipement {
    protected int bonus;
    private String nom;

    protected Equipement(int bonus, String nom) {
        this.bonus = bonus;
        this.nom = nom;
    }

    public int getBonus() {
        return bonus;
    }
    
    public String getNomEquipement() {
    	return nom;
    }
}