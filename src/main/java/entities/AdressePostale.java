package entities;

public class AdressePostale {

    //Déclaration des variables
    int numeroRue;
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

    @Override
    public String toString() {
        return "numeroRue=" + numeroRue +
                ", libelleRue='" + libelleRue + '\'' +
                ", codePostale='" + codePostale + '\'' +
                ", Ville='" + Ville ;
    }
}



