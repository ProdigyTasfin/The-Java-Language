public class method_overload {
    public static void main (String[] args){

        int x = add(1,2, 3,4);

        System.out.print("Result: " + x);
    }

    static int add(int a, int b){
        System.out.println("This is overload method #1");
        return a + b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overload method #2");
        return a + b + c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overload method #3");
        return a + b + c + d;
    }
}
