package Udemy;

public class Workbook_6_5_answer {
    public static void main(String[] args) {

        System.out.print("Here are the scores: \n ");
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};


        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }

        int highScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }
        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

    }

    public static int randomNumber() {
        double randomDouble = Math.random() *500;
        int randomInt = (int) randomDouble;
        System.out.print(" " +randomInt);
        return randomInt;
    }
}