package day33_methods;

import java.util.Arrays;

public class MultiplyArray {
    public static void main(String[] args) {

        int [][] dataSet1 = {{1, 2, 3},
                            {2, 5, 10},
                            {0, 3, 20}};

        int [][] dataSet2 = {{10, 4, 3},
                            {5, 2, 7},
                             {100,20, 5}};

        int [] [] resultDataSet = new int [3] [3];

        for (int i = 0; i < dataSet1.length; i++) {
            for (int j = 0; j < dataSet1[i].length; j++) {
                resultDataSet [i] [j] = dataSet1[i][j] * dataSet2[i][j];

            }
        }
        System.out.println(Arrays.deepToString(resultDataSet));


    }
}
