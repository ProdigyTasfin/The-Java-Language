public class type_Conversions {
    public static void main(String[] args) {
        // Implicit Conversion (Widening)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Conversion (int to double): " + doubleValue);

        // Explicit Conversion (Narrowing)
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit Conversion (double to int): " + anotherIntValue);

        // String to Integer Conversion
        String strNumber = "123";
        int parsedInt = Integer.parseInt(strNumber);
        System.out.println("String to Integer Conversion: " + parsedInt);

        // Integer to String Conversion
        int num = 456;
        String strFromInt = Integer.toString(num);
        System.out.println("Integer to String Conversion: " + strFromInt);
    }
}
