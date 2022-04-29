package day53_abstraction.cars;

// public class ElectricCar extends Car {

// Car is abstract class electric car is first non-abstract class that inherits abstract class

public abstract class ElectricCar extends Car {

    /* We  make abstract class.
    - It is not a concrete class any more bc it is abstract class.
    - I can have abstract methods so there is no problem to inherits to start method to my electric car class
    - I don't have to override bc it is abstract class
    */

    /*
    the ElectricCar class is a sub class of the Car class
    the Car class was abstract and ElectricCar is also abstract
    abstract class can have abstract methods
    so, there is no problem to inherit and we don't need to override any method in this class
 */

    public abstract void charge ();





}
