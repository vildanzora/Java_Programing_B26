package day42_custom_classes;

public class UsingItem {
    public static void main(String[] args) {

        Item item1 = new Item();
        item1.name = "Apples";
        item1.price = 3.99;

        System.out.println(item1); // you see day42_custom_classes.Item@3f0ee7cb if you dont do tostring

        Item item2 = new Item();
        item2.name = "Pears";
        item2.price = 2.99;
        System.out.println(item2);

    }

}
