package org.formation.fonctionnelle;

public class FonctProblemeAdresses {

	public static void main(String[] args) {

		String[] adresses = { "Alber@yahoo.fr", "Benoit@toto.com", "Camille@hotmail.fr", "Daniel@hotmail.fr",
				"Emilie@hotmail.fr", "Fanny@toto.com", "Guillaume@bouba.nl" };

		// Récupérer la liste des noms de fournisseur
		String[] listeFournisseurs = new String[adresses.length];
		int nbFournisseurDifférent = 0;
		for (int i = 0; i < listeFournisseurs.length; i++) {
			String fourn = adresses[i].substring(adresses[i].indexOf('@') + 1);
			if (rechercheFournisseur(listeFournisseurs, fourn) == -1) {
				nbFournisseurDifférent++;
			}
			listeFournisseurs[i] = fourn;
		}

		// Compter le nombre d'apparition de chaque entré
		String[] nomsFournisseurs = new String[nbFournisseurDifférent];
		int[] nbClient = new int[nbFournisseurDifférent];
		int index = 0;
		for (String nom : listeFournisseurs) {
			if (rechercheFournisseur(nomsFournisseurs, nom) == -1) {
				nomsFournisseurs[index] = nom;
				nbClient[index] = 1;
				index++;
			} else {
				nbClient[rechercheFournisseur(nomsFournisseurs, nom)]++;
			}
		}

		affichage(nomsFournisseurs, nbClient, adresses.length);

	}

	/**
	 * Affiche le nom du fournisseur, son nombre de clients, et sa part de
	 * marché
	 * 
	 * @param nomsFournisseurs
	 * @param nbClient
	 */
	private static void affichage(String[] nomsFournisseurs, int[] nbClient, int sommeClients) {
		for (int i = 0; i < nomsFournisseurs.length; i++) {
			System.out.println("Fournisseur : " + nomsFournisseurs[i] + " - Nombre de client : " + nbClient[i]
					+ " - Part de marché : " + ((nbClient[i] * 100 / sommeClients)) + "%");

		}
	}

	/**
	 * Retourne l'index d'un String dans un tableau de String Retourne -1 si la
	 * chaine de caractère est absente
	 * 
	 * @param tabString
	 *            String[]
	 * @param string
	 *            String
	 * @return int
	 */
	private static int rechercheFournisseur(String[] tabString, String string) {
		int index = -1;
		for (int i = 0; i < tabString.length; i++) {
			if (tabString[i] != null && tabString[i].equals(string)) {
				index = i;
				break;
			}
		}
		return index;
	}

}
