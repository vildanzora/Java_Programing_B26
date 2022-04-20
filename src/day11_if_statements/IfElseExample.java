package day11_if_statements;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 50;
        if (score >= 75) {
            System.out.println("passing");
        } else {
            System.out.println("failing");
        }

        int year = 2021;

        boolean lockdown = year == 2020 || year == 2021;
        if (lockdown) {
            System.out.println("\n\n\nstay at home");
            System.out.println("practice java");
            System.out.println("wear mask");
        } else {
            System.out.println("party");
            System.out.println("still practice java");
            System.out.println("maybe travel");
        }
    }
}
