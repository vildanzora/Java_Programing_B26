package day09_scanner;

public class Discount {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isPoliceOfficer = false;
        boolean isTeacher = true;
        boolean isFirefighter = false;

        boolean getDiscount = isWeekend && (isPoliceOfficer || isTeacher || isFirefighter);
                        //  = The first boolean must have to be True and inside the ( ) are flexible, one of three can be true.
        System.out.println("Do you get a discount?: " + getDiscount );









    }
}
