package day19_string;
import java.util.Scanner;
public class RelativeChecker {
    public static void main(String[] args) {

        /*Given two full names check if the two people are related. They will be considered to be related
        if they have the same last name

        Ex:
            Input:
            James Bond
            Jamie Bond
            Output:
            Related

            Input:
            James Bond
            Alex Benji
            Output:
            Not Related    */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first name of person one");
        String name1 = input.next();

        System.out.println("Please enter last name of person one");
        String lastName1 = input.next();

        System.out.println("Please enter first name of person two");
        String name2 = input.next();

        System.out.println("Please enter last name of person two");
        String lastName2 = input.next();


        String person1 = name1 + " " + lastName1;
        String person2 = name2 + " " + lastName2;

       boolean relative =  ( (person2.contains(lastName1)) || (person1.contains(lastName2)));

       if(relative) {
           System.out.println("Related");
       } else {
           System.out.println("Not related");
       }
    }
}
