package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

    private double[] array = new double[0];

    public void ajout(double element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
    }

    public  double calcul() {
        if (array.length == 0) {
            return 0.0;
        }
        double somme = 0;

        int i;
        for (i = 0; i < array.length; i++) {
            somme = somme + array[i];
        }
        return somme / array.length;
    }

}
