package day05_variables;

public class MyName {
    public static void main (String[] args){

        char character1 = 'V';
        char character2 = 'I';
        char character3 = 'L';
        char character4 = 'D';
        char character5 = 'A';
        char character6 = 'N';

        System.out.println(character1);
        System.out.println(character2);
        System.out.println(character3);
        System.out.println(character4);
        System.out.println(character5);
        System.out.println(character6);

        System.out.println("My name is: " + character1 + character2 + character3 + character4 + character5 + character6);
        String name = "" + character1 + character2 + character3 + character4 + character5 + character6;
        System.out.println(name);
    }

}
