//toString = special method that all objects inherit,
// that returns a string that textually represents an objecct.
// can be used both implicitly and explicitly. 

public class OOP_03 {
    public static void main(String[] args){
        
        Car car = new Car();

        // System.out.println(car.make);
        // System.out.println(car.model);
        // System.out.println(car.color);
        // System.out.println(car.year);

        System.out.println(car.toString());
         
    }

}

class Car {
    String model = "Mustang";
    String make = "Ford";
    int year = 2024;
    String color = "Yellow";

    public String toString(){
        // 1st method: 

        // String myString = "Make: " + make + "\n"+ "Model: " + model + "\n" + "Color: "+ color + "\n" + "Year: "+ year;
        // return myString;

        // 2nd method: 

        return "Make: " + make + "\n"+ "Model: " + model + "\n" + "Color: "+ color + "\n" + "Year: "+ year;
    }


}