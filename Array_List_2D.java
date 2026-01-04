import java.util.*; 

public class Array_List_2D {
    
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();

        bakeryList.add("Bread");
        bakeryList.add("Croissant");
        bakeryList.add("Muffin");

        System.out.println("Bakery List: " + bakeryList);

        ArrayList<String> productList = new ArrayList();

        productList.add("Milk");
        productList.add("Eggs");
        productList.add("Cheese");

        ArrayList<String> drinkList = new ArrayList();

        drinkList.add("Water");
        drinkList.add("Juice");
        drinkList.add("Soda");

        groceryList.add(bakeryList);
        groceryList.add(productList);
        groceryList.add(drinkList);

        System.out.println("Grocery List: " + groceryList);

    }
}