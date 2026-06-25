import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

    public static void main(String[] args) {

        // Création d'un tableau de 2 comptes
        Compte[] tabComptes = new Compte[2];

        // On met un compte simple dans la case 0
        tabComptes[0] = new Compte("FR12345", 1500.75);

        // On met un compte rémunéré dans la case 1
        tabComptes[1] = new CompteTaux("FR-200", 3500.00, 2.5);

        // On parcourt le tableau
        for (int i = 0; i < tabComptes.length; i++) {
            // On affiche chaque compte
            System.out.println(tabComptes[i]);
        }
    }
}

//extends Compte veut dire que CompteTaux hérite de Compte.

//super(numeroCompte, solde) appelle le constructeur de la classe mère.

//super.toString() récupère l’affichage de Compte.

//Le tableau Compte[] peut contenir Compte et CompteTaux.