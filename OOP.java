public class OOP {

    public static void main(String[] args) {

        Car myCar = new Car();

        System.out.println("The car's model is: " + myCar.model);
        System.out.println("The car's color is: " + myCar.color);
        System.out.println("The car's price is: " + myCar.price);
        System.out.println("The car's year is: " + myCar.year);
        
        System.out.println(); 

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
        System.out.println(" The car is now in AUTO-PILOT MODE! ");
    }

    void drive() {
        System.out.println(" The car is now driving! "); 
    }
}
