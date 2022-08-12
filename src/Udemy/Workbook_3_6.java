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

        int day = 1;
        switch (day) {
            case 1 :
                System.out.println("Sorry, I have to stay at work late");
                break;
            case 2:
                System.out.println("It looks like I have meetings all day.");
                break;
            case 3 :
                System.out.println("I have a dentist appointment. Some other time!");
                break;
            case 4:
                System.out.println("Sorry, thursday is date night!");
                break;
            case 5:
                System.out.println("I'm free!!");
                break;
            case 6:
                System.out.println("I'm free!");
                break;
            case 7:
                System.out.println("that's not a day.");
                break;
            default:{
                System.out.println(" then something wrong"); }
        }

        // if else used %95 of the times
        // if else runs a piece of code if a condition is true
        // swtich runs a piece of code if an argument matches the case

    }
}
