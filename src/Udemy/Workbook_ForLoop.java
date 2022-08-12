package Udemy;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Workbook_ForLoop {
    public static void main(String[] args) {

        // we use for loop when we know in advance how many times for loops going to run

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        //Task 1 – Scan for the nextLine(), and print it 99 times.

        Scanner brat = new Scanner(System.in);
        String msg= brat.nextLine();

        for (int i = 0; i<99; i++) {
            System.out.println(i+1 + "  Brat's mote : " +msg);

        }
    }
}
