package Udemy_1.Udemy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Workbook_5_9 {
    public static void main(String[] args) {

        String username = "Samantha";
        String password = "Java <3";

        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("• Username: ");
        String usernameEntry = scan.nextLine();
        System.out.print("• Password: ");
        String passwordEntry = scan.nextLine();

        while (!usernameEntry.equals(username) || !passwordEntry.equals(password)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("• Username: ");
            usernameEntry = scan.nextLine();
            System.out.print("• Password: ");
            passwordEntry = scan.nextLine();
        }

        System.out.println("\nSign in successful. Welcome!");
    }
}