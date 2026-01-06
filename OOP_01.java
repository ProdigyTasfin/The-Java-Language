import java.util.Random; 
//local vs global variables

// Local variables are declared within a method, constructor, or block and can only be used within 
// that method, constructor, or block. 
// They are created when the method is called and destroyed when the method is exited.

// Global variables (also known as instance variables) are declared within a class but outside
// any method, constructor, or block. 
// They can be used by all methods, constructors, and blocks
// in the class. 
// They are created when an object of the class is created and destroyed when
// the object is destroyed. 

public class OOP_01 {
  
    
    public static void main(String[] args) {

        DiceRoller diceRoller = new DiceRoller();
    }

}


 class DiceRoller {

    Random random; //global but inside into the class
    int number;

    DiceRoller(){
        random = new Random();
        roll(random, number);
    }
    void roll(Random random, int number){
        number = random.nextInt(7);
        System.out.println(number);
    }
}