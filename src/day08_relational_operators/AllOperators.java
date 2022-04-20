package day08_relational_operators;

public class AllOperators {
    public static void main(String[] args) {

        System.out.println(5+2*3);
        System.out.println(5 * 2 + 4 / 2);
        System.out.println( 5 + 2 > 4 - 3); // 7 > 1 => true

      //  int a = 20;
        // int b = -a-- + a++ + --a * a--;
         //     -20  + 19  + 19  * 19

       // System.out.println(b);
        // System.out.println(a);

        /*
        Evaluate the expressions step by step. NOT in intellij, do it yourself

int x = 2 + 3 * 2 / 1;
        2 +   6   / 1;
        2 +     6
      =    8
what is x? */
        int x = 2 + 3 * 2 / 1;
        System.out.println(x);

        /* int y = ( 2 + 3 ) * 2;
       what is y? = 5   * 2 = 10; */ int y = ( 2 + 3 ) * 2;
        System.out.println(y);

        /* int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2;
      what is i? = 8 + 2 + 3 + 5 - 2 - 1 -0 + 2 =  17;
         */ int i = 8 + 2 + 3 + 5 - 2 - 1- 0 + 1 * 2;
        System.out.println(i);

        int a = 8;
        int b = a--;
        System.out.println(a); // 7
        System.out.println(b); //8

        /*
        nt a =1
int b = -a-- + a++ / -a-- * --a;

what is a?
what is b?
         */
        int c = 1;
        int d = -c-- + c++ / -c-- * --c; // d = -1 + 0 / -1 * -1
        System.out.println(c); // -1
        System.out.println(d); // -1

        /*
        int A = 50;
int B = --A + A++ + A-- + A++;

what is A?
what is B?
         */
        int A = 50; // 50
        int B = --A + A++ + A-- + A++; // 49 + 49 + 50 + 49 = 197
        System.out.println(A);
        System.out.println(B);

        /*
        int X = 4;
int Y = X * 4 - X++;

what is X?
what is Y?
         */
        int X = 4; // 5
        int Y = X * 4 - X++; // 4 * 4 - 4 = 12
        System.out.println(X);
        System.out.println(Y);
        /*
        int t = 100;  101 100 101  100
        int p = - ++t * -t-- / t++ + --t; // -101 * 101 / 100 + 100 = 200
         */
        int t = 100;
        int p = - ++t * -t-- / t++ + --t;
        System.out.println(t);
        System.out.println(p);

       /* int R = 20; 19  20     19   18
          int W = -R-- + -R++ + --R * R-- % 2;  -38
                  -20  +  -19 +  19 * 19  % 2 */
        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        System.out.println(R);
        System.out.println(W);

        /*
        int M = 300; 301 300
        int N = 400; 401 400
        int U = ++M + N++ - M-- % 2 + --N % 2;
              = 301 + 400 - 301 % 2 + 400 % 2;
              = 301 + 400 - 1 + 0 = 700 */
        int M = 300;
        int N = 400;
        int U = ++M + N++ - M-- % 2 + --N % 2;
        System.out.println(M);
        System.out.println(N);
        System.out.println(U);

        /*

         */

    }


}
