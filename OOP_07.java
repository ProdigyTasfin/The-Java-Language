// Inheritance 
// A mechanism where a new class inherits properties and behavior (methods) from an existing class.

public class OOP_07 {
    public static void main(String[] args) {
        
        Car car = new Car();
        car.go();

        Bicycle bike = new Bicycle();
        bike.stop();

        System.out.println(car.doors);
        System.out.println(bike.gears);
    }
}

class Vehicle {
    
    double speed;

    void go() {
        System.out.println("The vehicle is moving.");
    }

    void stop() {
        System.out.println("The vehicle has stopped.");
    }
}

class Car extends Vehicle {
    int doors = 4;
}

class Bicycle extends Vehicle {
    int gears = 18;
}

