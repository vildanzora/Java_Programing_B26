package day39_arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {

        String [] str = {"hold", "hi", "one"};

        ArrayList <String> password = new ArrayList<>(Arrays.asList(str));

        ArrayList<String> result = new ArrayList<>();


        for (String each : password) {
            String star = "";

            for (int i = 0; i < each.length(); i++) {

                star+=each.replaceAll(each,"*");

            }
            result.add(star);
        }



        System.out.println(result);



    }
}
