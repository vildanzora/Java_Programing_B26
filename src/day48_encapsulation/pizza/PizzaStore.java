package day48_encapsulation.pizza;

public class PizzaStore {
    public static void main(String[] args) {

        Pizza first = new Pizza ("large", 3);
        System.out.println(first);

        //first.setNumberOfToppings(2);
        first.setNumberOfToppings(2);
        System.out.println(first);

        Pizza second = new Pizza ("", -2);
        System.out.println(second);

        second.setSize("Small");
        second.setNumberOfToppings(1);
        System.out.println(second);

        String size = "small";
        System.out.println(size.equalsIgnoreCase("small") ? 4 : size.equalsIgnoreCase("medium") ? 6 : 8);




    }

}
