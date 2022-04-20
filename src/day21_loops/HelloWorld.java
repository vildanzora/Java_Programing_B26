package day21_loops;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println();



        int num = 1;
        while (num++ < 100) {
            System.out.println("Hello World" + num);

            //while (num < 100) {
            //            System.out.println("Hello World" + num++);
        }

        System.out.println();

        int z = 1;
        while (z <= 50){
            System.out.println("Hello world" + z);
            z++;
        }
        /* flow of above :
        z = 1
        z< = 50 ---> true ---> goes in to loop
        runs code:  System.out println ("Hello universe " + z ) --> hello universe1
        z++; --> 2

        goes until z = 51
        51 < 50 -- > false -> loops stops  */



    }
}
