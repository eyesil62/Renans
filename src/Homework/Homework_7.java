package Homework;

import java.util.Scanner;

public class Homework_7 {
    public static void main(String[] args) {

//        Write a code where user is asked to enter a number and check for every number
//        between 0 to that number to see how many number
//        between 0 to that number can be divided to 3 and 5 and sum all those number, Print the result

        Scanner randomnumber = new Scanner(System.in);
        System.out.println("Please enter a random number");
        int number = randomnumber.nextInt();

        int sum=0;
        System.out.println("what numbers from 0 to "+ number +" can be divided 3 and 5:");
        for (int i = 1; i <= number; i++) {

        if (i%15==0){
             sum+=i;
            System.out.println(+i); }

        }

        System.out.println("the sum of all the numbers will be :" +sum);
    }
}

