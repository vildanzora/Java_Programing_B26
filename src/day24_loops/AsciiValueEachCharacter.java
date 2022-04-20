package day24_loops;

public class AsciiValueEachCharacter {
    public static void main(String[] args) {

        String str = "java";

        for (int i = 0; i < str.length(); i++) {
            int ascii = str.charAt(i);
           // System.out.println( (int) str.charAt(i) + " " );
            System.out.print(ascii + " ");


        }


    }
}
