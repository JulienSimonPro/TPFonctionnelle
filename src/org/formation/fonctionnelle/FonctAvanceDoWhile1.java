package org.formation.fonctionnelle;

public class FonctAvanceDoWhile1 {

	public static void main(String[] args) {
		int nb1, nb2, nb3;
		int it�ration = 0;
		do {
			it�ration++;
			nb1 = (int) (Math.random() * 1000);
			nb2 = (int) (Math.random() * 1000);
			nb3 = (int) (Math.random() * 1000);
			System.out.println("Jet " + it�ration + " : " + nb1 + ", " + nb2 + ", " + nb3);
		} while (nb1 % 2 != 0 || nb2 % 2 != 0 || nb3 % 2 != 1);
		if (it�ration == 1) {
			System.out.println(it�ration + " jet requit");
		} else {
			System.out.println(it�ration + " jets requit");
		}
	}

}
