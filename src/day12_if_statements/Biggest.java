package day12_if_statements;

public class Biggest {
    public static void main(String[] args) {

        int a = 5;
        int b = 8;
        int c = 9;
        /*boolean biggestA = a >= b && a >= c;
        boolean biggestB =  b >= a && b >= c;
        boolean biggestC = c > a && c >b;

        if(biggestA){
            System.out.println(a + ": This number is a biggest one");
        } else if (biggestB) {
            System.out.println(b + ": This number is a biggest one");
        } else {
            System.out.println(c + ": This number is a biggest one");
        }*/

        if( a >= b && a >= c){
            System.out.println(a + ": This number is a biggest one");
        } else if (b >= a && b >= c){
            System.out.println(b + ": This number is a biggest one");
        }else {
            System.out.println( c+ " is the biggest number");
        }
    }
}
