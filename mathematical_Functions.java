public class mathematical_Functions {
    public static void main(String[] args) {
        double a = 5;
        double b = 2;
        double max = Math.max(a, b); // a = 5, b = 2
        double min = Math.min(a, b); // a = 5, b = 2
        double c = -10;
        double d = 25;
        System.out.println("Mathematical Functions Results:");
        System.out.println("Power: a = 5 and b = 2, so the ans is  " + Math.pow(a, b));
        System.out.println("Square Root of d is, when d = 25, so the ans is " + Math.sqrt(d));
        System.out.println("Absolute Value of c is, c = -10, abs is  " + Math.abs(c));
        System.out.println("Maximum value between a = 5 and b = 2 is: in this  " + max);
        System.out.println("Minimum value between a = 5 and b = 2 is: in this  " + min);

    }
}
