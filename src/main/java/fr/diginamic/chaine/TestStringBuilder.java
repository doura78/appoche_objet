package fr.diginamic.chaine;

//public class TestStringBuilder {
//    public static void main(String[] args) {
//
//        StringBuilder sb = new StringBuilder();
//
//        long debut= System.currentTimeMillis();
//
//
//        for (int i = 0; i <= 1000000 ; i++) {
//            sb.append(i);
//        }
//
//        long fin= System.currentTimeMillis();
//        System.out.println("Temps écoulé en millisecondes : " + (fin - debut));
//
//    }
//}

// Version avec String

public class TestStringBuilder {

    public static void main(String[] args) {

        String texte = "";

        long debut = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            texte = texte + i;
        }

        long fin = System.currentTimeMillis();

        System.out.println("Temps écoulé en millisecondes : " + (fin - debut));
    }
}
