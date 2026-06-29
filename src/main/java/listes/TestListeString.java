package listes;

import java.util.ArrayList;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> villes = new ArrayList<String>();

        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        String villePlusLongue = villes.get(0);

        for (int i = 1; i < villes.size(); i++) {
            if (villes.get(i).length() > villePlusLongue.length()) {
                villePlusLongue = villes.get(i);
            }
        }
        System.out.println("La ville avec le plus grand nombre de lettre est " + villePlusLongue);

        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }
        System.out.println(villes);

        for (int i = villes.size() - 1; i >= 0; i--) {
            if (villes.get(i).startsWith("N")) {
                villes.remove(i);
            }
        }
        System.out.println(villes);
    }
}
