package fr.diginamic.maison;

public abstract class Piece {
    private int superficie;
    private int etage;

    public Piece(int superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;
    }
}
