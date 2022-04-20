package day06_arithmetic_operators;

public class AverageScore {
    /*create a class day06_arithmetic_operators.AverageScore.AverageScore
  add a main method
  declare and assign these variables:
     four score values

  calcualte the average score using the given four score values

  Ex:
     90, 80, 100, 95

     Print:
        Average: 91.25 */
    public static void main(String[]args){

        int num1 = 90;
        double num5 = num1;

        int num2 = 80;
        double num6 = num2;

        int num3 = 100;
        double num7 = num3;

        int num4= 95;

        double num8 = num4;

        double averageScore = (num5+num6+num7+num8)/4;

        System.out.println(averageScore);
    }

}

