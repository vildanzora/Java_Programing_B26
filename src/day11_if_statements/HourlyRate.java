package day11_if_statements;
import java.util.Scanner;
public class HourlyRate {
    /*
    create a double variable for your hourly rate
    create a double variable for the number of hours worked
calculate your net pay, with consideration of overtime pay
	if you worked more than 40 hours you get overtime pay for the hours past 40. Overtime pay is 1.5 the normal rate
		(if you worked 43 hours, you will get 40 hours normal pay and 3 hours overtime pay)
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" What is your hourly rate?");
        double hourlyRate = scan.nextDouble();

        System.out.println("What is your number of worked hours?");
        double numberOfHoursWorked = scan.nextDouble();

        double netPay;

       /* double hourlyRate = 17.25;
        double numberOfHoursWorked = 45;
        double netPay;*/

        if(numberOfHoursWorked > 40){
            double overTimeHours = numberOfHoursWorked - 40;
            netPay = 40 * hourlyRate;
            netPay += overTimeHours * hourlyRate * 1.5;

        }else{
            netPay = numberOfHoursWorked * hourlyRate;
        }

        System.out.println("Total weekly net pay is: $" + netPay);


    }
}
