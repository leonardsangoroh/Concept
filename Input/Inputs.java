package Input;

import java.util.Scanner;

public class Inputs {
    
    public static void main(String [] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter name");

        String userName = myScanner.nextLine()

        System.out.println("Name: " + userName);
    }
}
