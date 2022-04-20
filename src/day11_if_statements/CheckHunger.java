package day11_if_statements;
import java.util.Scanner;
public class CheckHunger {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Are you hungry? \nPlease answer to True or False");
       boolean answer = scan.nextBoolean();

       if(answer){
           System.out.println("You are hungry, so I will get some food for you");
       } else{
           System.out.println("Great than practice Java");
       }



    }
}
