public class strings_Method {
    public static void main(String[] args) {
        String name = "Tasfin";
        int length = name.length();
        String upper = name.toUpperCase();
        String subStr = name.substring(0, 2);
        boolean isEmpty = name.isEmpty();
        boolean containsA = name.contains("a");
        boolean result = name.equals("Tasfin");

        System.out.println("Original String: " + name);
        System.out.println("Length of String: " + length);
        System.out.println("Uppercase String: " + upper);
        System.out.println("Substring (0 to 2): " + subStr);
        System.out.println("Is String Empty: " + isEmpty);
        System.out.println("Contains 'a': " + containsA);
        System.out.println("Equals 'Tasfin': " + result);

    }
}