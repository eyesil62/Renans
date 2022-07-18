package RenansTech.Strings;

public class Switch_Statement {
    public static void main(String[] args) {
        // the way it works is similar to the if statements
        // if we have many condition to check the switch number that match with case then it will be printed

        int number = 9;
        String day;

        switch (number) {
            case 1:
                day    = "monday";
                break;
            case 2:
                day = "tuesday";
                //break;
            case 3:
                day = "wed";
                break;
            case 4:
                day = "thu";
                break;
            case 5:
                day = "fri";
                break;
            case 6:
                day = "satr";
                break;
            case 7:
                day = "sun";
                break;

        default:
        day = "this not listed";

    }
        System.out.println(day);
    }
}
