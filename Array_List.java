public class Array_List {
    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        System.out.println("Fruits in the list:");
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i)); // Display each fruit
        }
    }