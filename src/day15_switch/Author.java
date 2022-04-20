package day15_switch;

import java.util.Scanner;

public class Author {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Choose genre. \n\tFantasy\n\tDetective\n\tScience Fiction\n\tShort Story");
        String genre = scan.nextLine();

        int pageLength = 0, sequels = 0, countries = 0;
        double profit = 0;
        boolean validGenre = true;

        switch (genre) {
            case "Fantasy":
                pageLength = 500;
                profit = 1_000_000;
                sequels = 5;
                countries = 50;
                break;

            case "Detective":
                pageLength = 350;
                profit = 700_000;
                sequels = 3;
                countries = 45;
                break;

            case "Science Fiction":
                pageLength = 720;
                profit = 900_500;
                sequels -= 4;
                countries = 30;
                break;

            case "Short Story":
                pageLength = 150;
                profit = 300_000;
                sequels = 1;
                countries = 40;
                break;
            default:
                System.out.println("Invalid selection");
                validGenre = false;
        }// end of the switch

        if (validGenre) {
            System.out.println("Page Length: " + pageLength + "\nProfit: " + profit + "\nSequels: " + sequels + "\nPublished Countries: " + countries);
        }


    }
}
