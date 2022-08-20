package branch_practise.Udemy;

public class Workbook_6_3 {
    public static void main(String[] args) {
        /* Task 1: Create an array that stores each aisle:
             apples – bananas – candy – chocolate – coffee – tea

             Then, use a for loop to print each element in the array.  */
        String[] veg = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};

        System.out.println("\nDo you sell coffee?");

        for (int a = 0; a < veg.length; a++) {
            //System.out.println("we sell : " + veg[a]);
            if (veg[a].equals("coffee")) {
                System.out.println("\n yes we sell coffee");
                break;
            }
        }



        }
    }
