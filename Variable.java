public class Variable {
    public static void main(String[] args) {
        int number = 10;
        String text = "I'm learning variables!";
        float decimal = 5.52f; // 'f' suffix indicates a float literal
        byte b = 127; // byte range is -128 to 127, this will cause a compilation error
        short s = 10000; // short range is -32,768 to 32,767, this will cause a compilation error
        boolean flag = true; 
        double pi = 3.14159; // double type for more precision
        char letter = 'A'; // char type for single characters
        long bigNumber = 100000066789L; // 'L' suffix indicates a long literal

        System.out.println("Integer: " + number);
        System.out.println("String: " + text);
        System.out.println("Float: " + decimal);
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Boolean: " + flag);
        System.out.println("Double: " + pi);
        System.out.println("Character: " + letter);
        System.out.println("Long: " + bigNumber);
    }
    
}
