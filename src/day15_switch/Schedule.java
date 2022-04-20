package day15_switch;
import javax.swing.*;
import java.util.Scanner;
public class Schedule {
     /*
         Task:
            Ask the user to enter which day it is
            print which class we have on that day, and the time of the class
            show if there is office hours
            topic with instructor at time
            challenge:
                make each day flexible
                    monday
                    Monday
                    mon
                 reduce repeating code
         */
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Please enter the which day it is.");
         String day = scan.next();
         String information = "";

         switch (day) {
             case "Monday" : case "mon" : case "Mon" : case "MONDAY" :
             case "monday" :
                 information = "We have a Java class with Saim at 07:00 pm";
                 break;
             case "Tuesday" :
                 information = "We have a Java class with Saim at 07:00 pm but we also have office hours";
                 break;
             case "Wednesday" :
                 information = information = "We have a Java class with Saim at 07:00 pm but we also have office hours at 4:30";
             case "thursday" :
                 information = "We have a soft skills";
                 break;
             case "friday" :
                 information = "Today is a off day";
                 break;
             case "saturday" :
             case "sunday" :
                 information = "We have a full day of java with saim from 10:00 to 05:00 pm";
                 break;


             default:
                 information = "Not a valid day";
         }






     }
}
