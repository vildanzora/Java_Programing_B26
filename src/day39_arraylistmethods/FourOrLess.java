package day39_arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {

        String [] str = {"apples", "tree", "loop", "cat", "animal" , "shortcut"};

        ArrayList<String> words = new ArrayList<>(Arrays.asList(str)) ;
        ArrayList<String> result = new ArrayList<>();

        for(String each : words) {

            if (each.length() <= 4) {
                result.add(each);
            }
        }

        System.out.println(result);



    }
}
