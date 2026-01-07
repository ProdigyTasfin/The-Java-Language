// Object passing

public class OOP_05 {
    public static void main(String[] args) {
        Garage myGarage = new Garage();
        
        Car car1 = new Car("Toyota", "Corolla", 2020);
        Car car2 = new Car("Honda", "Civic", 2019);
        Car car3 = new Car("Ford", "Mustang", 2021);

        myGarage.parkCar(car1);
        myGarage.parkCar(car2);
        myGarage.parkCar(car3);

    }
}

class Garage {
    void parkCar(Car car) {
        System.out.println("Parking car: " + car.make + " " + car.model + " " + car.year);
    }
}

class Car {
    String make;
    String model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}
