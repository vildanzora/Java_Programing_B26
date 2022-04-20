package day23_loops;

public class Palindrome {
    public static void main(String[] args) {


        String s = "madam";
        String reversed = "";

        for (int i = s.length()-1 ; i >= 0; i--) {
            reversed += (s.charAt(i));
        }

        System.out.println(reversed);
        if ( s.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

        System.out.println(s.equals(reversed) ? "Palindrome" : "Not palindrome");

    }
}
