package Homework;

public class Class_answers {
    public static void main(String[] args) {

//task   1:   create   a   java   program
        // that   will   check   if   number   is   divisible   by   2   and   5   same   time


            int Divisible = 51;
            if (Divisible % 2 == 0 && Divisible % 5 == 0) {
                System.out.println(Divisible + " can be divided 2 and 5 at the same time");
            } else {
                System.out.println(+Divisible + " cannot be divided 2 and 5 at the same time");

            }
        }
    }