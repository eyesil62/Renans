package Udemy_1.Udemy_2;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 5500, 1890, "Green");
        Car dodge = new Car("Dodge", 12.333, 1990, "Yellow");
        Car ford = new Car(nissan);
        ford.setMake("Ford");
        ford.setColor("White");
        ford.setPrize(1555);
        ford.setYear(2005);

        nissan.drive();
        dodge.drive();
        ford.drive();



    }
}
