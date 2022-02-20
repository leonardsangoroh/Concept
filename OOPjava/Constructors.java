package OOPjava;

public class Constructors {
    //constructor - special method used to initialize objects

    int modelYear;
    String modelName;

    //Contructor
    public Constructors (int x, String y) {
            modelYear = x;

            modelName = y;
    }

    public static void main (String [] args) {

        Constructors constOne = new Constructors(44, "Leo");

        System.out.println("model year: " + constOne.modelYear + "\n" + "model name: " + constOne.modelName);
    }
}
