package entities;

import entities2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

//        AdressePostale a1 = new AdressePostale();
//        a1.numeroRue = 16;
//        a1.libelleRue = "GS";
//        a1.codePostale = "34000";
//        a1.Ville = "Montplleir";
//
//        AdressePostale a2 = new AdressePostale();
//        a1.numeroRue = 25;
//        a1.libelleRue = "pj";
//        a1.codePostale = "34000";
//        a1.Ville = "Montplleir";

        AdressePostale a1 = null;
        Personne p1 = new Personne("Doe", "John");
        AdressePostale a2 = null;
        Personne p2 = new Personne("Doe", "Jane", a2);

//        p1.nom = "John";
//        p1.prenom = "Doe";
//        p1.Adresse= a1;
//
//        p2.nom = "Jane";
//        p2.prenom = "Doe";
//        p2.Adresse = a2;

        System.out.println(p2.Adresse);
    }
}
