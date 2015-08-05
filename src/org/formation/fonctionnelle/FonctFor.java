package org.formation.fonctionnelle;

public class FonctFor {

	public static final String VILLE = "Nantes";

	public static void main(String[] args) {
		// affiche0à12();
		@SuppressWarnings("unused")
		int[] tabInt = { 0, 1, 2, 3, 5, 7, 11, 13, 17, 19 };
		// afficheTab1(tabInt);
		// afficheTab2(tabInt);
		@SuppressWarnings("unused")
		String[] listeVille = { "Paris", "Marseille", "Lyon", "Toulouse", "Nice", "Nantes", "Strabourg", "Montpellier",
				"Bordeaux", "Lille" };
		// afficheVille(listeVille);
	}

	@SuppressWarnings("unused")
	private static void afficheVille(String[] listeVille) {
		boolean trouvé = false;
		for (String nomVille : listeVille) {
			if (nomVille == VILLE) {
				System.out.println("trouvé");
				trouvé = true;
				break;
			}
		}
		if (!trouvé) {
			System.out.println("...");
		}

	}

	@SuppressWarnings("unused")
	private static void afficheTab2(int[] tabInt) {
		for (int i : tabInt) {
			System.out.println(i);
		}
	}

	@SuppressWarnings("unused")
	private static void afficheTab1(int[] tabInt) {
		for (int i = 0; i < tabInt.length; i++) {
			System.out.println(tabInt[i]);
		}
	}

	@SuppressWarnings("unused")
	private static void affiche0à12() {
		for (int i = 0; i < 13; i++) {
			System.out.println(i);
		}
	}

}
