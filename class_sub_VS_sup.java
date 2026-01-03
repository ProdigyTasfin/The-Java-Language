// Superclass (Parent)
class Person {

    String name;
    int age;

    // Constructor of superclass
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass (Child)
class Student extends Person {

    int roll;

    // Constructor of subclass
    Student(String name, int age, int roll) {
        super(name, age);   // calls Person constructor
        this.roll = roll;
    }

    void displayStudentInfo() {
        displayInfo(); // inherited method
        System.out.println("Roll: " + roll);
    }
}

// Main class to test the inheritance 

public class class_sub_VS_sup {
    public static void main(String[] args) {

        Student s1 = new Student("Tasfin", 21, 13);
        s1.displayStudentInfo();
    }
}
