package Udemy;

import java.util.Scanner;

public class Workbook_3_7_Trivia {
    public static void main(String[] args) {

        Scanner trivia = new Scanner(System.in);
        System.out.println(" 1. Which country held the 2016 Sumer Olymic ? ");
       // System.out.println("a) China \t\nb) Ireland \t\nc) Brazil \t\nd) Italy \n");
        int userscore=0;

        String answers1 = trivia.nextLine();
        if (answers1.equals("c")) {
            userscore+=5;
        }

        System.out.println("\n 2 ) quasiton ");
        String answers2 = trivia.nextLine();
        if (answers2.equals("b")) {
            userscore+=5;
        }

        System.out.println("\n 3 ) quasiton ");
        String answers3 = trivia.nextLine();
        if (answers3.equals("c")) {
            userscore+=5;

        }
        System.out.println("\n 4 ) quasiton ");
        String answers4 = trivia.nextLine();
        if (answers4.equals("c")) {
            userscore+=5;
        }

        if (userscore>=15) {
            System.out.println("wow , you know your stuff!!");
        } else if (userscore<15) {
            System.out.println("not bad"); }
        else {
            System.out.println(" better luck next time");
        }

    }
}
