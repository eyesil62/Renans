package Homework;

import java.util.Scanner;

public class Mahir_Hwork {
    public static void main(String[] args) {
       // Create a program that will reverse a string , Please use While loop.

//        Scanner name = new Scanner(System.in);
//        String input = name.nextLine();
        String name = "Emrah"; // 5
        String reverse = "";
        int a = name.length()-1; // a = 4
        while ( a>=0) { // 4,3,2,1,0  = total of 4 char
            reverse+=name.charAt(a);
            a--;

        }
        System.out.println(reverse);

        String lastname = "Yesil";
        String rvrse = "";

        int y = lastname.length();
        for ( int m = y; m>=0; m--);



    }
}
