package JavaMethods;

public class Main {
    
    //static means the method belongs to class Main and not an object of class Main

    //You can therefore acces a static method without declaring an object
    //Unlike static methods, public methods are accessed throught the class objects
    static void myMethod() {
        System.out.println("This is myMethod()");
    }

    static void name (String fname) {
        System.out.println("First Name: " + fname);
    }

    static int age(int miaka) {
        return miaka;
    }

    static void checkAge(int age) {
        if(age<18) {
            System.out.println("Access Denied");
        }

        else {
            System.out.println("You are old enough");
        }
    }

    public static void main(String[] args) {
        myMethod();

        name("Leonard");

        age(88);

        checkAge(88);
    }
}
