package practise;

public class pr_6 {
    public static void main(String[] args) {

        // write a method to see if string palindrome

        String pal = "kayakKAYAK";
        String reverse = "";
        for (int i = pal.length() - 1; i >= 0; i--) {
            reverse += pal.charAt(i);

        }
        System.out.println("reverse = " + reverse);
        if (reverse.equalsIgnoreCase(pal)) {
            System.out.println("palindrome");
        } else {
            System.out.println("its not");
        }

        System.out.println("-----------\n");

        StringBuffer rvr = new StringBuffer(pal);
        String newReverse = String.valueOf(rvr.reverse());
        System.out.println(newReverse.equalsIgnoreCase(pal));
    }
}