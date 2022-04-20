package day35_methods;

public class MaxNumberInArray {
     /*
    Max Number
    create a method that will accept an int array and return the biggest number from the array
     */

    public static int maxNumber(int [] nums){

        int max = nums[0];

        for(int num : nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}
