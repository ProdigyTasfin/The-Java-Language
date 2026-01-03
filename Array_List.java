import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.get(0); // Access Apple
        
        fruits.set(1, "Mango"); // Update Banana to Mango
        fruits.remove(0); // Remove Apple
        System.out.println("Fruits in the list:");
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i)); // Print each fruit
            
        }
    }
}