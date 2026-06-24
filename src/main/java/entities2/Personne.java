package entities2;

import entities.AdressePostale;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale Adresse;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        Adresse = adresse;
    }

    public void afficher() {
        System.out.println("je m'appelle " +prenom+ " "+nom.toUpperCase());
    }

    public void setNom(String nvNom) {
        this.nom = nvNom;
    }

    public void setAdresse(AdressePostale adresse) {
        this.Adresse = adresse;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return this.nom;
    }

    public AdressePostale getAdresse() {
        return this.Adresse;
    }

    public String getPrenom() {
        return this.prenom;
    }
}
