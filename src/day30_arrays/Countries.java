package day30_arrays;

import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam",  "Albania", "Portugal", "Philippines", "Armenia", "Colombia",
                                 "Honduras", "Indonesia", "United States"};
        String message = "";
        String endWithA = "";


        for (String s : countries) {

            message += "" + s.charAt(0) + s.charAt(s.length() - 1) + ", ";

            if (s.endsWith("a")) {
                endWithA += s + ", ";
            }

        }


        System.out.println(message.toUpperCase());
        System.out.println(endWithA);
        System.out.println();

        System.out.println("Which country do you want to check?");
        String checkCountry = scan.nextLine();

        boolean haveCountry = true;



        for (String country : countries) {
            if (!country.contains(checkCountry)) {
                haveCountry = false;

            }
        }
        if (haveCountry) {
            System.out.println(checkCountry + " is in the list.");
        }else {
            System.out.println(checkCountry + " isn't in the list");
        }


    }

}
