package org.formation.fonctionnelle;

import java.util.Scanner;

public class TPArrayBreakLabelled1 {

	public static void main(String[] args) {
		int[][] tabInt = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622, 127, 77, 955 } };

		System.out.print("Saisir un chiffre : ");
		Scanner sc = new Scanner(System.in);
		int nbSaisie = sc.nextInt();
		sc.close();

		boolean trouv� = false;
		sortie: for (int i = 0; i < tabInt.length; i++) {
			for (int j = 0; j < tabInt[i].length; j++) {
				if (tabInt[i][j] == nbSaisie) {
					System.out.println("Trouv� � l'indice [" + i + "][" + j + "]");
					trouv� = true;
					break sortie;
				}
			}
		}
		if (!trouv�) {
			System.out.println("Pas trouv�");
		}
	}

}
