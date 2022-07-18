package Java;

import java.util.Scanner;

public class example {
    public static void main(String[] args) {

        // lets create a caalculator, ask user to enter first nuymber then as to enter second number
        // select operation

        Scanner cal = new Scanner(System.in);

        System.out.println("welcome to calculator");
        System.out.println("please enter the first number");
        int firstnumber= cal.nextInt();

        System.out.println("please enter the second number");
        int secondnumber = cal.nextInt();


        System.out.println("1) select 1 for multi \n2) select 2 for division \n3) select 3 for addition \n4) select 4 for times ");
        int operation = cal.nextInt();


        switch (operation) {
            case 1:
                int result = firstnumber * secondnumber;
                System.out.println("the result is : " + result);
                break;

            case 2:
                double resul2 = firstnumber / secondnumber;
                System.out.println("the result is ;" + resul2);
                break;

            case 3:
                int result3 = firstnumber + secondnumber;
                System.out.println("print" + result3);
                break;
            case 4:
                int result4 = firstnumber - secondnumber;
                System.out.println("the result will be " + result4);

            default:
                System.out.println(operation);


        }
        }
    }

