package personnages;

public class Musee {
	private Trophee[] tableau;
	private int nbTrophee = 0;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		Trophee nouveauTrophee = new Trophee(gaulois, equipement);
		tableau[nbTrophee] = nouveauTrophee;
	}
}
