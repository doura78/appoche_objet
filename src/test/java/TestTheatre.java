import entites.Theatre;

public class TestTheatre {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Le Palace", 1500);

        int compteur = 0;

        do {
            theatre.inscrire(800, 25);
            compteur++;
        } while(compteur < 1000);

        System.out.println("Total clients inscrits : " + theatre.getTotalClientinscrits());
        System.out.println("Recette totale : " + theatre.getRecetteTotale());
    }


}
