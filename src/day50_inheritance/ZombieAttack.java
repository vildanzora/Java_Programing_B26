package day50_inheritance;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int sum =0;
        int day=0;

        for(int each : inhabitants) {
            sum += each;
        }


        while (sum > 0) {

            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
            day++;

            sum = 0;

            for (int i = 1; i < inhabitants.length; i++) {
                if ( inhabitants[i] == 0 ) {
                    inhabitants[i-1] /= 2;
                }

            }

            for (int i = inhabitants.length-2; i > 0; i-- ){

                if (inhabitants[i] == 0) {
                    inhabitants[i+1] /=2;
                }
            }

            for (int each : inhabitants) {
                sum += each;
            }


        }

        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");

    }
}
