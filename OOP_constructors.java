public class OOP_constructors {

    public static void main(String[] args) {

        Human Human1 = new Human("John", 70.5, 25); //passing arguments to the constructor
        Human Human2 = new Human("Alice", 60.0, 30);

        System.out.println("The human's name is: " + Human1.name);
        System.out.println("The human's weight is: " + Human1.weight);
        System.out.println("The human's age is: " + Human1.age);
        
        System.out.println(); 

        Human1.eat();
        Human2.drink();
    }
}

class Human {

    String name; //attributes
    double weight;
    int age;

    // Constructor
    public Human(String name, double weight, int age) { //constructor with parameters
        this.name = name; //this refers to the current object's attribute
        this.weight = weight;
        this.age = age;
    }

    void eat() {
        System.out.println(this.name + " is eating.");
    }

    void drink() {
        System.out.println(this.name + " is drinking.");
    }
}