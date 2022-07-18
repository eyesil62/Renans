package Java;

import javax.crypto.spec.PSource;

public class Ternary {
    public static void main(String[] args) {

        // Ternary means Shortcut of ""if else""
        // : means else
        // ? means if
            //   condition ? == if block
            // : condition ? == else if block
            // :             == else block

        // task 1  ( max number )
        // print max number between 2 numbers

        // task 2 credit score
        // 0-300 poor
        // 301 - 60 good
        // 601 - 800 very good

        // TASK NUMBER 1

        //int number1= 25, number2=35, max1, max2;   < another way to do it

        int number1= 25,    number2=35;
        int max;
        int max2;

        if (number1>number2) {
            max=number1;
        }else {
            max=number2; }

        System.out.println(max);            //  if else or ? and : for shortcut.
        max2=(number1>number2) ? number1:number2;

        System.out.println("first formula= " +max);
        System.out.println("second formula  /maximum number/  = " +max2);

        // TASK NUMBER 2
        // task 2 credit score
        // 0-300 poor
        // 301 - 600 good
        // 601 - 800 very good

        int score= 550;
        String  result;
        String result2;
        String result3;

        if (score>0 && score<300) {
        result= "poor"; }

        else if (score>301 && score<600) {
        result="good"; }

        else if (score>601 && score<800) {
            result= "very good"; }
        else {
            result= "invalid score"; }

        System.out.println(result);

        result2= (score>0 && score<300) ? "condtion 1" : (score>301 && score<600) ? "condition2" :  (score>601 && score<800) ? "condition3" : "invalid score";

        System.out.println(result2);

        // Example

}
}