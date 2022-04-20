package day11_if_statements;
import java.util.Scanner;
public class IfStatementPractice {
    public static void main(String[] args) {

       int a = 60;
       int b = 35;

       if(a > b){

           System.out.println(a + " is bigger.");
       }

        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nEnter 2 number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        if(num1 > num2){

            System.out.println(num1+ " is bigger.");
        }else{
            System.out.println(num2 + " is bigger.");
        }

    }
}
