
// Dynamic Polymorphism 

public class OOP_17 { 

    public static void main(String[] args){

        Animal animal;

    }
    
}
    class Animal{

    }

    class Dog extends Animal {
        public void speak(){
            System.out.println("Cat is mewoing");
        }

    }

     class Cat extends Animal {

        System.out.println("Dog is barking");

    }