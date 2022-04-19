package day48_encapsulation;

public class Rectangle {
    /*- data: length, width */

    private int length, width;

    /* - create a constructor that creates a Rectangle object with the length and the width */


    /*  - encapsulate the Rectangle class */

    /* - setter condition: length and width must both be a positive number otherwise they will not be assigned to the instance variable */

    public Rectangle(int length, int width) {
        if (length > 0 && width >0) {

            this.length = length;
            this.width = width;
        } else {
            System.out.println("must be positive number");
        }
    }

    /* calculate and return the area of a Rectangle */

    public int calculateArea () {
        return(length *2) + ( width * 2);
    }

    /* calculate and return the perimeter of a Rectangle */

    public int perimeterRectangle () {
        return length * width;
    }

    /*  print the length, width, area, and perimeter of the Rectangle object */

    @Override
    public String toString() {
        return "length =" + length + "\n" +
                ", width =" + width + "\n" +
                "area =" + calculateArea()+ "\n" +
                "perimeter of rectangle =" + perimeterRectangle() + "\n"
                ;
    }

    /* Create a separate class to create and test the Rectangle objects
     */
}
