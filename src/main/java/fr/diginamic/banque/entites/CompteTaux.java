package fr.diginamic.banque.entites;

// Cette classe hérite de Compte
public class CompteTaux extends Compte {

    // Attribut pour stocker le taux de rémunération
    private double tauxRemuneration;

    // Constructeur
    public CompteTaux(String numeroCompte, double solde, double tauxRemuneration) {
        // On appelle le constructeur de la classe mère
        super(numeroCompte, solde);

        // On enregistre le taux
        this.tauxRemuneration = tauxRemuneration;
    }

    // Méthode pour afficher l'objet
    @Override
    public String toString() {
        // On reprend l'affichage de Compte
        // et on ajoute le taux
        return super.toString() + ", tauxRemuneration=" + tauxRemuneration;
    }
}

//extends Compte : CompteTaux hérite de Compte.

//tauxRemuneration : attribut propre à CompteTaux.

//super(numeroCompte, solde) : appelle le constructeur de Compte.

//super.toString() : récupère l’affichage de base de Compte.

//@Override : indique que la méthode toString() est redéfinie.