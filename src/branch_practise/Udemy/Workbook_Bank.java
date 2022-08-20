package branch_practise.Udemy;

import java.util.Scanner;

public class Workbook_Bank {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("\n****ROYAL BANK OF JAVA****");
        System.out.println("Are you here to get a mortgage? (yes or no)");
        String scn = scan.nextLine();

        switch (scn) {
            case "yes" : {
                System.out.println(" he is ready to start a morgage ");
            } break;
            case "No" : {
                System.out.println(" he is not ready yet ");
                break;
            }
            default:
                System.out.println(" he is still thinking");
        }



        System.out.println("\nGreat! In one line" +
                "\nHow much money do you have in your savings?" +
                "\nAnd, how much do you owe in credit card debt?");

        double moneyinAccount = scan.nextDouble();
        float owe = scan.nextFloat();

        System.out.println("\nHow many years have you worked for?");
        // Task 4 - Pick up number of years
        int years = scan.nextInt();
        System.out.println("What is your name?");
        // Task 5 - Pick up the user's name
        String str = scan.nextLine();

        //Task 6 - Approve the mortgage if they meet the requirements (see article)
        //       - Otherwise, don't give them a mortgage.
        System.out.println("Congratulations <name> You have been approved!");
        System.out.println("Sorry, you are not eligible for a mortgage.");

        //Task 2 - Print this if the decision was not "yes"
        System.out.println("\nOK. Have a nice day!");
    }
}
