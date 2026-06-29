package listes;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class TestListeInt {
    public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>();

        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(-5);

        System.out.println("Element de la liste " + liste);
        System.out.println("Taille de la liste " + liste.size());

        //Recherche du plus grand élément
        int max = liste.get(0);
        for (int i = 1; i < liste.size(); i++) {
            if (liste.get(i) > max) {
                max = liste.get(i);
            }
        }
        System.out.println("Plus grand élément de la liste " + max);

        //Suppression + petit élémément
        int min = liste.get(0);
        int indexMin = 0;
        for (int i =1; i < liste.size(); i++) {
            if (liste.get(i) < indexMin) {
                min = liste.get(i);
                indexMin = i;
            }
        }

        liste.remove(indexMin);
        System.out.println("Liste après suppression du plus petit élément " + liste);

        //Conversion des éléménts négatifs, en positif
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) < 0) {
                liste.set (i, -liste.get(i));
            }
        }

        System.out.println("Liste finale: " + liste);
    }
}
