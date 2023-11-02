package personnages;

public class Gaulois {
	private String nom;
	private int effetPotion = 1;
	
	private int force;
	private int nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + "�");
	}
	
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";	
//	}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la m�choire de "+ romain.getNom());
//		romain.recevoirCoup(force / 3);
//	}
	
//	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
		}
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,
		nb_trophees++) {
		this.trophees[nb_trophees] = trophees[i];
		}
		return;
		}
	
	
	
	public void faireUneDonnation(Musee musee) {

	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Romain cesar = new Romain("C�sar", 2);
		System.out.println(asterix.nom);
		System.out.println(asterix);
		
		asterix.parler("salut");
		System.out.println(asterix.prendreParole());
		asterix.frapper(cesar);
	}
}

