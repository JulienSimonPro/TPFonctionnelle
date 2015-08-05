package org.formation.fonctionnelle;

import java.util.Scanner;

public class Fonct0 {

	public static void main(String[] args) {
		// fonction1();
		// fonction2();
		// aireCylindre();
	}

	@SuppressWarnings("unused")
	private static void fonction1() {
		int x, y;
		x = 15;
		y = 17;

		System.out.println("+ : " + (x + y));
		System.out.println("- : " + (x - y));
		System.out.println("* : " + (x * y));
		System.out.println("/ : " + (x / y));
		System.out.println("/ : " + (y / x));
		System.out.println("% : " + (x % y));
		System.out.println("% : " + (y % x));

		double a, b;
		a = 15;
		b = 17;

		System.out.println("+ " + (a + b));
		System.out.println("- " + (a - b));
		System.out.println("* " + (a * b));
		System.out.println("/ " + (a / b));
		System.out.println("/ " + (b / a));
		System.out.println("% " + (a % b));
		System.out.println("% " + (b % a));
	}

	@SuppressWarnings("unused")
	private static void fonction2() {
		System.out.print("Saisir un chiffre entre 0 et 1000 : ");
		Scanner sc = new Scanner(System.in);
		int nombre = sc.nextInt();
		int mille = (nombre / 1000) % 10;
		int cent = (nombre / 100) % 10;
		int dix = (nombre / 10) % 10;
		int un = (nombre / 1) % 10;
		System.out.println("" + mille + cent + dix + un + " : " + (mille + cent + dix + un));
		sc.close();
	}

	@SuppressWarnings("unused")
	private static void aireCylindre() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Rayon du cylindre : ");
		int rayon = sc.nextInt();
		double aire = Math.PI * rayon * rayon;
		System.out.println("Aire : " + aire);
		System.out.print("Longueur du cylindre : ");
		int longueur = sc.nextInt();
		double volume = aire * longueur;
		System.out.println("Volume : " + volume);
		sc.close();
	}

}
