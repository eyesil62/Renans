package Udemy;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        System.out.println(" do you want to know me  ? ");

        myinfo();
//        yours();

    }
    public static void myinfo () {
        int age = 29;
      System.out.println(" My name is Emrah " +age);
      myage();

    }
    public static void myage () {
        System.out.println("I'm 29 " );
    myinfo();

    }

    public static void yours () {
        System.out.println(" what's your name ? ");
        System.out.println(" very nice to meet you !! " + " i hope you have a great day");
    }
}
