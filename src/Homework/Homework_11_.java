package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_11_ {
    public static void main(String[] args) {
        //Write   a   program   that   creates   an   array   of   10   elements   size.
//   Your   program   should   prompt   the   user   to   input   numbers
//   in   array   and   then   display   the   sum   of   all
    //    array   elements.

        Scanner arry = new Scanner(System.in);
        System.out.print("please enter 10 numbers : \n ");

       int [] num = new int [10];
       int sum =0;

       for (int a =0; a<num.length; a++){
           num[a]=arry.nextInt();
           sum+=num[a];
       }
        System.out.println(Arrays.toString(num) +" \n");
        System.out.println(" the sum of all the numbers in the array  is " +sum);
    }
}
