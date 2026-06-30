package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class GenererFichier {
    public static void main(String[] args) throws IOException {

        ArrayList<Ville> villes = new ArrayList<>();

        // Chemin du fichier
        Path pathFile = Paths.get("C:/Users/sidib/Desktop/Diginamic/CDA/Cours-20260518/Java/J3 & J4/recensement.csv/");

        // Lecture de toutes les lignes du fichier
        List<String> lines = Files.readAllLines(pathFile);

        for (int i = 1; i < lines.size(); i++) { // on commence à 1 pour ignorer l'en-tête

            String ligne = lines.get(i);

            String[] tokens = ligne.split(";");

            String nom = tokens[6];
            String codeDpt = tokens[2];
            String nomRegion = tokens[1];
            int populationTotale = Integer.parseInt(tokens[9].replace(" ", ""));

            //Création objet Ville
            Ville ville = new Ville(tokens[0], nom, codeDpt, populationTotale);

            villes.add(ville);
        }

        //Créer une liste de lignes pour le fichier de sortie
        List<String> lignesSortie = new ArrayList<>();

        //Ajouter la ligne d'en-tête
        lignesSortie.add("nom;Code département;Nom de la région;Population totale");

        //Parcourur liste villes
        for (Ville ville : villes) {

            //Garde les villes de plus de 25 000 hab
            if (ville.getpopulationTotale() > 25000){

                // Nouveau csv avec les infos utiles
                String ligneSortie = ville.getNom() + ";" +
                        ville.getCodeDpt() + ";" +
                        ville.getNomRegion() + ";" +
                        ville.getpopulationTotale();

                //afficher ligne au sortie du fichier
                lignesSortie.add(ligneSortie);
            }
        }

        Path pathOutput = Paths.get("C:/Users/sidib/Desktop/Diginamic/CDA/Cours-20260518/Java/J3 & J4/villes_plus_25000.csv");

        Files.write(pathOutput, lignesSortie);

        System.out.println("Fichier généré avec succès.");
    }
}