package day12_if_statements;

public class DayOfWeek {
    public static void main(String[] args) {

       int day = 1;

       if ( day == 1){
           System.out.println("monday");
       } else if (day ==2){
           System.out.println("tuesday");
       } else if (day == 3) {
           System.out.println("wend");
       }else if (day == 4){
           System.out.println("thurs");
       } else if (day == 5){
           System.out.println("friday"); }
       else if (day == 6){
           System.out.println("sat"); }
       else if (day == 7){
           System.out.println("sunday"); }
       else
       { System.out.println("invalid day number");}

    }
}
