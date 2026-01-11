
// Encapsulation is basically the wrapping up of data and methods into a single unit.
// In Java, encapsulation is achieved using access modifiers to restrict access to the data members 
// of a class.

// Simple analogy: Think of a capsule (like a pill) that contains medicine. The capsule protects 
// the medicine inside from external factors, ensuring that it is only accessed in the intended way. 
// Similarly, encapsulation in programming protects the data and methods of a class from unintended 
// interference and misuse. This helps in maintaining the integrity of the data and ensures that it is 
// accessed and modified only through well-defined interfaces.
// Encapsulation provides several benefits:
// 1. Data Hiding: By restricting access to the internal state of an object, encapsulation helps in 
// protecting the data from unintended modifications.
// 2. Improved Maintainability: Encapsulated code is easier to maintain and modify since the internal 
// implementation can be changed without affecting external code.
// 3. Enhanced Security: Encapsulation helps in enforcing access control, ensuring that only authorized
// users can access or modify the data.

public class OOP_13 { 
    public static void main(String[] args) {
        
        Car car = new Car("Tesla", "Model S", 2021);

        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());

        System.out.print("\n" + "Updating car year..."+ "\n\n");

        car.setYear(2022); // updating year using setter method

        System.out.println("Car Make: " + car.getMake());
        System.out.println("Car Model: " + car.getModel());
        System.out.println("Car Year: " + car.getYear());

    }
}

    class Car{

        // private variables
        private String make;
        private String model;
        private int year;

        Car(String make, String model, int year){
            this.setMake(make);
            this.setModel(model);
            this.setYear(year);
        }
        // public getter methods
        public String getMake(){
            return make;
        }

        public String getModel(){
            return model;
        }

        public int getYear(){
            return year;
        }

        public void setMake(String make){
            this.make = make;
        }

        public void setModel(String model){
            this.model = model;
        }

        public void setYear(int year){
            this.year = year;
        }

    }