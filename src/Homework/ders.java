package Homework;

import java.util.Scanner;

public class ders {
    public static void main(String[] args) {

        //Write a code where the the user is asked to enter an integer number
        //- sum of all the odd numbers between 1 to given number (included)
        // but exclude the 9,11,23,35 from the total sum if those numbers happens to be in the range of 1 to given number.
        //- The sum should not exceed 300

        Scanner scn = new Scanner(System.in);
        System.out.println(" please enter a number ");
        int num = scn.nextInt();

        int sum=0;
        for (int i = 1; i <=num; i++) {

        if (i==11 || i==9 || i==23 || i==23 || i==35){
            continue;
        }
            System.out.print(i+" ");
        sum=sum+i;
        if(sum>300){
            sum=sum-i;
        }
        }
        System.out.println(sum);

}}