package Udemy;

public class Workbook_3_6 {
    public static void main(String[] args) {

        //Check calendar here:

        //  "Monday": print ("Sorry, I have to stay at work late.");
        //  "Tuesday": print ("It looks like I have meetings all day.");
        //  "Wednesday": print ("I have a dentist appointment. Some other time!");
        //  "Thursday": print ("Sorry, thursday is date night!");
        //  "Friday": print ("I'm free!!");
        //  "Saturday": print ("I'm free!!");
        //  "Sunday": print ("I'm free!!");
        //  "otherwise": print ("that's not a day.");
        int monday =1;
        int tuesday = 2;
        int wednesday = 3;
        int thursday = 4;

        int userinput = 2;
        if (userinput==1) {
            System.out.println(" Sorry, I have to stay at work late.");
        } else if (userinput==2) {
            System.out.println("It looks like I have meetings all day.");
        } else if ( userinput==3) {
            System.out.println("I have a dentist appointment. Some other time!");
        } else if (userinput==4) {
            System.out.println("Sorry, thursday is date night! ");
        }

        System.out.println( "according to user, tomorrow is " +(userinput+1) );


    }
}
