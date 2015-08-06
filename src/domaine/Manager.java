package domaine;

import java.util.Collection;

public class Manager extends Employe {

	
	// Attributs
	private Collection<Employe> listeEmployes;

	
	// Constructeur
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

	
	// Getter & Setter
	public Collection<Employe> getEmploye() {
		return listeEmployes;
	}
	public void setEmploye(Collection<Employe> listeEmployes) {
		this.listeEmployes = listeEmployes;
	}
	public void ajouterEmploye(Employe empl) {
		listeEmployes.add(empl);
	}

	
	// Méthodes
	public void validerFormation() {
		System.out.println("Le manager valide la formation");
	}

	@Override
	public void demanderFormation(String theme, String sertARien) {
		super.demanderFormation(theme, sertARien);
	}
	public void demanderFormation(DemanderFormation form) {
		super.demanderFormation(form);
	}
	
	@Override
	public String toString() {
		return super.toString() + "Manager [listeEmployes=" + listeEmployes + "]";
	}

}
