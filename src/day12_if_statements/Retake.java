package day12_if_statements;
import java.util.Scanner;

/* declare and assign a grade variable
declare and assign an attempt number
Doing a retake for the assignment will reduce the grade by a percentage based on the number of attempts taken:
If its the first attempt -> subtract 10%
If its the second attempt -> subtract 20%
 If its the third attempt -> subtract 35%
 Based on the retake attempt number calculate the final grade*/

public class Retake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What was the grade?");
        int grade = scan.nextInt();


        System.out.println("Your grade is " + grade + "\nWhich attempt number is it?\nBased on the retake attempt number, your final grade will change");
        int attempt = scan.nextInt();
        boolean validAttempt = attempt < 4 && attempt > 0; // true

        if (attempt == 1 ){
        grade = ((grade * 90) / 100); // grade = grade - (int)(grade * 0.1)
            System.out.println("Your final grade is " + grade);
        } else if (attempt == 2){
          grade = ((grade * 80)/100);
            System.out.println("Your final grade is " + grade);
        } else if (attempt ==3) {
         grade = ((grade * 65)/100);
           // System.out.println("Your final grade is " + grade);
        } else {
            System.out.println("Not a valid attempt number");
            // If you do it by assigning true by a default, then here you would use validattempts = false
        }
        if (validAttempt) {
            System.out.println(grade);
        }
    }
}
