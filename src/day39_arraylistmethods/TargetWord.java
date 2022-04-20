package day39_arraylistmethods;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {

      String [] words = {"java","html","css","java","javascript","selenium"};

      String target = "java";
      target.toLowerCase();

        ArrayList<String> str =new ArrayList<>(Arrays.asList(words));
        int count =0;

        for(String each : str) {
            if (each.equals(target)){
                count++;
            }
        }

        System.out.println(count);
        System.out.println("========================");

        count =0;
        for (int i = 0; i < str.size(); i++) {
             if(str.get(i).equals(target)){
                 count++;
             }
        }

        System.out.println(count);




    }
}
