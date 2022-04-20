package day33_method_practice;

import java.util.Scanner;

public class EligibleVote {
    public static void VoteEligible(int age, boolean isCitizen) {
        if (age >= 18 && isCitizen) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age and citizenship status ");
        int num = scan.nextInt();
        String citizenshipStatus = scan.next();

        boolean isCitizenship = false;

        switch (citizenshipStatus) {
            case "no":
            case "No":
            case "NO":
                break;
            case "yes":  case "YES":
                isCitizenship = true;


        }
        VoteEligible(num, isCitizenship);
    }
}