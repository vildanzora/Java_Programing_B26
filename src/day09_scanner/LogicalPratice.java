package day09_scanner;

public class LogicalPratice {
    public static void main(String[] args) {

        int n = 6;

        System.out.println(n >5);
        System.out.println(n< 10);

        System.out.println(n > 5 && n < 10);

        System.out.println("_______________________");

        int k = 2;

        System.out.println(k >5);
        System.out.println(k < 10);

        System.out.println(k > 5 && k < 10);

        int m = 20;

        System.out.println(m >5);
        System.out.println(m < 10);

        System.out.println(m  > 5 && m< 10);

        System.out.println("_______________________");

        System.out.println( 4 > 3 || false); // true ||false
        System.out.println( 3 < 4 || false); // false || false

        System.out.println(!false); // not false -> true
        System.out.println(!true); // not true -> false


        System.out.println( 4 != 4);

    }
}
