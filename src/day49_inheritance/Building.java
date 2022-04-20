package day49_inheritance;

public class Building {
    public static void main(String[] args) {

        Person obj = new Person();
        obj.name = "James Bond";
        obj.age = 40;
        obj.favoriteHobby = "spy stuff";
        obj.talk();
       // obj.study(); this was a method made in the child class

        Student obj2 = new Student();
        obj2.name = "Vildan";
        obj2.age = 27;
        obj2.favoriteHobby = "Swimming";
        obj2.talk();
       // The above variables and methods were inherited from the person class

        obj2.funLevel = 100;
        obj2.study();



    }
}
