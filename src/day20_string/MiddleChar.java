package day20_string;

public class MiddleChar {
    public static void main(String[] args) {

        String s = "abcdef";
        //          01234

       // int len = s.length();

        if(s.length()%2 == 0) {
        // our word is even length
            char firstMiddle = s.charAt(s.length()/ 2 - 1);
            char secondMiddle = s.charAt(s.length()/2);
            System.out.println("With charAt: " + firstMiddle + secondMiddle);
            System.out.println("With substring: " + s.substring(s.length()/2 - 1, s.length()/2 + 1));

        } else {
            // our word is odd length
            char middle = s.charAt(s.length() / 2);
            System.out.println("With charAt:" + middle);
            System.out.println("With substring: " + s.substring(s.length()/2, s.length()/ 2 + 1));

        }



    }
}
