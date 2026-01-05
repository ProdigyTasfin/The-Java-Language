public class OOP {

    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.price);

        // myCar.drive();
        myCar.auto_pilot();
    }
}

class Car {

    String model = "Tesla";
    String color = "Blue";
    double price = 50000;
    int year = 2026;

    void auto_pilot() {
        System.out.println("Turn on! The AUTO-PILOT MODE!");
    }

    void drive() {
        System.out.println("\nTurn off! The AUTO-PILOT MODE! You can drive it!");
    }
}
