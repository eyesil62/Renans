package Homework;

import java.util.Scanner;

public class Homework19 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String day = "";
        System.out.println("Please enter a number ");
        int userinput = scn.nextInt();

        switch (userinput) {
            case 1 : day="monday";
                break;
            case 2: day= "tuesday";
            break;
            case 3: day="wednesday";
            break;
            default:day="the user input out of range";

        }
        System.out.println(day);

    }
}
