package org.formation.fonctionnelle;

import java.util.Scanner;

public class TPArrayBreakLabelled0 {

	public static void main(String[] args) {
		int[] tabInt = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };

		System.out.print("Saisir un chiffre : ");
		Scanner sc = new Scanner(System.in);
		int nbSaisie = sc.nextInt();
		sc.close();

		boolean trouv� = false;
		for (int i : tabInt) {
			if (i == nbSaisie) {
				System.out.println("Trouv�");
				trouv� = true;
				break;
			}
		}
		if (!trouv�) {
			System.out.println("Pas trouv�");
		}

	}

}
