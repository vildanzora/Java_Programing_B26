package day30_arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String s = "Today is Monday, we learned string methods";
        String [] words = s.split(" ");
        System.out.println(words.length);

        String reverse = "";

        for (int i = words.length-1; i >=0 ; i--) {
            reverse += words[i] + " ";

        }


        System.out.println(reverse.trim());




    }
}
