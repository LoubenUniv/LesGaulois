package personnages;

public class Romain {
	private String nom;
	private int force;
	
	private Equipement[] equipements;
	private int nbEquipement = 0;
	
	public Romain(String nom, int force) {
		assert(force >= 0);
		this.nom = nom;
		this.force = force;

	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert(force >= 0);
		force -= forceCoup;
		if (force > 0) {
			parler("A�e");
		} else {
			parler("J'abandonne...");
		}
		assert(force >= 0);
	}
	

	
	
	public static void main(String[] args) {
		Romain cesar = new Romain("C�sar", 11);
		
		System.out.println(cesar.prendreParole());
		cesar.parler("bonsoir");
		cesar.recevoirCoup(8);
	    }
	
}
