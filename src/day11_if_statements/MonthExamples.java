package day11_if_statements;
import java.util.Scanner;
public class MonthExamples {
    /*
    create a int variable to represent the month number, where 1 is Janurary and 12 is Decemeber.
use the month number input to determine how many days are in that month.
use the following data to help you determine the number of days in each month:

	Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
	Months that has 30 days: 4, 6, 9, 11
	Month that has 28 days: 2

	ex:
		12
		31 days

	ex:
		9
		30 days
     */
    public static void main(String[] args) {
       /* Scanner Scan = new Scanner(System.in);
        System.out.println("Please enter number of the month");
        int monthNumber = Scan.nextInt();
        if( monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12){
            System.out.println(" This month has 31 days");
        } else if ( monthNumber == 4 ||  monthNumber == 6 ||  monthNumber == 9 ||  monthNumber == 11){
            System.out.println(" This month has 30 days");
        } else if (monthNumber == 2) {
            System.out.println(" This month has 28 days");
        }*/

        int month = 12; // scanner.nextInt();

        boolean has31Days = month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12;

        boolean has30Days = month == 4 || month == 6 || month == 9 || month == 11;

        boolean has28Days = month == 2;

        if(has31Days) {
            System.out.println("31 days");
        }

        if(has30Days) {
            System.out.println("30 days");
        }

        if(has28Days) {
            System.out.println("28 days");
        }


    }
}
