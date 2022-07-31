package Homework;

public class Homework_15 {
    public static void main(String[] args) {

        /** write a code with following requirements
        - define an array with following values {90,34,23,87,45,36,98}
        - Print the values that can be divided by 2 or 3 */

        int [] ary = {90,34,23,87,45,36,98};

        for ( int k=0; k<ary.length; k++) {

                if (ary [k]%3==0 || ary [k]%2==0) {
                    System.out.println(" these numbers in array can be both 2 and 3 : " +ary[k]);
                }

            }

    }

}
