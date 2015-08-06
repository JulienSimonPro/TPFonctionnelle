package lanceur;

import domaine.*;

public class LanceurGestionFormations {

	public static void main(String[] args) {

		// 1) Déclaration
		Employe emp;
		Manager man;

		// 2) Instanciation
		emp = new Employe("SIMON", "Julien", 1);
		man = new Manager("Creac'h", "Yan", 2);

		// 3) Utilisation
		emp.demanderFormation("Spring", null);	// L'employé Julien SIMON demande une formation sur Spring
		man.setPrenom("Yann");
		man.demanderFormation("test", null);	// L'employé Yann Creac'h demande une formation sur test
		man.validerFormation();					// Le manager valide la formation
		System.out.println(man);				// Employe [nom=Creac'h, prenom=Yann, id=2]Manager [listeEmployes=null]
		
		// 4) Tester l'interface
		ServicePaie sp = new ServicePaie();
		sp.listerFormationPersonnel(emp);		// Consultation des formations deJulien SIMON
		sp.listerFormationPersonnel(man);		// Consultation des formations deYann Creac'h
	}

}
