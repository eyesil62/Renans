package Java;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {


        int [] intt = {1,4,5,6,6,2,};
        String [] str = {"grd", "t4et4", ""};
        int [][][] multi = {{{1,4,5},{4,3,2,5}},{{5,6,7},{25,6,6,}}};
        int a= multi [1][0][2];
        int b= multi [0][0][2];

        System.out.println(a-b);

        System.out.println(str[1]+(a));

    }
}
