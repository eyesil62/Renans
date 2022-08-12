package Udemy;

public class Workbook_5_7 {
        public static void main(String[] args) {

        for (int a=0; a<=18; a++) {
                if (a%3==0 && a%5==0) {
                        System.out.println(a + " Fizz Buzz"); }
                else if (a%3==0) {
                        System.out.println(a + " Fizz "); }
                else if (a % 5 ==0) {
                        System.out.println(a + " Buzz");
                }

        }
                for (int i = 0; i < 31; i++) {

                        if (i % 3 == 0 && i % 5 == 0) {
                                System.out.println(i + " FizzBuzz");
                        } else if (i % 3 == 0) {
                                System.out.println(i + " Fizz");
                        } else if (i % 5 == 0) {
                                System.out.println(i + " Buzz");
                        }
                }
} }
