package RenansTech.Strings;

public class IfelseIfelse {
    public static void main(String[] args) {

//        int o = 10;
//
//        if (o > 11) {
//            System.out.println("that is wrong");
//        } else if (o < 0) {
//            System.out.println("that is wrong");
//        } else if (o > 9) {
//            System.out.println("that is wrong as well");
//        } else {
//            System.out.println("the correct answer");
//        }
//    }
//    }

                // 100 - 90 will result A grade
                //  89-80  will result B grade
                // 79 - 70 will result C grade
                // 69 - 60 will result D grade
                // 59 - 0 will result F grade

//                    int Point = 95;
//                    if(Point>100){
//                        System.out.println("Point is invalid");
//                    }
//                    else if(Point>=80){
//                        System.out.println("The Grade is A");
//                    }
//                    else if(Point>=90){
//                        System.out.println("The Grade is B");
//                    }
//                    else if(Point>=70){
//                        System.out.println("The Grade is C");
//
//                    }
//                    else if (Point>=60 ){
//                        System.out.println("The Grade is D");
//                    }
//                    else{
//                        System.out.println("The Grade is F");
//                    }

                    // Water Temp is 100 it is boiling
                    // Water Temp is 0 it is freezing
                    // Watter temp is 0<temp<10 So Cold
                    // Water temp between 10-30 will cold
                    // Water tem 60-90 Hot
                    // Water Temp 90<temp<100 So Hot,

                    String WaterCond;
                    int temp = 25;

                    // Water Temp is 100 it is boiling
                    if(temp == 100){

                        WaterCond = "Boiling";
                        //System.out.println("The Water condition is: "+WaterCond);
                    }
                    else if(temp == 0){ // Water Temp is 0 it is freezing
                        WaterCond = "Freezing";
                        // System.out.println("The Water condition is: "+WaterCond);
                    }
                    else if(temp>0 && temp<10){ // Watter temp is 0<temp<10 So Cold
                        WaterCond = "So Cold";
                        //System.out.println("The Water condition is: "+WaterCond);
                    }
                    else if (temp>=10 && temp<30){ // Water temp between 10-30 will cold

                        WaterCond = "Cold";
                        //System.out.println("The Water condition is: "+WaterCond);

                    }
                    else if(temp>=60 && temp<90){ // Water tem 60-90 Hot

                        WaterCond = "Hot";
                        //System.out.println("The Water condition is: "+WaterCond);

                    }

                    else if(temp>=90 && temp<100){

                        WaterCond = "So Hot";

                        // System.out.println("The Water condition is: "+WaterCond);

                    }
                    else { // rest Room Temp
                        WaterCond = "Room Temp";
                        //System.out.println("The Water condition is: "+WaterCond);
                    }

                    System.out.println("The Water condition is: "+WaterCond);
                }
}
