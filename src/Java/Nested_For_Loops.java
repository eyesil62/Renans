package Java;

public class Nested_For_Loops {
    public static void main(String[] args) {

       byte second = 5;
       byte minute = 6;
       byte hour = 7;

       for (second=1; second<5; second++) {
           for (minute=1; minute<6; minute++) {
               for (hour =1; hour<7; hour++);
               System.out.println(+hour);
           }
       }

    }
}
