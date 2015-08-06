package domaine;

public class Manager extends Employe {

	public Manager(String nom, String prenom, int id) {
		super(nom, prenom, id);
	}
	
	public Manager(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public Manager(String nom) {
		super(nom);
	}
	
	public Manager() {
		super();
	}

	public void validerFormation() {
		System.out.println("Le manager valide la formation");
	}
	
	@Override
	public void demanderFormation(String theme, String sertARien) {
		super.demanderFormation(theme, sertARien);
	}
	
	
}
