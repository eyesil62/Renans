package Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_10 {
    public static void main(String[] args) {

        //Write   a   Java   program   to   reverse   the   element   of   an   integer    array.


        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int[] reverse = new int[num.length];

        for (int i = num.length-1; i >= 0; i--) {
            reverse[i]= num[i];
            System.out.print(reverse[i]);
            System.out.print(" ");


}
        System.out.println();
        System.out.println(Arrays.toString(reverse));

    }}
