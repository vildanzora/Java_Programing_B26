package day49_inheritance.animals;

public class Zoo {
    public static void main(String[] args) {

        Animal  animal = new Animal();
        animal.species = "generic animal";
        animal.numberOfLegs = 0;
        animal.walk();

        Dog dog = new Dog();
        dog.species = "Dog";
        dog.numberOfLegs = 4;
        dog.bark();

        Lion lion = new Lion();
        // Q: How many instance variables does the lion object have access to? 3 species numberOfLeg and maneSize

        // Q: How many instance methods does the lion object have access to? 2 roar and walk

        lion.roar();
        lion.species = "species";
        lion.walk();


    }
}
