
import interfaces.Cercle;
import interfaces.ObjetGeometrique;
import interfaces.Rectangle;

/**
 * Classe de test des objets géométriques.
 */
public class TestObjetGeometrique {

    public static void main(String[] args) {

        // Déclaration d’un tableau d’ObjetGeometrique de longueur 2
        ObjetGeometrique[] objets = new ObjetGeometrique[2];

        // Ajout des objets dans le tableau
        objets[0] = new Cercle(5);
        objets[1] = new Rectangle(4, 6);

//        ArrayList<ObjetGeometrique> tabGeos = new ArrayList<>();
//        tabGeos.add(new Cercle(2.0));
//        tabGeos.add(new Rectangle(10.0, 8.25));

        // Boucle d’affichage
        for (ObjetGeometrique objet : objets) {
            System.out.println("Périmètre : " + objet.perimetre());
            System.out.println("Surface : " + objet.surface());
            System.out.println("----------------------");
        }
    }
}