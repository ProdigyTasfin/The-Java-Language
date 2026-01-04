import java.util.ArrayList;
public class LOOP_for_each {

    public static void main(String[] args) {

        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        namesList.add("Charlie");
        namesList.add("David");

        // String[] names = {"Alice", "Bob", "Charlie", "David"};

        for (String i : namesList) {
            System.out.println(i);
        }
    }
}
