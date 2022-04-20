package day26_nested_loop;

public class DuplicateCharacters {
    public static void main(String[] args) {

        String word = "AAABCCDEEF";
        String output = "";


        for (int i = 0; i < word.length(); i++) {
            int times = 0;
            for (int j = 0; j < word.length(); j++) {
                if ( word.charAt(i) == word.charAt(j) ) {
                    times++;
                }
                if(times >1 && !output.contains( "" + word.charAt(i) )) {
                    output += word.charAt(i);
                }
            }
        }
        System.out.println(output);


        /*for (int i = 0; i < word.length(); i++) {

            if (!output.contains("" + word.charAt(i))) {
                int times = 0;
                for (int j = 0; j < word.length(); j++) {

                    if (word.charAt(i) == word.charAt(j)) {
                        times++;
                    }

                }

                if (times > 1) {
                    System.out.println("" + word.charAt(i));

                }
                output+= word.charAt(i);
            }
        }*/



    }
}
