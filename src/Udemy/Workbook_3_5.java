package Udemy;

public class Workbook_3_5 {
    // if it's a holiday, print: "woohoo, no work!");
    // if it's the weekend, print: "it's the weekend, no work!"
    // otherwise, print: "Wake up at 7:00 :( ";
    public static void main(String[] args) {



        int day = 4;
        boolean holiday = true;
        boolean evening = true;
        boolean weekday = true;
        if (weekday) {
            System.out.println("woohoo, no work!");
                if (evening) {
                    System.out.println(" weekday and evening");
            }
        } else if (day == 6 || day == 7)  {
            System.out.println("it's the weekend, no work!");
        }
        else if (evening) {
            System.out.println(" stay home in the evening");}
        else {
            System.out.println("Wake up at 7:00 :("); }
    }

}
