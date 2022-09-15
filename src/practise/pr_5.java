package practise;

import java.util.Arrays;

public class pr_5 {
    public static void main(String[] args) {

        int factorialnumber=1;
        int square=1;
        for (int i = 1; i <=6; i++) {
            factorialnumber*=i;
        }
        System.out.println(factorialnumber);


        String name = "grsgsoej1sofjdsfodlgorsjgorijoesfmosmomeg";
        String newName="";
        int count=0;
        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i)=='g'){
                name.replace('g','4');
            if(name.charAt(i)=='f'){
                name.replace('f','5');}}

            newName+=name.charAt(i);


        }
        System.out.println("the new name is: " +newName);


    }}