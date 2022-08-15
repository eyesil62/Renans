package Udemy;

public class Workbook_6_2 {
    public static void main(String[] args) {
        System.out.println("It's time to take your 5th years exams. Please, take your seats.\n");
        //Task 1: Create an array that stores 5 students: "Malfoy", "Crabbe", "Goyle", "Pansy", "Dean"

        String [] student = {"Malfoy", "Crabbe","Goyle","Panys","Dean"};
        for (int a=0; a<student.length;a++) {
            System.out.println("seat " +a + ":  "+student[a]+"\n" );
        }

        /**Task 2: Using a for loop, assign each student a seat according to their index in the array.

         for  ( ...) {
         <student at index i>, you will take seat i
         }

         */
    }
}
