package day23_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

        int num = 4;

        for (int i = 1; i <= 10; i++){
            System.out.println(num  + "*" + i +  "=" +  num * i);
        }

        String s = "java";

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        System.out.println("With loop");

        for(int i = 0; i < s.length(); i++) { // i <= s.length() - 1
            System.out.println(s.charAt(i));
        }

        // i < s.length()   --> i < 4
        // i <= s.length() - 1 --> i <= 3


    }
}
