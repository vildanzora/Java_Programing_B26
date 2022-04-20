package day26_nested_loop;

public class BackTriangle {
    public static void main(String[] args) {

        for (int i = 8; i >= 0; i--) {

            for (int j = i; j >= 0 ; j--) {

                System.out.print(" * ");

            }
            System.out.println();

        }



    }
}