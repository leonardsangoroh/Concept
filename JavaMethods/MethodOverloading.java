package JavaMethods;

public class MethodOverloading {
    
    //Multiple methods have the same name but different parameters

    static int plusMethod(int x, int y) {
        return x+y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String [] args) {
        
        int first = plusMethod(2,4);

        double second = plusMethod(8.9, 9.0);

        System.out.println(first);

        System.out.println(second);
    }
}
