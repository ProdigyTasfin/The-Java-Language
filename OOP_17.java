import java.util.Scanner;

// Dynamic Polymorphism 
public class OOP_17 { 

    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What animal you want to choose? Dog / Cat");
        String choice = input.next();
        choice = choice.toUpperCase();

        if (choice  == "DOG") {
            animal = new Dog();
        }

        else if (choice == "CAT") {
            animal = new Cat();
        }

        else animal = new Animal();

        Animal animal;

    }

}

class Animal {

    public void speak() {

        System.out.println("Animal is sounding real :xD");
    }

}

class Dog extends Animal {

    @Override

    public void speak() {
        System.out.println("Cat is mewoing");
    }

}

class Cat extends Animal {

    @Override

    public void speak() {

        System.out.println("Dog is barking");

    }
}
