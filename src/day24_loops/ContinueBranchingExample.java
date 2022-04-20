package day24_loops;

public class ContinueBranchingExample {
    public static void main(String[] args) {

        for(int i = 0 ; i <= 10; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i = 0; i <= 10; i++){
            System.out.print(i + " ");
            break;
        }

        System.out.println();
        for(int i = 0; i <= 10; i++){
            System.out.print(i + " ");
            if(i == 5){
                break;
            }
        }

        System.out.println();
        for(int i = 0; i <= 10; i++){
            System.out.print(i + " ");
            if(i == 5){
                continue; // nothing for skipping
            }
        }
        System.out.println();
        for(int i = 0; i <= 10; i++){
            if(i == 5){
                continue; // for this scenario skip 5
            }
            System.out.print(i + " ");

        }

        System.out.println();
        for (int i = 1; i <=100 ; i++) {

            if(i %2 == 1){ // if my number is odd continue, skip
                continue;
            }

            System.out.print(i + " ");
        }







        }
    }

