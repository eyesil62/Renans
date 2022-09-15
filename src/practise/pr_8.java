package practise;

public class pr_8 {
    public static void main(String[] args) {

        int num = 807;
        int reverseNum = 0;

        while (num!=0) {

            int lastDigit = num % 10; // 7 , 8

            reverseNum = reverseNum *10 + lastDigit; // 7 , 78

            num=num/10;  // 8, 0.8

        }

        System.out.println(reverseNum);
    }
}
