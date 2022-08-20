import java.util.Random;

public class Person {
    //Person prs = new Person;
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
    }

    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = source.passport;

    }


    // Getters


    public String getName() {
        return this.name;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public String getNationality() {
        return this.nationality;
    }

    public String[] getPassport() {
        return this.passport;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

// setters


    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean applyPassport() {
        int num = (int) Math.random()*3;
        if (num==0) {
            return false; }
         else {
             return true;}


    }

    public void chooseSeat() {
//        double randomNumber = Math.random()*11;
//        seatNumber = (int)randomNumber+1;

       this.seatNumber=(int)(Math.random()*11+1); // range of 1 to 11

    }
}