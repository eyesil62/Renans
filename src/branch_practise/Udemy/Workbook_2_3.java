package branch_practise.Udemy;

public class Workbook_2_3 {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;

        System.out.println("You picked 500 apples from an apple orchard");
        numOfApples+=500;

        System.out.println("Time for business! You're selling each apple for 40 cents");
        float prize = 0.40f;

        System.out.println("One customer walked in. He bought 4 apples!");
        numOfApples-=4;
        numOfCustomers++;
        profit += (4*prize);

        //Update number of apples.
        //Update number of customers;
        //Update profit

        System.out.println("Another customer walked in. He bought 20 apples!");
        numOfApples-=20;
        numOfCustomers+=1;
        profit +=20*prize;
        //Update number of apples;
        //Update number of customers;
        //Update profit

        System.out.println("Another customer walked in. She bought 200 apples!");
        numOfApples-=200;
        numOfCustomers+=1;
        profit=200*prize+ profit;
        //Update number of apples;
        //Update number of customers;
        //Update profit

        System.out.println("Wow! So far, you made: " +profit);
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " +numOfApples + " apples left. We'll sell more tomorrow!");


    }
}