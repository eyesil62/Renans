package Java;

import java.util.Arrays;

public class Comments {
    public static void main(String[] args) {


        int [] int1 = {4,6,7,45,63,36,3,235,56,7};

        int [] reverseInt = new int[int1.length];
        int [] int2 = int1;
        System.out.println(Arrays.toString(int2));
        int2[0]=55;
        System.out.println(Arrays.toString(int2));
        System.out.println(Arrays.toString(int1));
        int c=0;

        for (int i = int1.length-1; i >=0; i--) {
           reverseInt[c]=int1[i];
       c++;
        }

        System.out.println(Arrays.toString(reverseInt));


    }
}