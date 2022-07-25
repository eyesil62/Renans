package Homework;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Homework_6 {
    public static void main(String[] args) {

       // Write a code where user is asked to enter an integer number:
       // 1) Using the given number find the factorial of that number and Print the result.
       // example: 5 ==> 5! = 5*4*3*2*1 = 120

//        Scanner scan=new Scanner(System.in);
//        System.out.println("Please enter a number :");
//        int input=scan.nextInt();
//        int fact=1;
//
//        for (int i=1; i<=input; i++){
//            fact *= i;
//        }System.out.println(input+"!"+"="+fact);
//

//        System.out.println("Welcome to Revenue Calculator");
//
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Please enter the Price of the product");
//        double price = scn.nextDouble();
//
//        System.out.println("Please enter the Quantity of the of the product");
//        int quantity = scn.nextInt();
//        System.out.println("Revenue=" + "$"+(quantity * price));
//
//        if (price>0 && quantity>0) {
//            System.out.println("total daily revenue will be : " +(price*quantity));
//        }
//
//        double daily = (price*quantity);
//        System.out.println("the dialy revenu will be " +daily);

        Scanner scn = new Scanner(System.in);
        System.out.println("Please Enter First name :");
        String name = scn.nextLine();

        System.out.println("Please enter your Last name");
        String lastname = scn.nextLine();

        System.out.println("full name is : " +(name+""+lastname));


    }
}
