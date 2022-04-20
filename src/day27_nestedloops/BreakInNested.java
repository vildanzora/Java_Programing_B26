package day27_nestedloops;

public class BreakInNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println( "i" +  i);



            for (int j = 0; j < 2; j++) {

                System.out.println( "j" +  j);




            }

            System.out.println();


            if(i == 3) {
                break;
            }





        }



    }
}
