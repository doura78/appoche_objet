package fr.diginamic.chaines;

import entites.Salarie;

import java.util.Arrays;

public class ManipulationChaine {
    public static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractere : " + premierCaractere);

        int longueur = chaine.length();
        System.out.println("Longueur de la chaine : " + longueur);

        int index = chaine.indexOf(';');
        System.out.println("index du premier ; : " + index);

        String nom = chaine.substring(0, index);
        System.out.println("Nom de famille : " + nom);

        System.out.println("Nom de famille en majuscule : " + nom.toUpperCase());

        System.out.println("Nom de famille en miniscule : " + nom.toLowerCase());

        String[] morceaux = chaine.split(";");
        System.out.println("Tableau obtenu : " + Arrays.toString(morceaux));

        String nomSalarie = morceaux[0];
        String prenomSalarie = morceaux[1];
        String salaireString = morceaux[2].replace(" ", "");
        double salaire = Double.parseDouble(salaireString);

        Salarie salarie = new Salarie(nomSalarie, prenomSalarie, salaire);
        System.out.println(salarie);
    }

}