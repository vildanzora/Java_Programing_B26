package day10_scanner;
import java.util.Scanner;
public class Apartment {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        System.out.println("What is the name of the owner? :");
        String ownerName = scan.nextLine();

        System.out.println("What is your address?: ");
        String address = scan.nextLine();

        System.out.println("What is the number of your unit?: ");
        int numberOfUnit = scan.nextInt();

        System.out.println("Average size of your unit?: ");
        double averageSize = scan.nextDouble();

        System.out.println("What is your monthly rent amount?: ");
        double rentAmount = scan.nextDouble();

        scan.nextLine();

        System.out.println("number of washers and driers?: ");
        String numberOfWashersAndDriers = scan.nextLine();

        System.out.println("Are pets allowed?: ");
        boolean isPets = scan.nextBoolean();

        System.out.println("has a pool?: ");
        boolean isPool = scan.nextBoolean();

        scan.nextLine();
        System.out.println("What is your  length of lease?: ");
        String  lengthOfLease = scan.nextLine();

        System.out.println("What is total unit number in building?: ");
        int  totalUnitNumber = scan.nextInt();

            System.out.println("What is total resident number : ");
            int  totalResidentNumber = scan.nextInt();


        System.out.println("What is phone number of owner?: ");
        String numberOfOwner = scan.next();

        System.out.println("is near a gas station?: ");
        boolean gasStation = scan.nextBoolean();

        System.out.println("number of floors?: ");
        int  numberOfFloors = scan.nextInt();

        System.out.println("has a basement?: ");
        boolean basement = scan.nextBoolean();

        System.out.println("has available units for rent?: ");
        boolean avaliableRent = scan.nextBoolean();

        System.out.println(" has air conditioning?: ");
        boolean airConditioning = scan.nextBoolean();

        System.out.println("number of parking spaces: ");
        int  parkingSpaces = scan.nextInt();

        System.out.println(" has wheel chair access?: ");
        boolean hasWheelChairAccess = scan.nextBoolean();

        System.out.println("  number of review stars (out of 5)?: ");
        double numberOfReviewStars = scan.nextDouble();

        double monthlyRentAfter3Years = (rentAmount * 90) /100;
        System.out.println("The monthly rent after 3 years:  " + monthlyRentAfter3Years);

        double monthlyRentAfter6Years = (rentAmount * 80) /100;
        System.out.println("The monthly rent after 6 years:  " + monthlyRentAfter6Years);

        double averageNumberOfResidentsPerUnit = (totalResidentNumber / totalUnitNumber);
        System.out.println("The average number of residents per unit: :  " + averageNumberOfResidentsPerUnit);

        int averageNumberOfParkingSpotsPerUnit = (parkingSpaces / totalUnitNumber);
        System.out.println("The average number of parking spots per unit:  " + averageNumberOfParkingSpotsPerUnit);

       int  averageNumberOfUnitsPerFloor = (totalUnitNumber / numberOfFloors);
        System.out.println("Average number of units per floor:  " + averageNumberOfParkingSpotsPerUnit);
    }
}
 /*
        Create the variables with the most appropriate datatype:

        - address, name of owner, number of units, average size of each unit, monthly rent amount, number of washers and driers, allows pets or not, has a pool, length of lease, total number of residents in building, phone number of owner, is near a gas station, number of floors, has a basement, has available units for rent, has air conditioning, number of parking spaces, has wheel chair access, number of review stars (out of 5)

        - Create these variables and use previous variables to get the values

            - monthly rent after 3 years (discount 10% off original rent)
            - monthly rent after 6 years (discount 20% off original rent)
            - Average number of residents per unit (total residents / number of units)
            - Average number of parking spots per unit ( parking spots / units)
            - Average number of units per floor ( units / number of floors)

     */
