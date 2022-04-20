package day14_if_statements;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the year you want to check");
        int year = scan.nextInt();
        String message;


        if (year >= 1346 && year <= 1353) {
            message = "The Black Death";
        } else if (year == 1665 && year == 1666) {
            message = "Great Plague of London";
        } else if (year >= 1770 && year <= 1772) {
            message = "Russian Plague";
        } else if (year >= 1889 && year <= 1890) {
            message = "Flue Pandemic";
        } else if (year == 1916) {
            message = "american polo epidemic";
        } else if (year >= 1918 && year <= 1920) {
            message = "Spanish FLue";
        } else if (year == 2009 && year == 2010) {
            message = "H1N1 swine flue pandemic";
        } else if (year >= 2014 && year <= 2016) {
            message = " West American Ebola epidemic";
        } else if (year >= 2020 && year <= 2022) {
            message = " Covid 19";
        } else {
            message = " No Pandemic";
        }

        System.out.println(message);

    }
}
