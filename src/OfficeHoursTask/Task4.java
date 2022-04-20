package OfficeHoursTask;

public class Task4 {
    public static void ArmstrongNumber (int number) {

        int a = number;
        int b;
        int sum = 0;
        while (number > 0) {
            b = number % 10;
            number = number / 10;
            sum += b * b * b;
        }
        if (a == sum) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }


    public static void main(String[] args) {
       int number = 153;
        ArmstrongNumber(number);
    }


}
