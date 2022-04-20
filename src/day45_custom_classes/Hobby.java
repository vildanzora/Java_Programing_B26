package day45_custom_classes;

public class Hobby {
    /*
    create a class called Hobby
        - data:
            name, annual cost, is outdoors (boolean), requires others (boolean) */

    String name;
    double annualCost;
    boolean isOutdoors;
    boolean requiresOthers;

    /*
        - constructor
            - create a constructor that creates a Hobby object with the name
            - create a constructor that creates a Hobby object with the name and annual cost
            - create a constructor that creates a Hobby object with the name, annual cost, is outdoors, and requires others */

    public Hobby(String name) {
        this.name = name;
    }

    public Hobby(String name, double annualCost) {
        this(name);
        this. annualCost = annualCost;
    }

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOthers) {
        this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }

    /*
        - method:
            - doIt():
                print: Doing $name-of-hobby $outside-or-inside
            - toString()
                print all the Hobby information
     */

    public  void doIt ()  {
        System.out.println("Doing " + name + ( isOutdoors ? "Outdoor activity" : "indoors activity" ));

    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
    }
}
