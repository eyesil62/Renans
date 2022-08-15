package Homework;

public class Homework_Array {
    public static void main(String[] args) {

       // Write   a   statement   that   declares   a   string   array   initialized   with   the   following   strings:
        //"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday"   and   "Saturday".
        //    Write   a   loop   that   displays   the   contents   of   each   element   in
        //    the   array   that   you   declared.

        String [] days = {"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday" ,  "Saturday"};

        int day = 0;
        while (day<days.length) {
            System.out.println(+day+1 +" : " +days[day]);
            day++;
        }
    }
}
