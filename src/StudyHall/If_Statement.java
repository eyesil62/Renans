package StudyHall;

public class If_Statement {
    public static void main(String[] args) {

//        // IF , ELSE, ELSE IF
//
//        /**
//         *  if ( condition) { the block of the code to be executed of condition is true
//         */
//
//        String  weather ="Rainy";
//        // String weather = "Sunny";
//        // if the condition is true, it will print whatever is in the curly bracket with if condition
//
//        if (weather == "Sunny" ) {
//            System.out.println("eat");
//            System.out.println("go cinema");
//        } else  {
//
//        System.out.println("not going anywhere ");
//            }
//
//        int age = 24;
//        boolean money = true;
//        int maxage = 23;
//
//        System.out.println("welcome to liquor room");
//
//        if (age>=18 && money) {
//            System.out.println("he can buy Liquor");
//        }

        // Case 2       If else.
//
//        int age3 =55;
//        if (age3>22) {
//            System.out.println("you can ") ;
//         }
//        else {
//            System.out.println("you can not ");
//        }


            // first way

        int  a=15;

        if (a >=99 && a <=280) {
            System.out.println(a*0.15 + a);}
        else {
            System.out.println((+a*.20) + (+a) );
        }

            // Second way
        double bill =15;
        double tiprate = 0;
        double tip = 0;
        double finalbill = 0;

        // if the bill value is betwen 99 and 280.
        if ( bill>=99 && bill<280) {
            // usual tip is %15
            tiprate= 0.15;
            tip= bill * tiprate;
            finalbill= tip + bill;

            System.out.println("bill = " + bill);
            System.out.println("tip = " + tip);
            System.out.println("tiprate = " + tiprate);
            System.out.println("finalbill = " + finalbill);
        } else {
            tiprate=0.20;   // %20
            tip = bill * tiprate; // $60
            finalbill = bill + tip;

            System.out.println("bill = " + bill);
            System.out.println("tiprate = " + tiprate);
            System.out.println("tip = " + tip);
            System.out.println("finalbill = " + finalbill);

        }


    }
}

