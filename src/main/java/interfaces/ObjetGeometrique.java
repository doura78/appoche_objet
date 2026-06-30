package interfaces;

/**
 * Liste les méthodes obligatoires que doit posséder un objet géométrique
 * @author DIGINAMIC
 */
public interface ObjetGeometrique {

    /**
     * Retourne le périmètre d’une forme géométrique
     * @return double
     */
    double perimetre(); // méthode abstraite

    /**
     * Retourne la surface
     * @return double
     */
    double surface(); // méthode abstraite
}