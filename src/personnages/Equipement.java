package personnages;

public enum Equipement {
	CASQUE, BOUCLIER;
	
	private String nom;
	
	public void getNom(String chaine) {
		this.nom = chaine;
	}
	
	public void toString(Equipement equipement) {
		switch(equipement) {
		case CASQUE:
			System.out.println("casque");
			break;
		case BOUCLIER:
			System.out.println("casque");
			break;
		}
	}
}

