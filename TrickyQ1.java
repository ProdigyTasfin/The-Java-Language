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

        // System.out.print(a + "\n");
        // System.out.print(b + "\n");
        // System.out.print(c + "\n");                   // Just checking values

        // System.out.println(System.identityHashCode(a));
        // System.out.println(System.identityHashCode(b));
        // System.out.println(System.identityHashCode(c));


        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}

/*  OUTPUT :    java
                java
                java
                1247233941
                1247233941
                258952499
                true
                false
                true 

                IT SEEMS SAME BUT DIFFERENT IN THE MEMORY ADDRESS! When a = java, b = java, storing 
                same object which share same memory address

                but when it equals to it focred to heap memory store it. So looking charactrer- wise
                same but memory wise different. 

*/
