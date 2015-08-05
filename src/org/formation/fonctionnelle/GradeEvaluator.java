package org.formation.fonctionnelle;

import java.util.Scanner;

public class GradeEvaluator {

	public static void main(String[] args) {
		System.out.print("Note de l'utilisateur sur 100 : ");
		Scanner sc = new Scanner(System.in);
		int note = sc.nextInt();
		sc.close();
		if (note > 89){
			System.out.println("A");
		} else if (note > 79) {
			System.out.println("B");
		} else if (note > 63) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
	}

}
