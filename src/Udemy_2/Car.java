package Udemy_2;

public class Car {
    private String make;
    private double prize;
    private int year;
    private String color;

    public Car(String make, double prize, int year, String color) {
        this.make = make;
        this.prize = prize;
        this.year = year;
        this.color = color;
    }

    public Car(Car source) {
        this.make = source.make;
        this.year = source.year;
        this.prize = source.prize;
        this.color = source.color;


    }

    /**
     * Getters
     */


    public String getMake() {
        return this.make;
    }

    public double getPrize() {
        return this.prize;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {
        return this.color;
    }


    /**
     * Setters
     */

    public void setColor(String color) {
        this.color = color;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void drive() {
        System.out.println("You bought the beatiful " + this.color+ " " +this.year + " " +this.make+ " " +this.prize+ ".");
        System.out.println("Please drive to the nearest exit");

    }
}