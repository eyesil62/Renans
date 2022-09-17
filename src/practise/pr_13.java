package practise;

public class pr_13 {
    public static void main(String[] args) {

        int [] num = {6,34,4,45,6,2,445,4,5,6,77,88,44,-2};
        int min= num[0];
        int max = num[0];

        for (int i = 0; i < num.length; i++) {
            if(num[i]>max){
                max= num[i]; }
                if(min>num[i]){
                    min=num[i];

            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
