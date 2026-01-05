public class OOP {
    public static void main(String[] args) {
    
    Car myCar = new Car();
    
    System.out.println(myCar.model);
    System.out.println(myCar.color); 
    System.out.println(myCar.price);

    myCar.drive();

    myCar.auto_poilot();


}
}

public class Car{

    public static void main(String[] args){
    String model = "Tesla";
    String color = "Blue";
    double price = 50000;
    int year = 2026;
    boolean white = true;

    void auto_poilot(){
        System.out.println("Turn on! The AUTO-POILOT MODE!");
    }

    void drive(){
        System.out.println("Turn off! The AUTO-POILOT MODE! You can drive it!");
    }
}
}