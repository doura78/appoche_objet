package fr.diginamic;

public class Theatre {

    private String name;
    private int capaciteMax;
    private int totalClientinscrits;
    private double recetteTotale;

    public Theatre(String name, int capaciteMax) {
        this.name = name;
        this.capaciteMax = capaciteMax;
        this.totalClientinscrits = 0;
        this.recetteTotale = 0;
    }

    public void inscrire(int nbClients, double prixPlace) {
        if (totalClientinscrits + nbClients <= capaciteMax) {
            totalClientinscrits += nbClients;
            recetteTotale += nbClients * prixPlace;
        } else {
            System.out.println("La capacité d'accueil maximum est atteinte !");
        }
    }

    public int getTotalClientinscrits() {
        return totalClientinscrits;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }
}
