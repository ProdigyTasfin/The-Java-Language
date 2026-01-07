// array of objects

public class OOP_04 {
    public static void main(String[] args) {

        Food[] refrigerator = new Food[3];

        Food food1 = new Food("Burger");
        Food food2 = new Food("Pizza");
        Food food3 = new Food("Pasta");
        refrigerator[0] = food1;
        refrigerator[1] = food2;
        refrigerator[2] = food3;

        for (int i = 0; i < refrigerator.length; i++) {
            System.out.println("Memory Address: " + refrigerator[i]);
            System.out.println("Food Name: " + refrigerator[i].name);
            System.out.println("--------------");
        }
        
    }
}

class Food{

    String name;

    Food(String name){
        
        this.name = name; 

    }

}