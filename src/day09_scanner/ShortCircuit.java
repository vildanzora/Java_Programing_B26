package day09_scanner;

public class ShortCircuit {

    public static void main(String[] args) {

        // System.out.println(5 / 0);

        System.out.println( true || 5/0 == 0 ); // true

    }
}
