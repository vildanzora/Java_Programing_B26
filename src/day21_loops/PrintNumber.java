package day21_loops;

public class PrintNumber {
    /*
    print all the even numbers from 1 to 100
    print all the odd numbers from 1 to 100, but all in one line with spaces between each number
     */
    public static void main(String[] args) {

        int n = 2;
        while (n <= 100) {
            System.out.println(n);
            n += 2;
        }
        System.out.println("-----------------------------------------------------------");
        // approach 2:

        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("-----------------------------------------------------------");
        // odd numbers

        int a = 1;

        while ( a <= 100) {
            System.out.print(a + " " );
            a += 2;
        }


    }
}
