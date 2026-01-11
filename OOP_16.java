
// polymorphism = greek word for poly - many, morph - form
//              the ability of an object to identify as more than one type

public class OOP_16{
    public static void main(String[] args){

        Car car = new Car();
        Bicycle bicycle = new Bicycle(); 
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat}; 

        car.go();
        bicycle.go();
        boat.go();

    }
}

class Vehicle { 



}

class Car extends Vehicle {

    public void go() {
        System.out.println("The car brgins moving");
    }
}

class Bicycle extends Vehicle {
     public void go() {
        System.out.println("The bicycle brgins moving");
    }
}

class Boat extends Vehicle {

     public void go() {
        System.out.println("The boat brgins moving");
    }
}