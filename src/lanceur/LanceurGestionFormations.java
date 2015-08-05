package lanceur;

import domaine.Employe;
import domaine.Manager;

public class LanceurGestionFormations {

	public static void main(String[] args) {

		// 1) Déclaration
		Employe emp;
		Manager man;
		
		// 2) Instanciation
		emp = new Employe("SIMON", "Julien", 1);
		man = new Manager("Creac'h", "Yan", 2);
		
		// 3) Utilisation
		emp.demanderFormation("Spring");
		man.setPrenom("Yann");
		man.demanderFormation("test");
		man.validerFormation();
		System.out.println(man);
	}

}
