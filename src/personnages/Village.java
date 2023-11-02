package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
	

	}
	
	public Gaulois trouverHabitant(int num) {
		return villageois[num];
	}
	
	private void afficherVillageois(String chef, Gaulois[] villageois) {
		System.out.println("Dans le village du chef");
		System.out.println(chef);
		System.out.println("vivent les l�gendaires gaulois : ");
		System.out.println(villageois[0]);
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println(villageois[i].getNom());
		}
		

	}
	
	public static void main(String[] args) {
		
		Village village = new Village("Village des Irr�ductibles", 30);
		//Gaulois gaulois = village.trouverHabitant(30);
		Chef Abraracourcix = new Chef("Abraracourcix ", 6, village);
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		village.ajouterHabitant(asterix);
		Gaulois gaulois = village.trouverHabitant(1);
		village.afficherVillageois("Abraracourcix", village.villageois);
		Gaulois obelix = new Gaulois("Ob�lix", 25);	
		village.ajouterHabitant(obelix);
		village.afficherVillageois("Abraracourcix", village.villageois);
		
	}
}
