package day29_arrays;

public class LongestAndShortestStrings {
    public static void main(String[] args) {
        
        String [] strs = {"apple", "java", "computer", "water"};
        String smallest = strs[0];
        String biggest = strs[0];


        for (int i = 0; i < strs.length; i++) {
            if(strs[i].length() > biggest.length()) {
                biggest = strs[i];
            }
            if(strs[i].length() < smallest.length()){
                smallest = strs[i];
            }
        }

        System.out.println(biggest);
        System.out.println(smallest);


        System.out.println("==========================");

        for (String word : strs) {
            if(word.length() > biggest.length()){
                biggest = word;
            }
            if (word.length() < smallest.length()) {
                smallest = word;
            }
        }

        System.out.println(biggest);
        System.out.println(smallest);
        
    }
}
