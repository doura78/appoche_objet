package fr.diginamic.banque.entites;

public class Compte {
    private String numero;
    private double solde;

    public Compte(String numero, double solde) {
        this.numero = numero;
        this.solde = solde;
    }

    public String getNumero() {
        return numero;
    }


    @Override
    public String toString() {
        return "numero='" + numero + '\'' +
                ", solde=" + solde;
    }
}
