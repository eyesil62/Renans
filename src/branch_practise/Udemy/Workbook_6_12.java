package branch_practise.Udemy;

import java.util.Arrays;

public class Workbook_6_12 {
    public static void main(String[] args) {
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] tict2 = Arrays.copyOf(ticket, ticket.length);
        tict2[2] = 54;

        int [] ticket4= {5,2,3,4,3,4,5,3,2,134,4,5,54,3};
        int [] ticket3= Arrays.copyOf(tict2,ticket4.length);

        System.out.println("Ticket1 numbers is : ");
        printTheticket(ticket);


        System.out.println("Ticket2 numbers is :");
        printTheticket(tict2);

        System.out.println("Ticket3 number is : ");
        printTheticket(ticket3);

        System.out.println("Ticket 4 : ");
        printTheticket(ticket4);


    }
    public static void printTheticket (int [] ticket){
        for (int a =0; a<ticket.length; a++){
            System.out.print(ticket[a]+" ");
        }
        System.out.println("\n");

    }
}
