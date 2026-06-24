package entities;

import entities2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne();
        Personne p2 = new Personne();

        p1.nom = "John";
        p1.prenom = "Doe";
        p1.adresse = "";

        p2.nom = "Jane";
        p2.prenom = "Doe";
        p2.adresse = "";
    }
}
