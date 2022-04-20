package day11_if_statements;
import java.util.Scanner;
public class SingleIfExamples1 {
    public static void main(String[] args) {

/*
        System.out.println( " please write current year");
        int year = scan.nextInt();
        boolean lockdown = year == 2020 || year == 2021;

        if(lockdown){
            System.out.println("Stay at home");

        }*/

        int year = 2022;
        boolean lockdown = year ==2020 || year ==2021;
        if(lockdown){
            System.out.println("Stay at home");
            System.out.println("practice java");
            System.out.println("wear a mask");

        }

       if(!lockdown){
            System.out.println("party");
            System.out.println("still practice java");
            System.out.println("maybe travel");
        }





    }



}
