package day09_scanner;

public class EligibleToVote {

    public static void main(String[] args) {

       String name = "James Bound";
       int age = 49;
       boolean criminalBackground = false;
       boolean citizen = true;

       boolean eligibleToVote = age >= 18 && citizen && !criminalBackground; // it have to be true && true && true. bothh or all have to be true, Hence we have to right !criminalBackground. because criminalBackground real result is false.

        System.out.println(name + " eligible to vote? : " + eligibleToVote);

    }
}
