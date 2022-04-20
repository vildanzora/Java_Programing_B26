package day08_relational_operators;

public class KgToPounds {
    public static void main(String[] args) {

        double oneKg;
        double pound = 2.20462;

        oneKg = pound;

        oneKg *=10;
        pound = oneKg;
        System.out.println("10 kg equal to " + pound + " pounds.");

        oneKg *=2;
        pound = oneKg;
        System.out.println("20 kg equal to " + pound + " pounds.");




    }
}
