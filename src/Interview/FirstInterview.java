package Interview;


import java.util.ArrayList;
import java.util.Arrays;


public class FirstInterview {
    public static void main(String[] args) {
        ArrayList<String> group = new ArrayList<>();

        group.add("Selo");
        group.add("Alex");
        group.add("Eda");
        group.add("Nav");
        group.add("Neli");

        String [] str = new String [group.size()];
        for (int i = 0; i < str.length; i++) {
            str[i] = group.get(i);
        }

        for (String each : str){
            System.out.print(each + " ");
        }


    }


}



