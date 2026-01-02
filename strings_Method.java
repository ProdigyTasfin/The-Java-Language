public class strings_Method {
    public static void main(String[] args) {
        String name = "Tasfin";
        int length = name.length();
        String upper = name.toUpperCase();
        String subStr = name.substring(0, 2);
        boolean isEmpty = name.isEmpty();
        boolean containsA = name.contains("a");
        boolean result = name.equals("Tasfin");

        System.out.println("Original String: " + name); // Display original string
        System.out.println("Length of String: " + length); // Display length
        System.out.println("Uppercase String: " + upper); // Display uppercase
        System.out.println("Substring (0 to 2): " + subStr); // Display substring
        System.out.println("Is String Empty: " + isEmpty); // Display if empty
        System.out.println("Contains 'a': " + containsA); // Display containment check
        System.out.println("Equals 'Tasfin': " + result); // Display equality check

    }
}