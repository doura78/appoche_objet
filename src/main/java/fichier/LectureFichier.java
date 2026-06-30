
package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

    public static void main(String[] args) throws IOException {

        ArrayList<Ville> villes = new ArrayList<>();

        Path pathFile = Paths.get("C:/Users/sidib/Desktop/Diginamic/CDA/Cours-20260518/Java/J3 & J4/recensement.csv");

        List<String> lines = Files.readAllLines(pathFile, StandardCharsets.UTF_8);

        for (int i = 1; i < lines.size(); i++) { // on commence à 1 pour ignorer l’en-tête
            String ligne = lines.get(i);

            String[] tokens = ligne.split(";");

            String nom = tokens[6];
            String codeDpt = tokens[2];
            String nomRegion = tokens[1];
            int populationTotale = Integer.parseInt(tokens[9].replace(" ", ""));

            Ville ville = new Ville(nomRegion, codeDpt, nom, populationTotale);

            villes.add(ville);
        }

        System.out.println("Nombre de villes chargées : " + villes.size());
    }
}