package Udemy;

import java.util.Scanner;

public class Workbook_6_4{
    public static void main(String[] args) {

        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        //  Task 1: Set up Scanner, and pick up the user's response.

        Scanner str = new Scanner(System.in);
        String user = str.next();



//        for (int i = 0; i < store.length; i++) {
//            if(user.equals(store[i])){
//                System.out.println("\nWe have that in aisle :" +user);
//            } }
            for (int b = 0; b < store.length; b++) {
                if (store[b].equals(user)) {
                    System.out.println("we have that in stock :" +user);
                }

            }
          /* Task 2
                if element equals user's response  {
                    println: \nWe have that in aisle:  <index>
                    break;
                }
          */

    }
}
