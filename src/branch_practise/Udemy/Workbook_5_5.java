package branch_practise.Udemy;

import java.util.Scanner;

public class Workbook_5_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("please enter where you like to start with : ");
        int start = scan.nextInt();
        System.out.println(" Please enter where you finish ");
        int end = scan.nextInt();
        System.out.println(" please enter how you like to count by : ");
        int upload = scan.nextInt();

        int a = 0;
        for (a =start; a<=end; a+=upload) {
            System.out.print(a + " ");
        }
        System.out.println("\nJimmy first number " +start + " finish number "+end + " counts by " +upload);

    }
}
