import java.util.Scanner;

// Dynamic Polymorphism 
public class OOP_17 { 

    
    
    public static void main(String[] args) {
        
        Animal animal;
        Scanner input = new Scanner(System.in);
        
        System.out.println("What animal you want to choose? Dog / Cat");
        String choice = input.next();
        choice = choice.toUpperCase();

        if (choice.equals("DOG")) {
            animal = new Dog();
        }

        else if (choice.equals("CAT")) {
            animal = new Cat();
        }

        else { animal = new Animal();
        }
        
        animal.speak();


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
        System.out.println("Dog is barking");
    }

}

class Cat extends Animal {

    @Override

    public void speak() {

        System.out.println("Cat is meowing");

    }
}
