package practise;

public class pr_14 {
    public static void main(String[] args) {

        String [] name = {"java", "JAva", "JAvA", "fsfe","JAVA"};

        int javaCounts=0;

        for (int i = 0; i < name.length; i++) {
            if(name[i].equalsIgnoreCase("java")){
                javaCounts++;
            }

        }
        System.out.println("javaCounts = " + javaCounts);
    }
}
