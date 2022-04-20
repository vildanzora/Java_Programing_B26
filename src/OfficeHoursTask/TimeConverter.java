package OfficeHoursTask;

public class TimeConverter {
    public static void main(String[] args) {

        /*
        - Write a Java program to convert time from second to hours/min/day format
						- Input Seconds : 3695


							Expected Output:
							inputSeconds is 3695
							1 hours 1 minutes 35 seconds
         */

        int number = 3695;
        int sec = number %60;
        int min = (number /60)%60;
        int hours = (number/60)/60;

        System.out.println(number + " seconds equal to " + hours + " hour/s " + min + " minutes " + sec + " seconds.");



    }
}
