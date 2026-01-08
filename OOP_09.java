
// Super keyword = keyword refers to the superclass (parent) of an object very similar similar to the 
// "this" keyword

public class OOP_09 {
    
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Batman", 26 , "He has a bat mobile");
        
        System.out.println("The Hero is: ");
        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);
    }
}

class Person {

    String name;
    int age;

    Person(String name, int age) {

        this.name = name;
        this.age = age;
    }
}

class Hero extends Person{

    String power;

    Hero (String name, int age, String power) {

        super(name, age);
        this.power = power;

    }
}
