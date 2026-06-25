import entities.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale a1 = new AdressePostale(15, "George Sand", "78190", "Trappes");
        //a1.numeroRue = 15;// treè mauvaise pratique
//        a1.setNumeroRue(15);
        System.out.println(a1);

        //Attributs en privé:
        //1. classe immutable
        //2.


        AdressePostale a2 = new AdressePostale(2211, "Avenue Charles Flahaut", "34490", "Montpellier");


    }
}