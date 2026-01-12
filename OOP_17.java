
// Dynamic Polymorphism 
public class OOP_17 {

    public static void main(String[] args) {

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
