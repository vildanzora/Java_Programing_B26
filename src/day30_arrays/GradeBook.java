package day30_arrays;

public class GradeBook {
    public static void main(String[] args) {

        String [] names = {"Vildan Zora", "Alparslan Zora", "Nurdan Orgun"};
        int [] score = {67, 78, 90};
        char [] letterGrade = new char [3];

        for (int i = 0; i < score.length; i++) {

            if (score[i] >= 85) {
                 letterGrade[i] += 'A';

            } else if (score[i]>=75) {
                letterGrade[i] += 'B';
            } else if (score[i] >= 65 ){
                letterGrade[i] += 'C';
            } else {
                letterGrade[i] += 'D';
            }

            System.out.println("" + names[i] + " | " + score[i] + " | " + letterGrade[i]) ;



        }




    }
}
