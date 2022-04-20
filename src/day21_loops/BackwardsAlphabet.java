package day21_loops;

public class BackwardsAlphabet {
    public static void main(String[] args) {
      /*  char uppercaseBack = 90;

        while (uppercaseBack <= 90 && uppercaseBack >= 65) {
            System.out.println(uppercaseBack);
            uppercaseBack--;
        }*/

        char uppercaseBack = 'Z';

        while (uppercaseBack >= 'A') {
            System.out.println(uppercaseBack);
            uppercaseBack--;
        }

    }
}