import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne moyenne1 = new CalculMoyenne();
        moyenne1.ajout(10);
        moyenne1.ajout(24);
        moyenne1.ajout(30.35);

        System.out.println(moyenne1.calcul());

        CalculMoyenne moyenne2 = new CalculMoyenne();
        moyenne2.ajout(59);
        moyenne2.ajout(125.36);
        moyenne2.ajout(256.74);
        System.out.println(moyenne2.calcul());
    }
}
