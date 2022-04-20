package day15_switch;
import java.util.Scanner;
public class HotelRoom {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many days you will stay at tha hotel?");
        int numberOfDays = scan.nextInt();

        System.out.println("How many people are staying in the room?");
        int partySize = scan.nextInt();

        String roomType = "";
        double price = 0;
        boolean available = true;

        switch (partySize) {
            case 1:
                roomType ="Single Room";
                price= numberOfDays * 100;
                break;

            case 2:
                roomType = "Double Room";
                price= numberOfDays * 125;
                break;

            case 3: case 4:
                roomType = "Large Room";
                price= numberOfDays * partySize * 150;
                break;

            case 5: case 6 : case 7:
                roomType = "Suite";
                price= numberOfDays * 5000;
                break;
            default:
                System.out.println("Sorry we don't have any available rooms for that size party");
                available = false;
        }// end of the switch

        if (available) {
            System.out.println("Room type: " + roomType + "\nPrice: $" + price);
        }













    }
}
