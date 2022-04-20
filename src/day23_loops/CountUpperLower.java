package day23_loops;

public class CountUpperLower {
    public static void main(String[] args) {

        String str = "2juMp41EEkd4s4";
        int upper = 0;
        int lower = 0;
        int number = 0;

        for (int i = 0; i < str.length(); i++) {

            char letter = str.charAt(i); // get the character at the index number i for this iteration, and stores into the variable letter for re-usability

            if (letter >= 'A' && letter <= 'Z') {
                upper++;
            } else if (letter >= 'a' && letter <= 'z') {
                lower++;
            } else if (letter >= '0' && letter <= '9') {
                number++;
            }
        }

        System.out.println("Uppercase characters: " + upper);
        System.out.println("Lowercase characters: " + lower);
        System.out.println("Number characters : " + number);



    }
    }

