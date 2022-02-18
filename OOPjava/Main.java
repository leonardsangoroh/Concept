package OOPjava;

public class Main {

    int x =5;

    public static void main (String[] args) {

        Main newMain = new Main();

       System.out.println( newMain.x);
    }
}

class Second {

    public static void main(String[]args) {
        Main myObj = new Main();
        
    }
}
