package practise;

public class pr_3 {
    public static void main(String[] args) {

        // reverse method

        String name = "istanbul";
        revers(name);

    }
    public static void revers(String nm) {
        String reverse ="";
        String buf= "turkey";
        for (int i = nm.length() - 1; i >= 0; i--) {
            reverse = reverse + nm.charAt(i);

        }
        System.out.println("reverse = " +reverse);

        System.out.println("\n_______________");

        StringBuffer kk = new StringBuffer(buf);
        System.out.println("kk.reverse() = " + kk.reverse());
        System.out.println("------------------\n");
        String num1 = "123456";
        char [] rvrsNum = num1.toCharArray();
        String rever ="";
        for (int i = num1.length()-1; i>=0 ; i--) {
            rever=rever+rvrsNum[i];

        }
        System.out.println("rever = " + rever);
    }

}
