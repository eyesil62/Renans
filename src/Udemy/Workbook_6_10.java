package Udemy;

import java.util.Scanner;

public class Workbook_6_10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        /**  Task 1:
         *   1. Ask the user: How many pizza toppings do you want?.
         *   2. Then, pick up the result using Scanner.
         */

        System.out.println("How many pizza toppings do you want ?");
        int ask = scan.nextInt(); scan.nextInt();
        String [] toppings = new String[ask];

        System.out.println("Great, enter each toppping!");

        for (int i = 0; i <ask ; i++) {
            String top = scan.nextLine();
        }



      // System.out.println("here is the new array : " +Array.toString(toppings));

        // Task 2 – Create the array here

        /** Task 3
         *  print Great, enter each topping!
         *  Create a for loop that runs through the length of the array.
         *
         */

        /** Task 4 – Pick up the user's toppings and store them in the array.
         *
         *  See the workbook article for more detail
         *
         */

        /** Task 5 –  Loop through the length of the array and print each topping
         *
         *  See the workbook article for more detail
         *
         */

        /** Task 6 –  Confirm the order
         *
         *  See the workbook article for more detail
         *
         */
    }
}
