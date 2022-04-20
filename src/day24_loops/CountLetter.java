package day24_loops;

public class CountLetter {
    public static void main(String[] args) {

        String word = "aabcca";
        int count = 0;
        char letter = 'c';


        for (int i = 0; i < word.length(); i++) {

            if(word.charAt(i) == letter) {
                count++;
            }

        }

        System.out.println(count);



    }
}
