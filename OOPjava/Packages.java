package OOPjava;

import java.util.Scanner;

public class Packages {
    
    public static void main(String [] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your name");

        String name = myScanner.nextLine();

        System.out.println(name);

        myScanner.close();
    }
}
