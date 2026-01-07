//to string another example

public class OOP_03_01 {
    public static void main (String[] args){

        Myself bio = new Myself();

        System.out.println(bio);

    }
}

class Myself{
    String Name = "Tasfin";
    int age = 22;
    double weight = 67.6;
    String hobby = "Writing";

    public String toString(){
        String myString = "Name: " + Name + "\n"+ "Age: " + age + " years" + "\n" + "Weight: "+ weight + " KG" +"\n" + "Hobby: "+ hobby;
        return myString;
    }


}