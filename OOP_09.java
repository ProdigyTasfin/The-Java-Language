
// Super keyword = keyword refers to the superclass (parent) of an object very similar similar to the 
// "this" keyword

public class OOP_09 {
    
    public static void main(String[] args) {
        
        Hero hero1 = new Hero("Batman", 26 , "He has a bat mobile");
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

    Hero(String name, int age, String power){

        this.name = name;
        this.age = age;
        this.power = power;

    }
}
