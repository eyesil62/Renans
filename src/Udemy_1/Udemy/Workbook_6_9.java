package Udemy_1.Udemy;

import java.util.Arrays;

public class Workbook_6_9 {
    public static void main(String[] args) {

         // tast 1 Create a new array afterTax with the same length as price
        double [] prize = {1.99, 2.99, 3.99,4.99};
        double [] aftertax = new double[prize.length];

        for (int i = 0; i < prize.length; i++) {
            aftertax [i] = prize[i]*0.13;
            //System.out.println(aftertax[i]);
            //System.out.print("\noriginal Prize : "+prize[i] +" after tax : " +(aftertax[i]+prize[i]));
        }
        System.out.println("The original prices are: " + Arrays.toString(prize));
        System.out.println("The after tax prices are: " + Arrays.toString(aftertax));



//        //System.out.print("Here are the original prizes : ");
//        for (int a=0;a< prize.length;a++){
//            System.out.println(" Original Prize " +prize[a] + " after tax " +(+prize[a]+(prize[a]*0.13)));
//        }

    }
}
