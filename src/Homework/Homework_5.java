package Homework;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Locale;

public class Homework_5 {
    public static void main(String[] args) {


        String par1 = "hello my name is emrah";
        String par2= "I am 29 years old, I live in buffalo";
        String par3= " I started as Manual TESter and Now I am doING Automation Testing";
        String par4= "I have experience in EducatION, energy,finance and some manY Other AREAs";
        String par5= "I HAve scrum master and Oracle java Programmer certificates.   i love JaVA";
        String par6="I designed and DEVELoped many automation test cases using BDD FRamework.";

        String low = par1+par2+par3+par4+par5+par6.toLowerCase();
        String p1 = par1.replace("h","H").replace("e","E");
        String p2 = par2.replace("b", "B");
        System.out.println(low);
        System.out.println(p1);


    }
    }
