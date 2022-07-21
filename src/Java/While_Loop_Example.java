package Java;

import java.util.Scanner;

public class While_Loop_Example {
    public static void main(String[] args) {

        // write a code where user can do multiple calculation without re-running the code;

       Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("Please Select The Operation 1 : fpr Addition 2: for subs 3: for multi 4 : for division, any other number to exit");

        int i = sc.nextInt();

        while (i==1 || i == 2 || i==3 || i ==4) // we can just say true instead of i{
            System.out.println("Please enter the first number");
            double num1 = sc.nextDouble();
            System.out.println("please enter the second number");
            double num2 = sc.nextDouble();
            if (i == 1) {
                double result = num1 + num2;
                System.out.println("result is = " + result);
            } else if (i == 2) {
                double result = num1 - num2;
                System.out.println("result is = " + result);
            } else if (i == 3) {
                double result = num1 * num2;
                System.out.println("result is = " + result);
            } else {
                double result = num1 / num2;
                System.out.println("result is = " + result);
            }
            i = sc.nextInt();


        }
    }

