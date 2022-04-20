package day19_string;

public class CharMethod {
    public static void main(String[] args) {
        String s = "java";
        //index     0123
        System.out.println(s.length());

        System.out.println(s.charAt(0)); // I want to give me a first index character
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
       // System.out.println(s.charAt(4));
        System.out.println("--------------------------");

        int lastIndex = s.length() -1; // 4 - 1 = 3 // this is the same line 13 but line 13 is hardcoded
        System.out.println("Last char : " + s.charAt(lastIndex));

        int secondToLastIndex = s.length() - 2;
        char secondToLastChar = s.charAt(secondToLastIndex); // This is the same as line 12 but line 12 is hardcoded
        System.out.println("Second to last character: " + secondToLastChar);



    }
}
