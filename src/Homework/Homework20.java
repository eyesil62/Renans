package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args) {

        //Write a code where user enters a sentence.
        // Find how many of those words contains the "da"(ignore the case)
        // and print the word if it contains "da"(ignore the case)

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence.");
        String str = input.nextLine();
        str = str.toLowerCase();
        String [] stra=str.split("");
        System.out.println(Arrays.toString(stra));


    }
}