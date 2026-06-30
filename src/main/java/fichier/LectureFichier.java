package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class LectureFichier {
    public static void main(String[] args) throws IOException {

        ArrayList<Ville> villes = new ArrayList<>() ;

        // Chemin du fichier
        Path pathFile = Paths.get("C:/Users/sidib/Desktop/Diginamic/CDA/Cours-20260518/Java/J3 & J4/recensement.csv/");

        // Lecture de toutes les lignes du fichier
        List<String> lines = Files.readAllLines(pathFile);

        for (int i = 1; i < lines.size(); i++){ // on commence à 1 pour ignorer l'en-tête

            String ligne = lines.get(i);

            String[] tokens = ligne.split(";");

            String nom = tokens[0];
            String codeDpt = tokens[1];
            String nomRegion = tokens[2];
            int populationTotale = Integer.parseInt(tokens[3].replace(" ", ""));

            Ville ville = new Ville(nom, codeDpt, nomRegion, populationTotale) ;

            villes.add(ville);
        }
        System.out.println("Nombre de villes changées : " + villes.size());
    }
}
