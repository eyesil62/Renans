package RenansTech.Strings;

public class Nested_ifstatement {
    public static void main(String[] args) {

        // create a condition to check of person is eligible to vote
        // conditions for person to be eligible
            // person has to be a citizen
            // person has to be older ten 18 yrs.
            // the person must have 2 condition to be able to vote
        int personAged= 25;
        boolean ahmetCitizen= false;
        if (personAged>18) {// main condition starts here{ System.out.println("ahmet is older then 18 yrs.");
        if (ahmetCitizen == true) { System.out.println("ahmet can vote");}
        else { System.out.println(" person is not eligible to vote because he is a citizen"); } }  // main condition ends here and new "Else" condition starts
        else { System.out.println("person is under 18 yrs old. ");}
        //test 1  = age bigger than 18 yrs. and he is citizen   ( result: he is older than 18 and can vote )
        // test 2 = age older than 18 yrs. but he is not a citizen          (result2 : ahmet older than 18 yrs, person is not ele  )

            // New Example;


    }
    }