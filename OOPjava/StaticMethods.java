package OOPjava;

public class StaticMethods {
    
    static void myStaticMethod () {
        System.out.println("Static method");
    }

    public void myPublicMethod () {
        System.out.println("Public method");
    }

    public static void main (String [] args) {

        myStaticMethod();

        StaticMethods d = new StaticMethods();

        d.myPublicMethod();
    }
}
