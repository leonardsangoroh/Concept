package JavaIntroduction;

import java.util.Scanner;

public class JavaInput {

    public static void main(String [] args) {

    //create an object of the scanner class
    Scanner input = new Scanner(System.in);

    //Prompt for input
    System.out.println("Enter a number");

    //Get integer
    int number = input.nextInt();

    //Get float
    float myFloat = input.nextFloat();

    //Get double
    double myDouble = input.nextDouble();

    //Get text
    String myString = input.next();

    System.out.println(number);

    input.close();
    }

}
