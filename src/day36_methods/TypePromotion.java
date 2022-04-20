package day36_methods;

public class TypePromotion {

    public static void main(String[] args) {

        use(3);
        use(3.5);
        use(1.2f);
        use(3L); // if i dont have the long method it will match the float
        use(3F);

        short s = 5;
        use(s);

        use((double)3); // we can use the casting in


    }

    public static void use(float f) {
        System.out.println("calling float method");
    }

    public static void use(double d) {
        System.out.println("calling double method");
    }


    public static void use(long l) {
        System.out.println("calling long method");
    }








}
