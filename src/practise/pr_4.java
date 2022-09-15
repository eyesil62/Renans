package practise;

import java.util.Arrays;
import java.util.Locale;

public class pr_4 {
    public static void main(String[] args) {
        String name = "  gsre sfESF ES21ves  ";
//        System.out.println("name.length()-1 = " + (name.charAt(name.length()-1)));

        char [] ch = name.toCharArray();
        System.out.println(Arrays.toString(ch));
        String revr = "";
        for (int i = ch.length-1; i>=0 ; i--) {
            revr=revr+ ch[i];

        }
        System.out.println("revr = " + revr);

    }
}
