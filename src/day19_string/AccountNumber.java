package day19_string;
import java.util.Scanner;
public class AccountNumber {
    public static void main(String[] args) {
       /*
ask the user enter an account number and check if the account number is valid. Accounts are valid if:

handle empty inputs. If there is an empty input, do not check anything else and print: "Empty input given"

	- If the account number begins with a "2" the account number should be 7 characters long
		Print: "Valid 7-digit account number"
		Otherwise: "Invalid 7-digit account number"

	- If the account number begins with a "5" the account number should be 10 characters long
		Print: "Valid 5-digit account number"
		Otherwise: "Invalid 5-digit account number"

	— If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “Invalid account number” */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number");
        String accountNum = input.nextLine().trim();
        String result = "";

        if(accountNum.isEmpty()){
            result = "Empty input given";
        } else if(accountNum.startsWith("2")) {
            if (accountNum.length()==7) {
                result = "valid 7 - digit account number";
            } else {
                result = "Invalid 7 - digit account number";
            }

        } else if (accountNum.startsWith("5")) {
            if(accountNum.length()==10){
                result = "valid 5 - digit account number";
            } else {
                result = "Invalid 5 - digit account number";
            }
        } else {
          result = "Invalid Account number" ;
        }

        System.out.println("-------RESULT------" + "\n" + result);





        }

    }

