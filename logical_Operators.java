public class logical_Operators {
    
public static void main(String[] args) {
    // Logical AND operator
    boolean a = true;
    boolean b = false;
    boolean andResult = a && b; // false
    System.out.println("Logical AND (true && false): " + andResult);

    // Logical OR operator
    boolean orResult = a || b; // true
    System.out.println("Logical OR (true || false): " + orResult);

    // Logical NOT operator
    boolean notResult = !a; // false
    System.out.println("Logical NOT (!true): " + notResult);
  }
}
