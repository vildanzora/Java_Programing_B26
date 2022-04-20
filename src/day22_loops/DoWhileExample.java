package day22_loops;

public class DoWhileExample {
    public static void main(String[] args) {

        int a = 0;

        do {
            // everythin between the curly brackets are in the loop
            System.out.println(a);
            a++;
        } while (a <= 10);

        System.out.println("with false boolean:");

        int a2 = 0;

        do {
            // everything between the curly brackets are in the loop
            System.out.println(a2);
            a++;
        } while (a2 == 10);

        System.out.println("as a while loop");

        int a3 = 0;

        while (a3 == 10) {
            System.out.println(a3);
            a3++;
        }

    }
}
