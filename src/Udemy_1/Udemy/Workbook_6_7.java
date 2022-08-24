package Udemy_1.Udemy;

public class Workbook_6_7 {
    public static void main(String[] args) {

        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        int wincount = 0;
        int losscounts =0;

        for ( int a= 0;a< record.length;a++){
            if (record[a].equals("WIN")) {
                wincount+=1;
            }
            else if (record[a].equals("LOSS")) {
                losscounts+=1;
            }
        }
        System.out.println(wincount);
        System.out.println(losscounts);

        /** Task 1
         *   Using a for loop:
         *       count Java's wins and store the result in a variable: wins.
         *       count Java's losses and store the result in a variable: losses.*/

        /** Task 2
         * Print:
         *     • \nWith a professional record of <wins> Wins and <losses> losses.
         *     • He is the pride of oracle: Java Fury! */

        System.out.println("\nWith a professional record of: " +wincount + " Wins and " +losscounts + " losses. " );

    }
}
