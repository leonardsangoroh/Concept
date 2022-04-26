package Gigs.Extracredit;

public class Triangle {
    
    private  static double base = 0;
    private static double height = 0;

    //Setters and Getters
    public void setBase(int x) {
        base = x;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(int x) {
        height = x;
    }

    public double getHeight() {
        return height;
    }

    //Constructor
    public Triangle (double d, double e) {
        base = d;
        height = e;
    }

    //toString function
    static void tostring() {

      System.out.println("Base: " + base);

      System.out.println("Height: " + height);

    }

    //Area method
    double area () {
        
        double answer = 0.5 * base * height;

        return answer;
    }

}

class Test{

    public static void main (String [] args) {

        Triangle t1 = new Triangle(7.2, 12.3);

        double areat1 = t1.area();

        System.out.println(areat1);

        System.out.println(t1.toString());


    }
}
