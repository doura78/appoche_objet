package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {

        // Chemin du fichier source
        Path pathFile = Paths.get("C:/Users/sidib/Desktop/Diginamic/CDA/Cours-20260518/Java/J3 & J4/recensement.csv/");

        // chemin du fichier de destinantion
        Path destination = Paths.get("C:/Users/sidib/Desktop/Diginamic/CDA/Cours-20260518/Java/J3 & J4/recensement_100_premieres_lignes.csv/");

        // Lecture de toutes les lignes du fichier source
        List<String> lignes = Files.readAllLines(pathFile);

        // Extraction des 100 premières lignes
        List<String> premieres100 = lignes.subList(0, 100);

        // Écriture dans le nouveau fichier
        Files.write(destination, premieres100);

        System.out.println("Fichier généré avec succès " + destination);

    }
}
