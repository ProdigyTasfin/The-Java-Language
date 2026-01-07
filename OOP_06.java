// static keyword
// explanation: static keyword is used to create class-level variables and methods
// static variables are shared among all instances of a class


public class OOP_06 {
    public static void main(String[] args){

    Friend friend1 = new Friend("Tasfin"); // create first friend object
    Friend friend2 = new Friend("Jessica");

    System.out.println(Friend.numberOfFriends); // access static variable using class name

    Friend.displayFriends(); // access static method using class name

    }
}
    class Friend{

        String name;
        static int numberOfFriends; // if we remove static here, the numberOfFriends variable will not work as intended

        /* explation: static variable to keep track of number of friends
         Why static? because we want to share this variable among all instances of the class
         what is instances of the class? instances are the objects created from the class
         each time we create a new object, we want to increment the numberOfFriends variable
         in easy language if we don't use static here, each object will have its own copy of 
         numberOfFriends variable and the value will not be shared among the objects
         copy of numberOfFriends means each object will have its own value of numberOfFriends variable
         why we use int type? because we want to keep track of the count of friends
        */

        Friend(String name){
            this.name = name;
            numberOfFriends++;
        }
        static void displayFriends(){
            System.out.println("You have " + numberOfFriends + " friends.");
        }
        
    }