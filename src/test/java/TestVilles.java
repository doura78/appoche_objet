import listes.Ville;

import java.util.ArrayList;

public class TestVilles {
    public static void main(String[] args) {

        ArrayList<Ville> villes = new ArrayList<>();

        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        Ville villePlusPeuplee = villes.get(0);

        // for (Ville v : villes){
        // if (v.getNbHabitants() > villPlusPeuplee.getNbHabitants()){
        //villePlusPeuplee = v;}}

        for (int i = 1; i < villes.size(); i++) {
            if (villes.get(i).getNbHabitants() > villePlusPeuplee.getNbHabitants()) {
                villePlusPeuplee = villes.get(i);
            }
        }

        System.out.println("Ville la plus peuplée : " + villePlusPeuplee);

        Ville villeMoinsPeuplee = villes.get(0);
        int indexMin = 0;

        for (int i = 1; i < villes.size(); i++) {
            if (villes.get(i).getNbHabitants() < villeMoinsPeuplee.getNbHabitants()) {
                villeMoinsPeuplee = villes.get(i);
                indexMin = i;
            }
        }

        villes.remove(indexMin);

        for (int i = 0; i < villes.size(); i++) {
            if (villes.get(i).getNbHabitants() > 100000) {
                villes.get(i).setNom(villes.get(i).getNom().toUpperCase());
            }
        }

        System.out.println("Liste finale : " + villes);
    }
}