package JavaArrays;

import java.util.Arrays;

public class CopyArrays {

    public static void main (String [] args) {

        //1. Using assignment operators (shallow copy)

        // Weakness: If array numbers is changed, array positiveNumbers also changes
        //Because they share the same array objects

        int [] numbers = {1,2,3,4,5,6};

        int [] positiveNumbers = numbers;


        //2. Using for loop (deep copy)

        int [] source = {1,2,3,4,5,6};

        int [] destination = new int [source.length];

        //Iterate and copy elements
        for( int i = 0; i < source.length; i++) {
            destination [i] = source [i];
        }

        //Convert array to string to be able to display it
        System.out.println(Arrays.toString(destination));

        //3. Using aaraycopy() method
        // arraycopy(Object src, int srcPos,Object dest, int destPos, int length)

        int [] n1 = {1,2,3,4,5,6};

        int [] n2 = new int [n1.length];

        System.arraycopy(n1,0, n2, 0, n1.length);

        System.out.println("n2 = " + Arrays.toString(n2));


        //Copy 2d array using loop

        int [][] source1 = {
            {1,2,3,4},
            {5,6},
            {0,2,42,-4,5}
        };

        int [][] destination1 = new int [source1.length][];

        for (int i = 0; i < destination1.length; i++) {

            destination1[i] = new int[source1[i].length];

            for (int j = 0; j< destination1[i].length; j++) {
                destination1 [i][j] = source1 [i][j];
            }
        }

        // displaying destination array
        System.out.println(Arrays.deepToString(destination1));  



        //Copying 2D array using arraycopy
        int [][] source2= {
            {1,2,3,4},
            {5,6},
            {0,2,42,-4,5}
        };

        int [][] destination2 = new int [source1.length][];
        
        for (int i = 0; i < source2.length; ++i) {

            // allocating space for each row of destination array
            destination2[i] = new int[source2[i].length];
            System.arraycopy(source2[i], 0, destination2[i], 0, destination2[i].length);
       }
    
       // displaying destination array
       System.out.println(Arrays.deepToString(destination2));     
    }
}
