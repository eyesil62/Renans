package practise;

public class pr_9 {
    public static void main(String[] args) {

        String name = "sfemsoegnoser";
        String reverse="";
        int num = name.length()-1;

        while (0<=num){
            reverse+=name.charAt(num);
                    num--;

        }
        System.out.println("reverse = " + reverse);
    }
}
