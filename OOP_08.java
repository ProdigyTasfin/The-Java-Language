
// method overriding is a feature that allows a subclass or child class to provide a specific 
// implementation of a method that is already defined in its superclass or parent class. 
// analogy : think of it like a child customizing a recipe they learned from their parent to suit 
// their own taste. 

public class OOP_08 { 

    public static void main(String[] args){

        Dog dog = new Dog();

        dog.sound(); // Here sound is over riding
        dog.eat(); // Here inheritance works
    }
}

class Animal{

    void sound() {
        System.out.println("The animal sound is meow meow");
    }
    void eat() {
        System.out.println("Animals are eating");
    }
}

class Dog extends Animal{
    
    void sound() {
        System.out.println("The dog is barking");
    }
}