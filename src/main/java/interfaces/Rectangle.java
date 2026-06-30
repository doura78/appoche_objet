package interfaces;

/**
 * Représente un rectangle.
 */
public class Rectangle implements ObjetGeometrique {

    // Attributs longueur et largeur
    private double longueur;
    private double largeur;

    /**
     * Constructeur
     * @param longueur longueur du rectangle
     * @param largeur largeur du rectangle
     */
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public String toString() {
        return "Type : Rectangle - longueur = " + longueur + " - largeur : "+ largeur;
    }


    /**
     * Calcule le périmètre du rectangle
     * @return le périmètre
     */
    @Override
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    /**
     * Calcule la surface du rectangle
     * @return la surface
     */
    @Override
    public double surface() {
        return longueur * largeur;
    }
}
