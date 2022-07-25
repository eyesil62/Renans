package Homework;

public class Homework_11 {
    //Write a program that will print the sum of the even numbers between 0-20 * include .
    // Please use for loop and if statement.

    public static void main(String[] args) {

        int sum= 1;
        for (int a=0; a<=20; a++){
            if (a%2==0){
               // System.out.print(" " +a);
                sum +=a;
                System.out.print(+a+" ");
            }
        }
        System.out.println("\nthe sum : " +sum);
    }
}
