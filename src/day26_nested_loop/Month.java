package day26_nested_loop;

public class Month {
    public static void main(String[] args) {



        for (int week = 1; week <= 4 ; week++) {
            System.out.println("Week " + week);

            for (int day = 1; day <= 7; day++) {
                System.out.println("\tDay: " + day);

                switch (day) {
                    case 1:
                        System.out.println(" Monday");
                        break;

                } // en of switch

            }



        }












    }
}
