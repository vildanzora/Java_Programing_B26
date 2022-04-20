package day21_loops;

public class PrintAlphabet {
    public static void main(String[] args) {

       /* char a = 97;

        while ( a >=97 && a <=122 ){
            System.out.println(a);
            a++;
        }*/

        char lowercaseUp = 'a';

        while ( lowercaseUp <= 'z' ){
            System.out.print(lowercaseUp + " "); // println next line, just print same line
            lowercaseUp++;
        }


    }

}
