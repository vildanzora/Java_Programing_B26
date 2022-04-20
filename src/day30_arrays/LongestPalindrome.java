package day30_arrays;

public class LongestPalindrome {
    public static void main(String[] args) {

        String[] word = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String[] reversed = {"", "", "", "", "", "", ""};
        String longest = "";
        int count = 0;

        for (int k = 0; k < word.length; k++) {
            for (int i = word[k].length() - 1; i >= 0; i--) {
                reversed[k] += word[k].charAt(i);
            }
            if (reversed[k].equals(word[k]) && reversed[k].length() > longest.length()) {
                longest = reversed[k];
                count++;
            }

        }
        if (count > 0) {
            System.out.println(longest);
        } else {
            System.out.println("No palindrome");
        }





    }
}



