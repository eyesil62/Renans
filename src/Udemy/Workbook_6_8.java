package Udemy;

public class Workbook_6_8 {
    public static void main(String[] args) {

        /**Task 1: Create two arrays (see Workbook article)

        System.out.println("Here's your receipt:\n");
        /* Task 2
            Use a for loop to print each apple and the corresponding price.

            for {
                println(\t<apple i >: $<price i >)
            }
        */
        String [] jimmApple = {"Gala", "Granny Smith","Macintosh"};
        double[] prize= { 1.99, 1.49, 1.29 };
        for ( int a =0; a<jimmApple.length;a++) {
            System.out.println(jimmApple[a]+ " : " +prize[a]);
        }

    }
}
