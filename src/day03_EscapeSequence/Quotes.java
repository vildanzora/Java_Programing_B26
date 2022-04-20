package day03_EscapeSequence;

public class Quotes {

    public static void main (String[] args){

        System.out.println("I like \"java\" Programming");
        System.out.println("\"This is a quote\"");

        /*The first quote is before java printing the next
        the second quote is to print the " quotation mark in the console"*/

        // I want to print backslash

        System.out.println("abc\\def");
    /* The first backslash is for the syntax of escape charactter.
    The second backslash is for the backslash character to be output.
     */

        // What if I want to multiple backslash?
        System.out.println("abc\\\\def");
        System.out.println("abc\\\"def");
        System.out.println("My name is start with 'V'");
        System.out.println("This was not tabbed");
        System.out.println("\tThis was  tabbed once");
        System.out.println("\t\tThis was  tabbed twice");
        System.out.println("    This was  tabbed without escape");
        System.out.println("                example");
        System.out.println("\t\t\t\texample");
        System.out.println("\n2)grab milk\n3)wash car");


    }
}
