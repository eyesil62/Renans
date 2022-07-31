package Homework;

import com.sun.org.apache.xpath.internal.objects.XNumber;

public class Homework_14 {
    public static void main(String[] args) {

        //Write a code with following requirements:
        //- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
        //- Print the minimum number in the given array

        int [] num = {6,7,2,3,90,-2,-90,-122,96,35};
        int minimum = num[3];

        for (int a=0; a<num.length;a++) {
            if (num[a] < minimum) {
                minimum = num[a];
            }
        }
        System.out.println("minimum = " + minimum);
    }
}
