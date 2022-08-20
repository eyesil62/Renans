import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ryan Slim","canada","1/1/1992", 5);
        Person person2=new Person(person);
        person2.setName("Emrah");
       person2.setSeatNumber(12);



       //System.out.println(person2.getName() +"  " +person2.getDateOfBirth()+ "  " +person.getNationality()+ "  "+person.getSeatNumber());

//        person.applyPassport();
//        person2.applyPassport();

        if (person.applyPassport()==true) {
            System.out.println("Congrats " +person.getName()+ ".Your passport was approved!" );
        } else {
            System.out.println("We are sorry " +person.getName()+ ". We can not process your application. ");
        }
        person2.chooseSeat();

        //System.out.println("Congrats " +person2.getName() + " .Your passport was approved " );



    }


}
