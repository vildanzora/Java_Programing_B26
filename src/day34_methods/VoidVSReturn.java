package day34_methods;

public class VoidVSReturn {

    public static void main(String[] args) {
        sayHello();
        sayBye();
        System.out.println(sayBye());
        String msg = sayBye();
        System.out.println(msg);
    }

    public static void sayHello () {
        System.out.println("Hello");
    }

    public static String sayBye () {
        return "bye";
    }




}
