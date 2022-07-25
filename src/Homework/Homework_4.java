package Homework;

public class Homework_4 {
    public static void main(String[] args) {
        //Telephone Bill
//Write a program to calculate the monthly telephone bills as per the following rule:
//Minimum Rs. 200 for up to 100 calls.
//Plus Rs. 0.60 per call for the next 50 calls.
//Plus Rs. 0.50 per call for the next 50 calls.
//Plus Rs. 0.40 per call for any call beyond 200 calls.


        int monthlyCalls = 160;
        // 100 - 150 Calls
        double bill1 = (((monthlyCalls-100) * 0.60) + 200);
        //150-200 calls
        double bill2 = (((monthlyCalls-100) * 0.50 ) + 200);
        // 200+ calls
        double bill3 = (((monthlyCalls-200) *0.40)+ 200);


        if ( monthlyCalls<100 ){
            System.out.println("below 100 calls the bill is $200 no matter what");}
        if (monthlyCalls>100 && monthlyCalls<150) {
           System.out.println("the bill will be " +bill1 ); }
        if ( monthlyCalls>150 && monthlyCalls<200) {
            System.out.println(" each call will add another $0.5  : " +bill2);}
        if (monthlyCalls>200) {
            System.out.println("for every call the user will pay additional 40 cent : " +bill3 );  }


 }

    }
