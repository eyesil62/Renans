package Homework;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Homework_8 {
    public static void main(String[] args) {

        //Write a code where user is asked to enter a number.
        //Find the sum of all the even numbers between 0 to that number (included)
        //Find the sum of all the odd numbers between 0 to that number (included)

        // even numbers : can be divided 2  : 2,4 ..14,20..
        // odd numbers : can not, such as : 1,3,11,27

        Scanner code = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = code.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        System.out.println("\n all even numbers :");
        for (int a = 0; a < num; a++) {
            if (a % 2 == 0) {
                evenSum += a;
                System.out.print(" " + a + " ");
            }
        }


        System.out.println("\nall odd numbers");
        for (int b = 0; b <= num; b++) {
            if (b % 2 != 0) {
                oddSum += b;

                System.out.print(" " + (b) + " ");
            }
        }


        System.out.println("\nevenSum = " + evenSum);
        System.out.println("oddSum = " + oddSum);
    }
}