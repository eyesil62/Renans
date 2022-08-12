package Udemy;

public class Workbook_4_2 {
    public static void main(String[] args) {
        double bill = 53.50;
        System.out.println("Waiter: I hope you enjoyed your meal!");
        System.out.println("Thank you!");
        System.out.println("Thank you");
        tipTheWaiter(bill);




    }

    public static void tipTheWaiter (double bill ){

        double tip = bill*0.15;
        double totalbill = bill + tip;

        System.out.println("your service was awesome, please accept this tip : " +tip );



}
}
