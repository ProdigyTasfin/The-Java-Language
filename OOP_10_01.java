public class OOP_10_01 {
    public static void main(String[] args){

        Test test = new Test();
    
}

}

abstract class Test{
    abstract void display(){

    }
} 

// 1. Test test = new Test(); is it valid? 
// No, because Test is an abstract class and cannot be instantiated directly. 
// 2. Is the abstract method display() correctly defined?
// No, abstract methods cannot have a body. The correct definition should be:
// abstract void display();
// 3. Why abstract class needs a constructor?
// common data members of the abstract class can be initialized using the constructor when a subclass object is created.
// 4. Can we have a constructor in an abstract class?
// Yes, an abstract class can have a constructor.
// 5. Can we have abstract constructor?
// No, constructors cannot be abstract because they are meant to initialize objects,
// and abstract classes cannot be instantiated directly.
