package Udemy_1.Udemy;

public class Workbook_5_6 {
    public static void main(String[] args) {
        // Task 1 – Make a for loop that counts from 0 to 19.

        /* Task 2

            1. If the number is even, print ' – even' beside the number.
            2. If the number is odd, print ' – odd' beside the number.

         */
        int a = 0;
        for ( a=0; a<19; a++) {
            if (a % 2 == 0) {
                System.out.println(a + " - even");
            } else {
                System.out.println(a + " - odd");
            }
        }
        }
}
