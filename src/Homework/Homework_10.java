package Homework;

import java.util.Scanner;

public class Homework_10 {
    public static void main(String[] args) {

        /** Write a code where user is asked to enter a number:
        Calculate the square of all the numbers from 0 to given number and print the result for each number
         (square of a number is number*number == > 5*5 = 25 or 6*6 = 36 */


        Scanner number = new Scanner(System.in);
        System.out.println("User entered this number : ");
        int num = number.nextInt();
        int square = num * num;
        for ( int a=1; a<=num; a++)  {
            square = a*a;
            System.out.println("Square of each number from 1 to " +num +" is : " +square);
        }
    }
}
