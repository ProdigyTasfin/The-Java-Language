//overload constructors

public class OOP_02 {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("thick", "tomato", "mozzarella", "pepperoni"); // creating pizza object using constructor with 4 parameters
        System.out.println("The incredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce); // accessing attributes of pizza object
        System.out.println(pizza.cheese);
        System.out.println(pizza.toppings); 
    }
}

class Pizza {

    String bread;
    String sauce;
    String cheese;
    String toppings;

    Pizza(String bread, String sauce, String cheese, String toppings) { // constructor with 4 parameters
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
    }

    Pizza(String bread, String sauce, String cheese) { // constructor with 3 parameters
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    Pizza(String bread) {
        this.bread = bread;
    }

    Pizza() {

    }

}
