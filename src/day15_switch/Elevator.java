package day15_switch;
import java.util.Scanner;
public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please select floor number");
        int floorNumber = scan.nextInt();

        switch(floorNumber) {

            case 1:
                System.out.println("Where do you want to go in floor 1?\n\t1)Lobby\n\t2)Starbucks\n\t3)Amazon Pick Up");
                int floor1 = scan.nextInt();
                if( floor1 == 1){
                    System.out.println("Going Lobby Exiting");
                } else if(floor1 == 2){
                    System.out.println("Going Starbucks Exiting");
                } else {
                    System.out.println("Going Amazon Pick Up Exiting");
                }
                break;
            case 2:
                System.out.println("Where do you want to go in floor 2?\n\t1)Nasa\n\t2)Cydeo\n\t3)Discover");
                int floor2 = scan.nextInt();
                if( floor2 ==1){
                    System.out.println("Going Nasa Exiting");
                } else if(floor2 == 2){
                    System.out.println("Going Cydeo Exiting");
                } else {
                    System.out.println("Going Discover Exiting");
                }
                break;

            case 3:
                System.out.println("Where do you want to go in floor 3?\n\t1)Uber\n\t2)Lyft\n\t3)Chase");
                int floor3 = scan.nextInt();
                if( floor3 ==1){
                    System.out.println("Going Uber Exiting");
                } else if(floor3 == 2){
                    System.out.println("Going Lyft Exiting");
                } else {
                    System.out.println("Going Chase Exiting");
                }
                break;

            case 4:
                System.out.println("Where do you want to go in floor 4?\n\ta)Rooftop\n\tb)Lounge");
                int floor4 = scan.nextInt();
                if( floor4 ==1){
                    System.out.println("Going Rooftop Exiting");
                } else if(floor4 == 2){
                    System.out.println("Going Lounge Exiting");
                }
                break;
            default:
                System.out.println("Invalid Floor Selected");


        } // en of the switch





    }
}
