package interfaces;

import java.util.Objects;

/**
 * Représente un cercle.
 */
public class Cercle implements ObjetGeometrique {

    // Attribut contenant le rayon du cercle
    private double rayon;

    /**
     * Constructeur
     *
     * @param rayon rayon du cercle
     */
    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    /**
     * Calcule le périmètre du cercle
     *
     * @return le périmètre
     */
    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    /**
     * Calcule la surface du cercle
     *
     * @return la surface
     */
    @Override
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return "Type : Cercle - rayon = " + rayon + " - Périmètre : "+perimetre()+ " - Surface : " + surface();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Cercle cercle)) {
            return false;
        }
        return Double.compare(rayon, cercle.rayon) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rayon);
    }
}