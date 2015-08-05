package org.formation.fonctionnelle;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		System.out.println("Le but du jeu est de trouver un nombre entre 0 et 1000");
		int nbMyst�re = (int) (Math.random() * 1001);
		// System.out.println("nbMyst�re : " + nbMyst�re);
		Scanner sc = new Scanner(System.in);
		int nbSaisie;
		int nbTentative = 0;
		do {
			System.out.print("Saisir un nombre : ");
			nbSaisie = sc.nextInt();
			nbTentative++;
			if (nbSaisie > nbMyst�re) {
				System.out.println("C'est moins");
			} else if (nbSaisie < nbMyst�re) {
				System.out.println("C'est plus");
			}
		} while (nbSaisie != nbMyst�re);
		System.out.println(nbTentative + " tentative n�cessaire");
		sc.close();
	}

}
