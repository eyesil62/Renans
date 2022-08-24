package Udemy_1.Udemy;

public class Workbook_Functions {
    public static void main(String[] args) {

        song();
        number(4,6);
        song();
        number(55,9);
    }

    public static void song() {
        System.out.println("Hello Everyone");
        System.out.println("Hello Everyone");
        System.out.println("Hello Everyone");
        System.out.println("Hello Everyone");
    }

    public static int number(int a, int b) {
        int c = a + b;
        int d= a *5;
        System.out.println(d);
        System.out.println("c = " + c);
        System.out.println("a = " + a);
        return c;
    }
}