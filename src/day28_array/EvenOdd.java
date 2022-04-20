package day28_array;

public class EvenOdd {
    public static void main(String[] args) {

        int [] nums = {8, 16, 25, 17, 13};
        int even =0;
        int odd =0;
        String evenNums = "";
        String oddNums = "";

        for (int i = 0; i < nums.length; i++) {

            if(nums[i] % 2 ==0){
                even++;
                evenNums += nums[i] + " ";
            } else {
                odd++;
                oddNums += nums[i] + " ";
            }
        }
        System.out.println("even counter: " + even);
        System.out.println("Even numbers: " + evenNums);
        System.out.println("Odd counter: " + odd);
        System.out.println("Odd numbers: " + oddNums);

         even =0;
         odd =0;
         evenNums = "";
         oddNums = "";

        System.out.println("===================");

        for( int each : nums) {
            if (each % 2 == 0){
                even++;
                evenNums += each + " ";
            } else{
                odd++;
                oddNums += each + " ";
            }
        }

        System.out.println("even counter: " + even);
        System.out.println("Even numbers: " + evenNums);
        System.out.println("Odd counter: " + odd);
        System.out.println("Odd numbers: " + oddNums);




    }
}
