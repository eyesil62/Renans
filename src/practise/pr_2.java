package practise;

import java.util.Scanner;

public class pr_2 {
    public static void main(String[] args) {

        // if number divisiable 3 print Ra
        // div. with 5 print Na
        // divi with both print 3 and 5 print Rana

        Scanner scn = new Scanner(System.in);
        System.out.println("-please enter a number\n");
        int num = scn.nextInt();
        for (int i = 1; i <=num; i++) {

        if(i%15==0)
            System.out.println(i+ " Rana");
        else if (i%3==0) {
            System.out.println(i+ " Ra"); }
        else if (i%10==0) {
            System.out.println(i+ " num"); }
        else if (i%5==0){
            System.out.println(i+ " Na");
        } }
    }
}
