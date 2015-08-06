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
		emp.demanderFormation("Spring", null);
		man.setPrenom("Yann");
		man.demanderFormation("test", null);
		man.validerFormation();
		System.out.println(man);
		
		// 4) Tester l'interface
		ServicePaie sp = new ServicePaie();
		sp.listerFormationPersonnel(emp);
		sp.listerFormationPersonnel(man);
	}

}
