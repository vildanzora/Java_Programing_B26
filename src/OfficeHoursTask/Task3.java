package OfficeHoursTask;

import java.util.Arrays;

public class Task3 {

    public static void RemoveSpaces (String sentence) {

        sentence = sentence.trim();
        String fixed = "";

        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' ' && sentence.charAt(i+1) == ' '){
                fixed += "";

            } else {
                fixed += sentence.charAt(i);
            }
        }
        System.out.println(fixed);
    }

    public static void main(String[] args) {
        String str = "  Hello world      I      love      Java    ";
        RemoveSpaces(str);
    }

}
