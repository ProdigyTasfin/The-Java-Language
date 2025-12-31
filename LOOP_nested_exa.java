public class LOOP_nested_exa {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Table of " + i + ":");
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}
