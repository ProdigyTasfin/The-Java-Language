//superclass 
//A superclass is a class that is extended or inherited by another class. 
// It serves as a base or parent class from which other classes (subclasses) 
// can derive properties and behaviors.
// For example, consider a superclass named "Animal" that has common attributes
// and methods for all animals. Subclasses like "Dog" and "Cat" can inherit
// from the "Animal" superclass, gaining its properties and behaviors while
// also adding their own specific features.
// Like in C programming, where a base struct can be extended by other structs.

public class class_super {
    public void animals() {
        String[] Animals = { "Dog ", "Cat ", "Elephant " };
        for (String animal : Animals) {
            System.out.print(animal);
        }
    }
    public static void main(String[] args) {
        class_super object = new class_super();
        object.animals();
    }
}
