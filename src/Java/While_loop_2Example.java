package Java;

import java.util.Scanner;

public class While_loop_2Example {
    public static void main(String[] args) {
        // same example as first one

        Scanner rd = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("Please Select The Operation 1 : fpr Addition 2: for subs 3: for multi 4 : for division, any other number to exit");

        int con = rd.nextInt();
        while (true) {
            if (con==1){
                System.out.println("Please enter first number = ");
                double num1 = rd.nextDouble();
                System.out.println("please enter second number");
                double num2 = rd.nextDouble();
                System.out.println("the result is " +(num1 + num2));
            }
            else if (con==2){
                System.out.println("Please enter first number = ");
                double num1 = rd.nextDouble();
                System.out.println("please enter second number");
                double num2 = rd.nextDouble();
                System.out.println("the result is " +(num1 - num2));
            }
            else if (con==3){
                System.out.println("Please enter first number = ");
                double num1 = rd.nextDouble();
                System.out.println("please enter second number");
                double num2 = rd.nextDouble();
                System.out.println("the result is " +(num1 * num2));
            }
            else if (con==4){
                System.out.println("Please enter first number = ");
                double num1 = rd.nextDouble();
                System.out.println("please enter second number");
                double num2 = rd.nextDouble();
                System.out.println("the result is " +(num1 / num2));
            }
            else {
                break; }
        }
        System.out.println("exit the calculation");
        con = rd.nextInt();
    }
}
