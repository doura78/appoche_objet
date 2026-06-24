package entities;

import entities2.Personne;

public class TestPersonne {
    public static void main(String[] args) {

        //a1 est une variable locale:
        //- dont la portée c'est la méthode
        //-invisble en dehors de la méthode

        AdressePostale a1 = new AdressePostale(15, "George Sand", "78190", "Trappes");
        AdressePostale a2 = new AdressePostale(2211, "Avenue Charles Flahaut", "34490", "Montpellier");

        Personne p1 = new Personne("Doe", "John");
        Personne p2 = new Personne("Doe", "Jane", a2);

    }
}
