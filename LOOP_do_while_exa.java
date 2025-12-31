public class LOOP_do_while_exa {
    public static void main(String[] args) {
        int number = 3;
        int factorial = 1;
        do {
            factorial *= number;
            number--;
        } while (number > 0);
        System.out.println("Factorial is: " + factorial);
    }
}
