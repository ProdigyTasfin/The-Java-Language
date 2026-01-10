// // String a = "java";
// String b = "java";
// String c = new String("java");

// System.out.println(a == b);
// System.out.println(a == c);
// // System.out.println(a.equals(c));

// Output: true  


public class TrickyQ1 {
    public static void main(String[] args) {
        String a = "java";
        String b = "java";
        String c = new String("java");

        System.out.print(a + "\n");
        System.out.print(b + "\n");
        System.out.print(c + "\n");

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));


        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}
