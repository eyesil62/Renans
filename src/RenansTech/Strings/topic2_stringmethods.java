package RenansTech.Strings;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.Locale;

public class topic2_stringmethods {
    public static void main(String[] args) {

       /* Method	              Description                                                     	Return Type
        charAt()	          Returns the character at the specified index (position)	        char
        concat()	          Appends a string to the end of another string	                    String
        contains()	          Checks whether a string contains a sequence of characters	        boolean
        endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
        equals()	          Compares two strings. Returns true if the strings are equal,
        and false if not	                                                boolean
        equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
        indexOf()	          Returns the position of the first found occurrence
        of specified characters in a string	                            int
        isEmpty()	          Checks whether a string is empty or not	                        boolean
        lastIndexOf()	      Returns the position of the last found occurrence of specified characters in a string	                                int
        length()	          Returns the length of a specified string	                        int
        replace()	          Searches a string for a specified value, and returns
        a new string where the specified values are replaced	            String
        replaceFirst()	      Replaces the first occurrence of a substring that matches the  given regular expression with the given replacement	                                String

        startsWith()	      Checks whether a string starts with specified characters	        boolean
        substring()	          Extracts the characters from a string, beginning at a specified start position,  and through the specified number of character	                    String
        toLowerCase()	      Converts a string to lower case letters	                        String
        toUpperCase()	      Converts a string to upper case letters	                        String
        trim()	              Removes whitespace from both ends of a                           String */




        // charAtt () returns the character at the specified index ( position )       Char

        String  str="Class";
        char firstL= str.charAt(4);  // first letter is "0" like C= 0 l=1 a=2 s=3 seconds=4
        //System.out.println(firstL);


        // Concat () appends a string to the end of another string    //String

        String  str1="emrah";
        String  str2="yesil";

        String str3= str1 + str2;
        String  str4= str1.concat(str2); // << this is what concat does
        String str5= str4.concat(str1);
        String str6= str5.concat(" " +str2).concat(" " +str1).concat(str1+str2);
        //System.out.println(str3);
        //System.out.println(str4);
        //System.out.println(str5);
        //System.out.println(str6);

        // Contains () checks whether a string contains a sequence of character    Boolean

        String  ayla= "yagmur";
        boolean YN=ayla.contains("g");
        //System.out.println(YN);

        // endsWith ()      checks whether a string ens with the specified character (S)    boolen

        boolean YN1= ayla.endsWith("ur");
        //System.out.println(YN1);

        // equals ()    compares two strings, returns tre if the strings are equal,
        String name7= "Sam";
        String name8= "sam";

        boolean yn3= name7.equals(name8);
        //System.out.println(yn3);

        // equalsIgnoreCase ()  compare two strings, ignoring case considerations

        boolean yn4= name7.equalsIgnoreCase(name8);
        //System.out.println(yn4);
        //System.out.println(name7 == name8);

        // indexOf () retuns the position of the first found occurrence of specified characters in a string      int

        String  name9= "emrah";
        int ind= name9.indexOf("m");
        //System.out.println(ind);

        // isEmpty ()   check whether a string is empty or not
        String emp= "Cenkay";
        //System.out.println(emp.isEmpty());

        String emp1= "";
        //System.out.println(emp1.isEmpty());

        //lastindexof () Returns the position of the last found occurrence of specified characters in a string
        String name10= "banana";
        int lst= name10.lastIndexOf("n");
        //System.out.println(name10.lastIndexOf(lst));

        //Length () returns the length of specified string                                                      int
        String a2="fspelfkjjgjjkekekkekek1111";   // counts how many characater is in there
        int count= a2.length();
        //System.out.println(count);

        //raplace ()    searches a string for a specified cale, end returns                                      String
        // a new string where specifies values are replaced
        String name12= "Gulay";
        String name13= name12.replace("lay", "n");
        //System.out.println(name13);

        String name14= name12.replace("G", "t");
        //System.out.println(name14);
        String  name15= name13.replace("G", "S");
        //System.out.println(name15);

        // Startwith    ()      checks whether a string starts with a specified characters        boolen
        String  name20= "mustafa";
        boolean start= name20.startsWith("mus");
        //System.out.println(start);

       // substring() Extracts the characters from a string, beginning at a specified start position, and through the specified number of character	                    String

       String abc= "islayagmur";

       String subabc = abc.substring(0);
       //System.out.println(subabc);



       String abc1= "islayagmur";
       String subabc1= abc1.substring(0,4);  // first number start from the beginning and the second number delete the left overs such as;
       //System.out.println(subabc1);

        // tolowercase () coverts a srtrng to a lower case ltters                                            String
       String nam = "eMRaH";
       String lownam= nam.toLowerCase();
       System.out.println(lownam);

        //touppercase ()    coversts a string to upper case letters                                        String
        String nm1= "Yesil";
       String   upnm1= nm1.toUpperCase();
       System.out.println(upnm1);

        // trim () removes whitespace from both ends of a string,                  String

        String nm2= "  Emrah   ";
        String trnm2= nm2.trim();
        System.out.println(nm2);
        System.out.println(trnm2);

    }
}
