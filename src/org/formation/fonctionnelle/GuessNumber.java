package org.formation.fonctionnelle;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		System.out.println("Le but du jeu est de trouver un nombre entre 0 et 1000");
		int nbMystère = (int) (Math.random() * 1001);
		// System.out.println("nbMystère : " + nbMystère);
		Scanner sc = new Scanner(System.in);
		int nbSaisie;
		int nbTentative = 0;
		do {
			System.out.print("Saisir un nombre : ");
			nbSaisie = sc.nextInt();
			nbTentative++;
			if (nbSaisie > nbMystère) {
				System.out.println("C'est moins");
			} else if (nbSaisie < nbMystère) {
				System.out.println("C'est plus");
			}
		} while (nbSaisie != nbMystère);
		System.out.println(nbTentative + " tentative nécessaire");
		sc.close();
	}

}
