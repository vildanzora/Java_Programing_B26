package day26_nested_loop;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AAABCCDEEF";
        String output = "";


        for (int i = 0; i < str.length(); i++) {
            int times = 0;

            for (int j = 0; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)) {
                    times++;
                }

            }

            if(times == 1  ) {
                output += "" + str.charAt(i);
               /* System.out.println("" + str.charAt(i));*/
            }


        }

        System.out.println(output);




    }
}








