package day11_if_statements;
import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What the temperature going to be like in Iowa City for tomorrow");
        int answer = scan.nextInt();

        if(answer >= 70){
            System.out.println("Its nice day!\nGo outside, but with your laptop to code java");
        } else{
            System.out.println("Its too cold.\nCode more Java");
        }



    }
}
