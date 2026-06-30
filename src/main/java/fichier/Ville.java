package fichier;

import java.util.Objects;

public class Ville {
    String nom;
    String codeDpt;
    String nomRegion;
    int populationTotale;

    public Ville(String nom, String codeDpt, String nomRegion, int populationTotale) {
        this.nom = nom;
        this.codeDpt = codeDpt;
        this.nomRegion = nomRegion;
        populationTotale = populationTotale;
    }

    @Override
    public String toString() {
        return "nom= " + nom +
                ", codeDpt='" + codeDpt +
                ", nomRegion='" + nomRegion +
                ", populationTotale=" + populationTotale ;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Ville ville)) return false;
        return populationTotale == ville.populationTotale && Objects.equals(nom, ville.nom) && Objects.equals(codeDpt, ville.codeDpt) && Objects.equals(nomRegion, ville.nomRegion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, codeDpt, nomRegion, populationTotale);
    }

    public String getNom() {
        return nom;
    }

    public String getCodeDpt() {
        return codeDpt;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getpopulationTotale() {
        return populationTotale;
    }
}
