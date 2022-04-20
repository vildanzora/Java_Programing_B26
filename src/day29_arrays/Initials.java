package day29_arrays;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
       String [] names = {"James Bond", "Eve Rell", "Anna Johnson"};




        for (int i = 0; i < names.length; i++) {
            String fullName = names[i].trim();
            String lastName = fullName.substring(fullName.indexOf(" ")).trim();
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));
        }

        for (String str : names) {

            String fullName = str.trim();
            String lastName = fullName.substring(fullName.indexOf(" ")).trim(); // indexOf(" ") + 1
            System.out.println("" + fullName.charAt(0) + lastName.charAt(0));

            // option 2:
//            str = str.trim();
//            System.out.println(str.substring(0, 1) + str.substring(str.indexOf(" ")).trim().charAt(0));
        }










    }
}
