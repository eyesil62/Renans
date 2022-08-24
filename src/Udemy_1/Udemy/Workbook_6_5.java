package Udemy_1.Udemy;

public class Workbook_6_5 {
    public static void main(String[] args) {

        int[] num = {4, 5, 6, 2, 3, 4, 5, 6, 7, 8};
        int highScore = 0;
        // int nn= num [0];

        for (int a = 0; a < num.length; a++) {
            // System.out.print(" " +num[a]);
            if (num[a] > highScore) {
                highScore = a;

            }
        }
        randomnumber(highScore);
    }

    public static void  randomnumber(int highScore) {
        System.out.println(" the high score is : " +highScore);

    }

}