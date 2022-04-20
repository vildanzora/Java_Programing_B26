package day33_methods;

public class MultiArrayExample {
    public static void main(String[] args) {

        int [] [] arr = new int [10] [10];
        int count = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count;
                count++;
            }
        }

        for (int k = 0; k < arr.length; k++) {
           System.out.println (arr[k][0] + " - " + arr[k][arr[k].length-1]);

        }

    }
}
