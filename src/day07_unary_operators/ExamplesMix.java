package day07_unary_operators;

public class ExamplesMix {

    public static void main(String[] args) {
        int i = 5; // i 5
        int z = i++; // z 5 i6

        System.out.println(i++); // print i6  after i7
        System.out.println(z++); // print z5 after z6

        int a = 10;

        System.out.println(a+i); // total 17
        System.out.println(++z); // z7 print z7

        int b = a + z;   // b17
        b++;
        System.out.println(i); // i7
        System.out.println(z); // z7
        System.out.println(a); //10
        System.out.println(b); //18

    }
}
