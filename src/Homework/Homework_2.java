package Homework;

public class Homework_2 {
    public static void main(String[] args) {

        /**Coding Alexa for Weather [multiple Conditions]

        New graduate Renastech students want to improve Alexa and they will add weather functionality;
        Please help students with the assignment below.
                -Ask the user what's temperature is Fahrenheit;
                -Convert the value to Celsius formula :  C = F-32 / 1.80
        if temperature is  -10 or below  ==> print it's too cold
        if temperature is between -10 and 0 ==> print  it's cold
        if temperature is between 0 and 15 ==> print it's not cold
        if temperature is between 15 and 40 ==>print it's warm
        if temperature is 40 and 60 ===> print it's extremely hot!!
        if temperature is above 60 ==> print hot as hell

        Data to test: -40 F , 5F , 50f, 82, 130F, 400F */

        double f= 400 ;
        double c =  (f-32) / 1.80 ;
        System.out.println("Celsius : " +c );

        if (c<=-10 ) {
            System.out.println("it's cold"); }
        if (c>=-10 && c<=0) {
            System.out.println("its not too cold"); }
        if (c>= 0 && c<=15){
            System.out.println("its not too cold"); }
        if (c >= 15 && c<=40) {
            System.out.println("its warm"); }
        if (c >=40 && c<=60) {
            System.out.println("its very hot"); }
        if (c>60) {
            System.out.println("it's hot as hell"); }



        }

    }
