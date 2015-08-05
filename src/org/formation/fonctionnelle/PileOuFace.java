package org.formation.fonctionnelle;

import java.util.Scanner;

public class PileOuFace {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pf;
		System.out.print("Pile ou face (0|1) : ");
		pf = sc.nextInt();
		while (pf != 2) {
			int jet = (int) (Math.random() * 2);
			if (jet == pf) {
				System.out.println("Bravo!");
			} else if (jet == 1) {
				System.out.println("C'était pile!");
			} else {
				System.out.println("C'était face!");
			}
			
			System.out.print("Pile ou face (0|1) : ");
			pf = sc.nextInt();
		}
		sc.close();
	}

}
