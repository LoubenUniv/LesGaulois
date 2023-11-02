package personnages;

public class Trophee {
	private Gaulois gaulois;
	private Equipement equipement;
	
	public Trophee(Gaulois gaulois, Equipement equipement) {
		this.gaulois = gaulois;
		this.equipement = equipement;
	}
	
	public Gaulois getGaulois(Trophee trophee) {
		return this.gaulois;
	}
	
	public Equipement getEquipement(Trophee trophee) {
		return this.equipement;
	}
	
	public String donnerNom(Trophee trophee) {
		return trophee.gaulois.getNom();
	}
	
}
