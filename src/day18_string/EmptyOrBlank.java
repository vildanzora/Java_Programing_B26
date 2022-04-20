package day18_string;

public class EmptyOrBlank {
    public static void main(String[] args) {
        String s = "last examples";
        System.out.println(s.isEmpty());

        s = "";
        System.out.println(s.isEmpty()); // empty space, no characters

        s = " "; // space as a character
        System.out.println("S is empty: " + s.isEmpty()); // there is a space. Space is a character.

      /* s = "";
        if(s.length() <= 0) {
            System.out.println("empty");
        }*/

        System.out.println("S is blank: " + s.isBlank());




    }
}
