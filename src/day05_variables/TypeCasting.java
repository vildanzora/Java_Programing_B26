package day05_variables;


/*
Type casting
Convert from one primitive datatype to another
- going from a smaller datatype to a bigger datatype
happens automatically
int i = 40;
long l = i;
- going from a bigger datatype to a smaller datatype
needs manually casting
long l = 100;
int i = (int) l;
 */
public class TypeCasting {
    public static void main (String [] args){

        byte b = 40;
        int i = b; // The byte value is automatically converted because byte is smaller than int.

        int i2 = 100;
        byte b2 = (byte) i2; // int is bigger than byte, so we must cast we cat the int type - i2 to a byte type using (byte)

        int i3 = 500;
        long l1 = i3; // int is smaller than long, so it will be automatically cast.

        long l2 = 200;
        int i4 = (int) l2;


        double d = 50.0;
        int i5 = (int)d;




    }

}
