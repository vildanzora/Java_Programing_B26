package day13_if_statement;

public class IfWithoutBrackets {
    public static void main(String[] args) {
        if( 4 > 2)
            System.out.println("Hello");

        if (4 > 10)
            System.out.println("bye");
        System.out.println("other line"); // this is nothing to do with the if

        if ( 3 %2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
