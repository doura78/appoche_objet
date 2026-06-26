package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

    // Tableau de nombres décimaux stockant les valeurs ajoutées
    private double[] array = new double[0];

    // Ajoute un nouvel élément au tableau en l'agrandissant d'une case
    public void ajout(double element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
    }

    // Calcule et retourne la moyenne des valeurs du tableau
    public double calcul() {
        // Si le tableau est vide, on retourne 0.0 pour éviter une division par zéro
        if (array.length == 0) {
            return 0.0;
        }

        // Variable qui servira à additionner tous les éléments du tableau
        double somme = 0;

        // Parcours du tableau pour calculer la somme totale
        int i;
        for (i = 0; i < array.length; i++) {
            somme = somme + array[i];
        }

        // Calcul de la moyenne : somme divisée par le nombre d'éléments
        return somme / array.length;
    }

}