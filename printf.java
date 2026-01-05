public class printf {

    public static void main (String[] args) {

        int x = 12;
        double y = 21;
        String z = "Sakib";
        boolean a = true;
        char b = 'v';
        float c = (float) 3.1416; 
        String name = "Sakib";

        System.out.printf("This is printing the int value %.2f \n", y);
        System.out.printf("This is printing the double value %d \n", x);
        System.out.printf("This is printing the string %s \n", z);
        System.out.printf("This is printing the boolean %b \n", a);
        System.out.printf("This is printing the character %c \n", b);
        System.out.printf("This is printing the float value %.4f \n", c);
        
        //Width
        System.out.printf("Hello %10s", name);

    }
}
