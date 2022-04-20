package day39_arraylistmethods;

import java.util.ArrayList;

public class GetUppercaseOrLowercase {
    public static void main(String[] args) {

       /* String str = "heLLoWoRlD";

        ArrayList<String> listLowercase = new ArrayList<>();
        ArrayList<String> listUppercase = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
           if( str.charAt(i) >= 97 && str.charAt(i) <= 122 ) {
               listLowercase.add(""+str.charAt(i));
           }
            if( str.charAt(i) >= 65 && str.charAt(i) <= 90 ) {
                listUppercase.add(""+str.charAt(i));
            }


        }

        System.out.println(listLowercase);
        System.out.println(listUppercase);*/

        String str="heLLoWoRlD";
        String upper="";
        String lower="";
        ArrayList<String>upperCase=new ArrayList<>();
        ArrayList<String>lowerCase=new ArrayList<>();

        for (int i=0; i<str.length();i++){
            char letter = str.charAt(i);

            if (Character.isUpperCase(letter)){
                upper+=letter;
            }

            if (Character.isLowerCase(letter)){
                lower+=letter;
            }
        }

        upperCase.add(upper);
        lowerCase.add(lower);

        System.out.println(upperCase);
        System.out.println(lowerCase);






    }
}
