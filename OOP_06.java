// static keyword

public class OOP_06 {
    public static void main(String[] args){

    Friend friend1 = new Friend("Tasfin");
    Friend friend2 = new Friend("Jessica");

    System.out.println(Friend.numberOfFriends);

    }
}
    class Friend{

        String name;
        static int numberOfFriends;

        Friend(String name){
            this.name = name;
            numberOfFriends++;
        }

        
    }