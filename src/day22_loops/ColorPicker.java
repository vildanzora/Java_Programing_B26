package day22_loops;
import java.util.Scanner;
public class ColorPicker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int colorsPicked = 0;
        String uniqueColor = "";

        while(colorsPicked <3){
            System.out.println("Pick a Color");
            String color = input.nextLine();


             if (uniqueColor.contains(color)){
                 System.out.println("You already have that color");
             } else {
                 // if we are here it means the color is unique
                 uniqueColor += color + " ";
                 colorsPicked++;
             }




        }

        System.out.println(uniqueColor);

    }
}
