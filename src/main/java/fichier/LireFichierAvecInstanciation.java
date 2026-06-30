package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LireFichierAvecInstanciation {
    public static void main(String[] args) throws IOException {

        // Etape 1 : j'ai besoin d'un path construit à partir du chemin
        Path pathFichier = Paths.get("C:/Temp/Work/recensement.csv");

        // Etape 2 : lecture du contenu et stockage dans une liste : lignes
        List<String> lignes = Files.readAllLines(pathFichier);
        lignes.removeFirst();

        // Etape 3 : Je crée une liste vide pour stocker les villes
        ArrayList<Ville> listeVilles = new ArrayList<>();

        // Etape 4 : Pour chaque ligne du fichier qu'on a lu, on va créer une Ville
        //           qu'on met dans listeVilles
        for (String ligne : lignes){
            String[] morceaux = ligne.split(";"); // tableau avec 10 morceaux
            // 1 : nom région, 2: code dept, 6: nom de la ville, 9: pop

            int population = Integer.parseInt(morceaux[9].replace(" ", ""));

            Ville nvVille = new Ville(morceaux[6], morceaux[2],
                    morceaux[1], population);
            listeVilles.add(nvVille);
        }

        // Etape 5 : on affiche toutes nos villes
        for (Ville v: listeVilles){
            System.out.println(v);
        }
        System.out.println(listeVilles.size());
    }
}