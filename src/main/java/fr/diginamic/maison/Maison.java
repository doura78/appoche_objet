package fr.diginamic.maison;

public class Maison {
    private Piece[] pieces;



    public Maison(int capacite) {
        pieces = new Piece[capacite];

    }

    public void ajouterPiece(Piece piece) {
        for (int i = 0;
        i < piece.length;
        i++) {
            if (pieces[i] == null) {
                pieces[i] = piece;
                break;
            }
        }
    }

    public double superficieTotale() {
        double total = 0;
        for (int i = 0; i < pieces.length; i++) {
            if (pieces[i] != null) {
                total = total + pieces[i].getSuperficie();
            }
        }
        return total;
    }

    public double superficieEtage() {
        double total = 0;
        for (int i = 0 ; i < pieces.length; i++) {
            if (pieces[i] != null && pieces[i}.getNumeroEtage = etage) {
            total += pieces[i].getSuperficie();
        }
    }
    return total;
}
