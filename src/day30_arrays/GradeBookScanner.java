package day30_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBookScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many students do you have?");
        int numberOfStudent = scan.nextInt();
        scan.nextLine();

        String [] names = new String [numberOfStudent];
        int [] score = new int[numberOfStudent];
        char [] letterGrade = new char [numberOfStudent];


        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("Please enter you students full name ");
           names[i] = scan.nextLine().trim();

            System.out.println("Please enter you students exam score");
            score [i] = scan.nextInt();
            scan.nextLine();

            if (score[i] >= 85) {
                letterGrade[i] += 'A';
            } else if (score[i]>=75) {
                letterGrade[i] += 'B';
            } else if (score[i] >= 65 ){
                letterGrade[i] += 'C';
            } else {
                letterGrade[i] += 'D';
            }

            System.out.println("" + names[i] + "- Exam Score is: " + score[i] +" Grade Scale is: " + letterGrade[i]) ;
            System.out.println();


        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " | " + score[i] + " | " + letterGrade[i] + " |");
        }




    }
}
