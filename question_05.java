// Define a Rectangle class with the follwoing components:
// Private Instance Varibales: width (w) and height(h)
// Methods: Accept width and height as arguments to set the instance variables. 
// Get methods Display the height and width 
// CalculationArea() Returns the area (Area = l * w)
// toString(): Return a String containing the values of w and h e.g "Rectangle has Width 3.5 and Height 4.3"
import java.util.Scanner;

class Rectangle {

    private double w;
    private double h;

    public Rectangle(double w, double h) {
        this.w = w;
        this.h = h;
    } 

    public void setWidth(double w){
        this.w = w; 
    }
    public void setHeight(double h){
        this.h = h; 
    }
    public double getWidth(){
        return w;
    }
    public double getHeight(){
        return h;
    }

    public double calculateArea() {

        return w * h;
    }

    @Override
    public String toString() {
        return "Rectangle has Width " + w + " and Height " + h;
    }
}
    public class question_05{
    public static void main(String[] args) {
        double w,h;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Width (w): " );
        w = input.nextDouble();
        System.out.print("Enter Height (h): " );
        h = input.nextDouble();
        Rectangle r = new Rectangle(w, h);
        System.out.println(r);
        System.out.println(r.calculateArea());
    }

    }