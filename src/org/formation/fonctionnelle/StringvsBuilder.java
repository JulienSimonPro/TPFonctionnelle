package org.formation.fonctionnelle;

public class StringvsBuilder {

	public static void main(String[] args) {
		String lievre;
		String tortue = "";

		// Test avec le lievre
		long tempsTortue = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			tortue = tortue + " " + i;
		}
		System.out.println("Tortue : " + (System.currentTimeMillis() - tempsTortue) + "ms");

		// Test avec la lievre
		StringBuilder sb = new StringBuilder();
		long tempsLievre = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append(" ");
			sb.append(i);
		}
		lievre = sb.toString();
		System.out.println("Lievre : " + (System.currentTimeMillis() - tempsLievre) + "ms");

		System.out.println("Lievre == Tortue : " + lievre.equals(tortue));
	}

}
