package day30_arrays;

public class SplitExamples {
    public static void main(String[] args) {

        String s = "Monday,tuesday,wednesday,thursday,friday,saturday,sunday";

        String [] days = s.split(",");

        for (String day : days ) {
            System.out.println(day);
        }
        System.out.println();
        String [] withOutDay = s.split("day");
        for (String each : withOutDay) {
            System.out.println(each);
        }

        System.out.println( );
        String str = "Jan-Feb-Marc-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";

        String [] months = str.split("-");

        for (String each : months) {
            System.out.println(each);
        }



    }
}
