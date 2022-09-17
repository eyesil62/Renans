package practise;

import java.sql.Array;
import java.util.Arrays;

public class pr_12 {
    public static void main(String[] args) {


        // combine arrays
        int k = 0;
        int[] a = {23, 5, 2, 3, 32, 2, 5}; // 7   size = 17
        int[] b = {3, 5, 62, 3, 4, 5, 6, 7, 2,13};// 8 total

        int size = a.length+b.length;
        int[] c = new int[size];

        for (int i = 0; i < a.length; i++) {
            c[i]=a[i];
        }
                        // i = 7   = i< 10
        for (int i = a.length; i < size; i++) {
            c[i]=b[k];
            k++;

        }
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));


    }
}