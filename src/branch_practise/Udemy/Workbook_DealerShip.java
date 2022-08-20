package branch_practise.Udemy;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.nimbus.AbstractRegionPainter;
import java.util.Scanner;

public class Workbook_DealerShip {
    public static void main(String[] args) {

        // Scanner waits for user to enter a value in to terminal
        // scan. nextline ()

        Scanner scan = new Scanner(System.in);
        System.out.println(" Welcome to the dealership");
        System.out.println(" . select option 'a' to buy a car");
        System.out.println(" . select option 'b' to buy a car");

        String scn= scan.nextLine();

        switch (scn) {
            case "a" :
                System.out.println("you choice " +scn);
            break;
            case "b" :
                System.out.println(" you choice " +scn);
                break;
            default:
                System.out.println(" we dont have anything beside 'b' or 'a' ");
        }

        System.out.println( "enter two integer number ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println( "double number ");
        double db1 = scan.nextDouble();
        double db2 = scan.nextDouble();

        System.out.println( "enter two float number ");
        float fnum= scan.nextFloat();
        float fnum2 = scan.nextFloat();

        System.out.println( "enter two String value ");
        scan.nextLine();   // >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>we have to throw another scan to not to ingore the latest code.
        String str = scan.nextLine();
        String str1 = scan.nextLine();
        System.out.println("first integer number \n " +num1 + "" +num2);
        System.out.println("first double number \n " +db1 + "         "+db2);
        System.out.println("first float number \n " +fnum + "     \n     "  +fnum2);
        System.out.println("first string text : " +str + "   "  +str1 + ""  );




    }
}

