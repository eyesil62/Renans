package branch_practise.Udemy;

import java.util.Scanner;

public class Workbook_4_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("Are you ready? Write 'yes' if you are.");

        //Task 1: See if the user wants to play
        String useranswer = scan.next();
        if (useranswer.equals("yes")) {
            System.out.println("Great");
        } else {
            System.out.println(" he doesn't want to play");
        }

        System.out.println("when i say :shoot \n choice one of the below options, \n SHOOT: ");
        System.out.println("1-rock \n2-paper \n3-scissors");

        int secondQuastion = scan.nextInt();

        switch (secondQuastion) {
            case 1:
                System.out.println("user choice : rock ");
                break;
            case 2:
                System.out.println("User Choice : paper ");
                break;
            case 3:
                System.out.println("User choice : scissors");
                break;
            default:
                System.out.println("user didnt choice right options");
                compchoice(3);
        }
        compchoice(3);
    }

    public static void compchoice(int a) {
        System.out.println(" this is where we ask computer choice");
        Scanner comp= new Scanner(System.in);

        int computer = comp.nextInt();

        if (a==1){
            System.out.println("rock");
        } else if (a==2) {
            System.out.println("paper");
        } else if (a==3){
            System.out.println("scissors"); }

        System.out.println("the computer choice : " +a);

        System.out.println(" the result is : ");





    }
}