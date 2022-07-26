package Homework;

public class Homework_13 {
    public static void main(String[] args) {

        //Write a program   that   will   count
        // how   many   times   "a"   is   found   in   any   given   String:
        //String mystring="java is fun, but sometimes java is just pain.Love java java java";

        String mystring = "    java   is fun, but sometimes java is just pain. Love java java java";
        int c =mystring.length();
        for ( int k=0; k<=c; k++) {
            if (mystring.charAt(k)=='a') {
                System.out.println();
                k++;
            }

        }
        System.out.println("count of \"a\" is :" );
    }
}
