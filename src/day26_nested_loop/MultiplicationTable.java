package day26_nested_loop;

public class MultiplicationTable {
    public static void main(String[] args) {


        for (int i = 1; i <=10 ; i++) {

            System.out.print(1 + " x " + i + " = " + (1 * i) );
        }
        for (int i = 1; i <=10 ; i++) {

            System.out.print(1 + " x " + i + " = " + (2 * i) );
        }
        System.out.println("-------------------------------");

        for (int num = 1; num <= 15; num++) {

            for (int multi = 1; multi <= 10; multi++) {
                System.out.print(num + " x " + multi + " = " + (num * multi) + " | " );

            }
            System.out.println();



        }









    }
}
