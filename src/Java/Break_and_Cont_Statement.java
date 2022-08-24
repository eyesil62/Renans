package Java;

public class Break_and_Cont_Statement {
    public static void main(String[] args) {

        String ex = "HELLOAPPLE";
        String newNname="";
        // SKIP L AND A
        int i=0;
        while (i<ex.length()) {
            if(ex.charAt(i)=='L' || ex.charAt(i)=='A') {
               continue;
            }
            i++;
            newNname=newNname+ex.charAt(i);

        }
        System.out.print(newNname);
        }}