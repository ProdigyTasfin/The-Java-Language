public class method_03 {

    public static void main(String[] args) {

        int x = 12;
        int y = 21;
        int result = sum(x, y); 
        System.out.print("Result: " + result);  // Output: Result: 33
    }

    static int sum(int x, int y){
        return x + y; // return the sum of x and y
    }
}