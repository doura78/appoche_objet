import equals.Pays;

public class TestEqualsPays {
    public static void main(String[] args) {

        Pays p1 = new Pays("Guinée", 15450679);
        Pays p2 = new Pays("Guinée", 15450679);
        Pays p3 = new Pays("Bhoutan", 801844);
        Pays p4 = new Pays(null, 69);

        System.out.println("Comparaison avec ==");
        System.out.println(p1 == p2); // false
        System.out.println(p1 == p3); // false
        System.out.println(p1 == p4);

        System.out.println("Comparaison avec equals()");
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // false
        System.out.println(p1.equals(p4));
    }
}
