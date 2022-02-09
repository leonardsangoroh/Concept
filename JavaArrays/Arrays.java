package JavaArrays;

public class Arrays {
    
    public static void main(String [] args) {

        //Declare array
        double [] data;

        //Allocate memory
        data = new double [10];

        //Both in a single statement
        double [] age = new double [5];

        //Access array elements
        age [0] = 12;

        System.out.println(age[0]);
        System.out.println("******************************");
        //Declare and initialize 

        int [] miaka = {99, 59, 74, 89, 56};

        //Looping through an array
        for (int i = 0; i < miaka.length; i++) {
            System.out.println(miaka[i]);
        }

        //For each
        for (int i : miaka) {
            System.out.println(i);
        }

        //Sum

        int total = 0;
        double average = 0;

        for(int i : miaka) {
            total += i;
        }

        System.out.println("Total is " + total);

        int length = miaka.length;

        average = total/length;

        System.out.println("Average is " + average);

    }
}
