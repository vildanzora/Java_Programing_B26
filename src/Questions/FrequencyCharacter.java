package Questions;

public class FrequencyCharacter {
    public static void main(String[] args) {

        String s = "appleee";
        String main = "";


        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            char letter = s.charAt(i);

           if (!main.contains( "" + s.charAt(i))) {

               for (int j = 0; j < s.length(); j++) {

                   char eachLetter = s.charAt(j);

                   if (letter == eachLetter) {
                       count++;
                   }


               }

               System.out.println(" " + letter + "-" + count);
               main += letter;
           }

        }

    }
}
