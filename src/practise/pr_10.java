package practise;

import java.util.Random;
import java.util.Scanner;

public class pr_10 {
    public static void main(String[] args) {

            int randomnumber,userinput;

            do {Random random = new Random();
                randomnumber=random.nextInt(10)+1;
                Scanner scn = new Scanner(System.in);
                System.out.println("please enter a number between 1 - 10");
                userinput = scn.nextInt();
                System.out.println("randomnumber = " + randomnumber);
            }  while (userinput != randomnumber);
        System.out.println("the numbers matched. congrats! ");


    }
}
