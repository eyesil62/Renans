package practise;

public class pr_7 {
    // remove dublicate

    public static void main(String[] args) {


        String name = "AABBCCCCDDEEEK";
        String expected ="";
        String newDbu ="";

        for (int i = 0; i < name.length(); i++) {


            if (!(expected.contains("" + name.charAt(i)))) {
                expected += "" + name.charAt(i);
            }
            else  {
                newDbu+=name.charAt(i);

            }
        }


            System.out.println("expected = " + expected);
        System.out.println("newDbu = " + newDbu);

    }
}