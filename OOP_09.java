
// Super keyword = keyword refers to the superclass (parent) of an object very similar similar to the 
// "this" keyword

public class OOP_09 {

    public static void main(String[] args) {

        Hero hero1 = new Hero("Batman", 26, "He has a bat mobile");
        Hero hero2 = new Hero("Thor", 36, "Lightning");

        System.out.println("The Hero is: ");
        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        System.out.println("The Hero is: " + "\n" + "Name: " + hero2.name + "\n" + "Age: " + hero2.age + "\n"
                + "Power: " + hero2.power + "\n");
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

class Hero extends Person {

    String power;

    Hero(String name, int age, String power) {

        super(name, age);
        this.power = power;

    }
}
