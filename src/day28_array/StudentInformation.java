package day28_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
    public static void main(String[] args) {

        String [] studentOne = {"007", "James", "Bomd" , "7"};
        System.out.println(Arrays.toString(studentOne));

        String[] studentTwo = new String[4];
        System.out.println(Arrays.toString(studentTwo));
        studentTwo [0] = "010"; // Id
        studentTwo[1] = "Vildan"; // Name
        studentTwo[2] = "Zora"; // Last Name
        studentTwo[3] = "26";
        System.out.println(Arrays.toString( studentTwo));

        studentTwo= new String[]{"010", "James", "Bond", "26"};
        System.out.println(Arrays.toString( studentTwo));

        System.out.println("===================");
        Scanner input = new Scanner(System.in);
//        String [] studentThree = new String[4];
//
//        System.out.println("Enter your ID: ");
//        studentThree [0] = input.nextLine();
//
//        System.out.println("Enter your first name: " );
//        studentThree [1] = input.nextLine();
//
//        System.out.println("Enter your last name: " );
//        studentThree [2] = input.nextLine();
//
//        System.out.println("Enter your BATCH NUMBER: " );
//        studentThree [3] = input.nextLine();
//
//        System.out.println(Arrays.toString(studentThree));

        System.out.println("============================");

        String [] studentFour = new String[4];
        String [] questions = {"Enter your ID: ", "Enter your First Name: ", "Enter your Last Name: ", "What is your batch number"};

        for (int i = 0; i < studentFour.length; i++) {
            System.out.println(questions[i]); //Reading each element of the questions array

            studentFour[i] = input.nextLine(); // assigning the scanner input into your studentFour
        }

        System.out.println(Arrays.toString(studentFour));


    }
}
