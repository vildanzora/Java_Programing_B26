package day24_loops;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String s = "abcabc";
        String unique = "";

        for (int i = 0; i < s.length()-1; i++) {

            if(!unique.contains("" + s.charAt(i)) ) {
                unique += s.charAt(i);

            }

        }
        System.out.println(unique);

        /*
        for (int i = 0; i < s.length()-1; i++)

        iteration 1:
        String s = "abcabc";
        i = 0
        charAt(i) --> CharAt(0) --> a
        unique = ""; unique doesnt have a, empty
        add unique a --> unique = "a";

        iteration 2:
        i = 1
        charAt(i) --> CharAt(1) --> b
        unique = "a"; unique doesnt have b, empty
        add unique b --> unique = "ab";
        .....

         */




    }
}
