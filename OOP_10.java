
// Abstract 

// In Abstract class, we can have abstract methods (without body) and concrete methods (with body).
// An abstract class cannot be instantiated directly. It is meant to be subclassed.
// In Abstract methods, the subclass must provide the implementation for the abstract methods.
// Anology: Think of an abstract class as a blueprint for a house. 
// It defines the structure and some common features, but the specific details 
// (like paint color, furniture, etc.) are left to the individual houses built from that blueprint. 

public class OOP_10 {
    public static void main(String[] args){

        // Vehicle vehicle = new Vehicle(); 

        Car car = new Car();

        car.go(); // Calls the implemented abstract method
        car.stopEngine(); // Calls the concrete method from the abstract class

    }
}

abstract class Vehicle {

    abstract void go(); // Abstract method
    
    // abstract methods do not have a body
    // many interviewers ask why abstract methods do not have a body
    // because the implementation is left to the subclasses


    void stopEngine() { // Concrete method
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {

    @Override

    void go() {
        System.out.println("Car is moving.");
    }
}

