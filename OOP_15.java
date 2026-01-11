// interface = a template that can be applied to a class.
//             similar to inheritance, but specifies what a class has/must do.
//             classes can apply more than one interface, inheritance is limited to 1 super

public class OOP_15{

    public static void main(String[] args){

        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();

    }
}

interface Prey {

    void flee();

}

interface Predator {

    void hunt();

}

class Fish implements Prey,Predator {

    public void flee(){
        System.out.println("This fish is fleeing");
    }
    public void hunt(){
        System.out.println("This fish is hunting");
    }
}

class Rabbit implements Prey{

    @Override 

    public void flee(){
        System.out.println("This rabbit is fleeing");
    }

}

class Hawk implements Predator{

    public void hunt(){
        System.out.println("This hawk is hunting");
    }
}