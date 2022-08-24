package Udemy_1.Udemy;

import java.util.Scanner;

public class Workbook_2_5 {
    public static void main(String[] args) {

        //Task 1 - Using Scanner, ask the user questions

       Scanner scn  = new Scanner(System.in);
//        System.out.println("name : ");
       scn.next( );
//
//        System.out.println("last name : ");
//        scn.next();

        System.out.println("how old are you : ");
        int age = scn.nextInt();

        System.out.println(" how much is your salary");
        int scn1 = scn.nextInt();

//        System.out.println("are you married : ");
//        boolean marriage = scn.hasNext();

        System.out.println(" user input  : " +(int)(age-scn1) );



        //Ask for their first name.
        //Ask for their last name.
        //Ask: how old are you?
        /* Ask them to make a username. SIDE NOTE:
           – nextLine() gets "skipped" if you put it ahead of nextInt() , nextDouble(), nextLong().
           – You will understand why this happens when we cover Delimiters in the next section (Booleans and Conditionals).
           – For now, just know that the solution is to add an extra nextLine().
        */
        //Ask what city they live in.
        //Ask what country that's from.


        //Task 2 - Print their information.

        System.out.println("Thank you for joining JavaGram!");

        //Print their information like so:


//
//        System.out.println("Welcome to JavaGram! Let's sign you up.");
//
//        System.out.println("What is your first name?");
//        String firstName = scan.nextLine();
//
//        System.out.println("What is your last name?");
//        String lastName = scan.nextLine();
//
//        System.out.println("How old are you?");
//        int age = scan.nextInt();
//
//        scan.nextLine();
//        System.out.println("Make a username");
//        String userName = scan.nextLine();
//
//        System.out.println("What city do you live in?");
//        String city = scan.nextLine();
//
//        System.out.println("What country is that?");
//        String country = scan.nextLine();
//
//        System.out.println("Thank you for joining JavaGram!");
//        System.out.println("\nHere is the information you entered:");
//        System.out.println("\tFirst Name: " +firstName);
//        System.out.println("\tLast Name: " + lastName);
//        System.out.println("\tAge: " + age);
//        System.out.println("\tUsername: " + userName);
//        System.out.println("\tCity: " + city);
//        System.out.println("\tCountry: " + country);
//
//        scan.close();
    }
}
