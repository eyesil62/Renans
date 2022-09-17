package practise;

import org.omg.CORBA.ARG_IN;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Spliterator;

public class pr_15 {
    public static void main(String[] args) {

        String name = "the sky is blue";

        String [] str = name.split(" ");
       // System.out.println("Arrays.toString(str) = " + Arrays.toString(str));

        ArrayList<String> rev = new ArrayList<String>(Arrays.asList(str));

        for (int i = rev.size()-1; i>=0 ; i--) {

            str[i]= rev.get(i);

        }
        //System.out.println("rev = " + rev);


        String reverse ="";

        for (int i = str.length-1; i >=0 ; i--) {

            if (i!=0) {
                reverse+=str[i]+" "; }
            else {
                reverse+=str[i];
            }

        }

       System.out.println("reverse = " + reverse);


    }}