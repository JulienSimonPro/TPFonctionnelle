package org.formation.fonctionnelle;

public class FonctAvanceDoWhile1 {

	public static void main(String[] args) {
		int nb1, nb2, nb3;
		int itération = 0;
		do {
			itération++;
			nb1 = (int) (Math.random() * 1000);
			nb2 = (int) (Math.random() * 1000);
			nb3 = (int) (Math.random() * 1000);
			System.out.println("Jet " + itération + " : " + nb1 + ", " + nb2 + ", " + nb3);
		} while (nb1 % 2 != 0 || nb2 % 2 != 0 || nb3 % 2 != 1);
		if (itération == 1) {
			System.out.println(itération + " jet requit");
		} else {
			System.out.println(itération + " jets requit");
		}
	}

}
