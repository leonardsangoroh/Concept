package JavaFlowControl;

public class IfElse {

    public static void main (String [] args) {

            // If statement
            int number = 10;

            if (number < 0) {
                System.out.println("The number is negative");
            }

            System.out.println("Statement outside if block");

            // if statement with string
            String language = "java";

            if (language == "java") {
                System.out.println("Best programming language");
            }

            // if-then-else
            //Executes only one of the block depending on whether condition has been met or not


            int numberTwo = 10;

            if(numberTwo > 0) {
                System.out.println("The number is positive");
            }
            else {
                System.out.println("The number is negative");
            }

            // if-else-if statement
            /*
            If statements are executed from the top to bottom
            If true, code inside that if block is executed 
            Then the program control leaves the if-else-is ladder 
            */

            int numberThree = 0;

            if(numberThree > 0) {
                System.out.println("The number is positive");
            }
            else if(numberThree < 0) {
                System.out.println("The number is negative");
            }
            else {
                System.out.println("The number is equal to zero");
            }


            //Nested if
            // if statement inside an if statement

            double n1 = -1.0;
            double n2 = 4.5;
            double n3 = -5.3;
            double largest;

            if (n1 >= n2) {

                if (n1 >= n3) {
                    largest = n1;
                }
                else {
                    largest = n3;
                }
            }
            else {
                if(n2 >= n3) {
                    largest = n2;
                }

                else {
                    largest = n3;
                }
            }

            System.out.println("Largest Number:" + largest);


    }
}
