import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        // Création d'une première instance de CalculMoyenne
        CalculMoyenne moyenne1 = new CalculMoyenne();

        // Ajout de plusieurs valeurs dans le premier objet
        moyenne1.ajout(10);
        moyenne1.ajout(24);
        moyenne1.ajout(30.35);

        // Affichage de la moyenne calculée pour le premier test
        System.out.println(moyenne1.calcul());

        // Création d'une deuxième instance de CalculMoyenne
        CalculMoyenne moyenne2 = new CalculMoyenne();

        // Ajout d'autres valeurs dans le deuxième objet
        moyenne2.ajout(59);
        moyenne2.ajout(125.36);
        moyenne2.ajout(256.74);

        // Affichage de la moyenne calculée pour le deuxième test
        System.out.println(moyenne2.calcul());
    }
}