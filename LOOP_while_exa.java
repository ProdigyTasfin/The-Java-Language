import java.util.Scanner; 
public class LOOP_while_exa {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = "";
        while (name.isBlank()) { // you can also use name.equals("") also (name.isEmpty())
            System.out.print("Please enter your name: ");
            name = input.nextLine();
        }
        System.out.println("Hello, " + name + "!");
        
    }
    
}
