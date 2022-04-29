package day53_abstraction.cars;

public class Garage {
    public static void main(String[] args) {

       // Car obj1 = new Car();
        // Car is a abstract class and abstract class can not make an object

        Toyota obj2 = new Toyota();
        obj2.start();

        System.out.println();

        Honda obj3 = new Honda();
        obj3.start();

        // Both toyota and Honda were concrete classes, because they were not abstract, so we have to implement to start method

      //   ElectricCar obj4 = new ElectricCar(); is a abstract class, and we  can not create an object of this class

        System.out.println(   );

        Tesla obj5 = new Tesla();
        obj5.charge(); // defined in the car class
        obj5.start(); // defined in the electric car class

        // but tesla was a non-abstract class, so it was concrete which mean it had to override all the abstract methods from the super classes


    }
}
