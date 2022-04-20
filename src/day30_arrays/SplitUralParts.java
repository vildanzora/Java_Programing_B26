package day30_arrays;


import java.util.Scanner;

public class SplitUralParts {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String url = input.nextLine();
        String [] urlParts = url.split("/");

       for (String each : urlParts) {
           System.out.println(each);
       }







    }
}
