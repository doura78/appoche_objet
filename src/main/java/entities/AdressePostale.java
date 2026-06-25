package entities;

public class AdressePostale {

    //Déclaration des variables
    private int numeroRue;
    String libelleRue;
    String codePostale;
    String Ville;

    //Constructeur

    static int nbDepartements = 101;

    public AdressePostale(int numeroRue, String libelleRue, String codePostale, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostale = codePostale;
        Ville = ville;
    }


    public int getNumeroRue() {
        return numeroRue;
    }

    public String getLibelleRue() {
        return libelleRue;
    }

    public void setLibelleRue(String libelleRue) {
        this.libelleRue = libelleRue;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public static int getNbDepartements() {
        return nbDepartements;
    }

    public static void setNbDepartements(int nbDepartements) {
        AdressePostale.nbDepartements = nbDepartements;
    }

    @Override
    public String toString() {
        return "numeroRue=" + numeroRue +
                ", libelleRue='" + libelleRue + '\'' +
                ", codePostale='" + codePostale + '\'' +
                ", Ville='" + Ville;
    }
}


