import java.util.Scanner;

    public class Find_out_Hypo{

        public static void main(String[] args){

            double x,y;
            float z;
            System.out.print("X: ");
            Scanner input = new Scanner(System.in);
            x = input.nextDouble();
            System.out.print("Y: ");
            y = input.nextDouble();
            z = (float) Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
            System.out.print("Your Hypotenous " + z + " cm");
            }}
