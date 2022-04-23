package day50_inheritance;

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write your code below this line.
        int day=0;
        boolean[] flag=new boolean[8];
        while(!Arrays.toString(inhabitants).equals("[0, 0, 0, 0, 0, 0, 0, 0]")){
            for(int i=0; i<flag.length; i++) flag[i]=false;
            System.out.print("Day "+day+" ");
            day++;
            System.out.println(Arrays.toString(inhabitants));
            for(int i=0; i<inhabitants.length; i=i+1){//i++ i=i+1 i+=1
                if(inhabitants[i]==0){
                    if(i==0){
                        if(inhabitants[i+1]>0 && flag[i+1]==false){
                            inhabitants[i+1]/=2;
                            flag[i+1]=true;
                            if(inhabitants[i+1]==0){
                                i=i+1;
                            }
                        }
                    }else if(i==inhabitants.length-1){
                        if(inhabitants[i-1]>0 && flag[i-1]==false){
                            inhabitants[i-1]/=2;
                            flag[i-1]=true;
                        }
                    }else{
                        if(inhabitants[i-1]>0 && flag[i-1]==false){
                            inhabitants[i-1]/=2;
                            flag[i-1]=true;
                        }
                        if(inhabitants[i+1]>0 && flag[i+1]==false){
                            inhabitants[i+1]/=2;
                            flag[i+1]=true;
                            if(inhabitants[i+1]==0)i++;
                        }
                    }
                }
            }
            //System.out.println(Arrays.toString(inhabitants));
        }
        System.out.print("Day "+day+" ");
        System.out.println(Arrays.toString(inhabitants));
        System.out.print("---- EXTINCT ----");




    }
}