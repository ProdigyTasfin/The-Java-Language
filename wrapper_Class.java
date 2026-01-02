public class wrapper_Class {
    public static void main(String[] args) {
        // Example of using wrapper classes in Java
        // Boxing: converting primitive types to wrapper objects
        // wrappers vs primitives :
        // main difference is that wrapper classes are objects and provide methods to manipulate the data, 
        // while primitive types are simple data types without methods.
        Integer a = Integer.valueOf(10);
        Double b = Double.valueOf(20.5);
        Character c = Character.valueOf('A');
        Boolean d = Boolean.valueOf(true);

        // Unboxing: converting wrapper objects back to primitive types
        int intValue = a.intValue();
        double doubleValue = b.doubleValue();
        char charValue = c.charValue();
        boolean boolValue = d.booleanValue();

        System.out.println("Integer Value: " + intValue);
        System.out.println("Double Value: " + doubleValue);
        System.out.println("Character Value: " + charValue);
        System.out.println("Boolean Value: " + boolValue);
    }
}