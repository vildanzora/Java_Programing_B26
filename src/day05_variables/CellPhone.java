package day05_variables;

public class CellPhone {
    public static void main(String[] args){

        String Brand = "Apple";
        String Model = "iphone 13";
        String Color = "blue";
        double Price = 13456.789;
        int  Storage = 256;
        boolean hasCamera = true;
        String sim = "Straight Talk";

        System.out.println("I have a " + Model + " from " + Brand);
        System.out.println("It came in the color " + Color + " and it has " + Storage + "GB");
        System.out.println("For the sim type " + sim + " with a camera " + hasCamera + " the total price was $" + Price);

        String fullMessage = "\nI have a " + Model + " from " + Brand + "\nIt came in the color " + Color + " and it has " + Storage + "GB" + "\nFor the sim type " + sim + " with a camera " + hasCamera + " the total price was $" + Price;
        System.out.println(fullMessage);


    }

}
