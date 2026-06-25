import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperationExecutable {

    public static void main(String[] args) {

        Operation[] operations = new Operation[4];

        operations[0] = new Credit("01/06/2026", 200.0);
        operations[1] = new Debit("02/06/2026", 50.0);
        operations[2] = new Credit("03/06/2026", 1000.0);
        operations[3] = new Debit("04/06/2026", 120.0);

        double total = 0;


        for (int i = 0; i < operations.length; i++) {
            System.out.println(
                    "Date : " + operations[i].getDate() +
                            " | Montant : " + operations[i].getMontant() +
                            " | Type : " + operations[i].getType()
            );

            // Si c'est un crédit, on ajoute
            if (operations[i].getType().equals("CREDIT")) {
                total = total + operations[i].getMontant();
            }

            // Si c'est un débit, on enlève
            else if (operations[i].getType().equals("DEBIT")) {
                total = total - operations[i].getMontant();
            }

            System.out.println("Montant global : " + total);
        }
    }
}
