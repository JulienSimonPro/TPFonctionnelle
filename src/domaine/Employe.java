package domaine;

import java.util.Collection;

public class Employe implements IPersonnel {
	private String nom, prenom;
	private int id;

	public Employe(String nom, String prenom, int id) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
	}

	public Employe(String nom, String prenom) {
		this(nom, prenom, 0);
	}

	public Employe(String nom) {
		this(nom, "Martin", 0);
	}

	public Employe() {
		this("Martin", "Martin", 0);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void demanderFormation(String theme, String sertARien) {
		System.out.println("L'employé " + prenom + " " + nom + " demande une formation sur " + theme);
	}

	public void demanderFormation(DemanderFormation form) {
		System.out.println("L'employé " + prenom + " " + nom + " demande une formation");
	}

	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + ", id=" + id + "]";
	}

	@Override
	public Collection<DemanderFormation> consulterFormations() {
		System.out.println("Consultation des formations de" + prenom + " " + nom);
		return null;
	}

}
