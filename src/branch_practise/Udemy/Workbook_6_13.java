package branch_practise.Udemy;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Workbook_6_13 {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
        double [] [] book = {{12.99,8.99,9.99,10.49,11.99,22,33},{0.99,1.99,2.99,1.49,2.99},{8.99,7.99,9.49,9.99,10.99}};
//        double baking [] = Arrays.copyOf(book [0],book [0].length);
//        double [] beverage = Arrays.copyOf(book [1],book [1].length );
//        double[] cereal = Arrays.copyOf(book [2],book[2].length);
//        double [][] newbook = Arrays.copyOf(book,book.length);

//       System.out.println("Baking : " +Arrays.toString(baking));
//        System.out.println("Beverage  : " +Arrays.toString(beverage));
//       System.out.println("Cereal : " +Arrays.toString(cereal));
//        System.out.println(Arrays.toString(newbook));
//
//        System.out.println("\n");
//        for (int i = 0; i < baking.length; i++) {
//            System.out.print("Baking : " + baking[i]);
   //     }

        for (int i = 0; i < book.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Baking: ");
                   break;
               case 1:
                   System.out.print("\nBeverage: ");
                   break;
              case 2:
                  System.out.print("\nCereals: ");
                    break;
            }
            for (int j = 0; j < book[i].length; j++) {
                System.out.print(book[i][j] + " ");
            }
            System.out.print("\n");


        }
    }
}
