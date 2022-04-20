package day05_variables;

public class CarInfo {

    //add new class CarInfo
    //add main method
    //declare and assign these variables:
    //
    //    car model, driver name, license number, speed, is automatic, license class (char)

    public static void main (String [] args ){

        String model = "Toyata Rav4";
        String driverName = "Vildan";
        int licenseNumber = 123456789;
        int speed = 240;
        boolean isAutomatic = true;
        char licenseClass = 'B';

        String message = "We have a car which brand is " + model + ". " + " According to registration, driver name is " + driverName + ", license number is " + licenseNumber + ", speed is " + speed + ", license class is " + licenseClass + "  and yes it is a automatic, " + isAutomatic + ". ";

        System.out.println(message);




    }
}
