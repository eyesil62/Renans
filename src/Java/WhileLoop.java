package Java;

public class WhileLoop {
    public static void main(String[] args) {

                    // the concept of While Loop
            // We define the starting point before the "While"
            // You have the end point in the while (endpoint)
            // you have the iteration inside the curly brackets
        /*
         * Which is better for loop or while loop?
         * Use a for loop when you know the loop should execute n times.
         * Use a while loop for reading a file into a variable.
         * Use a while loop when asking for user input.
         * Use a while loop when the increment value is nonstandard.
         */



        // Step by Step
        //  int i = 0
        // While ( condition i < 10) we open curly bracket and lets say increase or decrease i-- { i++ or i-- }


      // for ( int i = 0; i<10; i++) {
     //  System.out.print("  " +i);}

       // System.out.println("\n"+"--------------");

//        int i = 0;
//        while (i<10) {
//            // ++i   - if the code entered here then instead of 0 it will start from 1 and goes to 10
//            System.out.print("  " +i);
//            ++i;   // or i++  --it's important to know when to increase

            int j = 0;
            while  (j<10) {
                if (j==8) {

                    continue;
                }
                System.out.println("the even numbers : " +j);
                j+=2;

                }

            int k = 0;
            while(k<=10) {
            System.out.println("k = " + k);
            if(k==9) {
                break;
            }

            k++;

        }
            }
        }

