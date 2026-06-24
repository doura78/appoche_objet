package entities;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale a1 = new AdressePostale(15, "George Sand", "78190", "Trappes");
        AdressePostale a2 = new AdressePostale(2211, "Avenue Charles Flahaut", "34490", "Montpellier");

        System.out.println(a1.numeroRue);
//        a1.numeroRue = 15;
//        a1.libelleRue = "George Sand";
//        a1.codePostale = "78190";
//        a1.Ville = "Trappes";

//        a2.numeroRue = 2211;
//        a2.libelleRue = "Avenue Charles Flahaut";
//        a2.codePostale = "34090";
//        a2.Ville = "Montpellier";
    }
}