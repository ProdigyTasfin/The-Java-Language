
// polymorphism = greek word for poly - many, morph - form
//              the ability of an object to identify as more than one type

public class OOP_16{
    public static void main(String[] args){

        Car car = new Car();
        Bicycle bicycle = new Bicycle(); 
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat}; 

        // Method: 1
        car.go();
        bicycle.go();
        boat.go();

        System.out.println("\n\n");
        // Method: 2
        for (Vehicle x :racers){
            x.go();
        }

    }
}

class Vehicle { 

    public void go(){

    }

}

class Car extends Vehicle {

    @Override

    public void go() {
        System.out.println("The car begins moving");
    }
}

class Bicycle extends Vehicle {

     @Override

     public void go() {
        System.out.println("The bicycle begins moving");
    }
}

class Boat extends Vehicle {

     @Override

     public void go() {
        System.out.println("The boat begins moving");
    }
}