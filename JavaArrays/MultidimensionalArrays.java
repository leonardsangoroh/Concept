package JavaArrays;

//import java.util.Scanner;
//import java.util.Arrays;
//import java.util.*;

public class MultidimensionalArrays {
    
    public static void main(String [] args) {
        // An array of an array
        // Each element of a multidimensional array is an array itself

        // 2D Declaration and memory allocation
        int [][] numbers = new int [3][4];

        // 3D Declaration and allocation
        String [][][] names = new String [3][4][5];

        //initialize 2D array

        int [][] num = {
            {1,2,3},
            {4,5,6,7},
            {8}
        };

        System.out.println(num[0].length);
        System.out.println("-------------------------------------");

        //Print all elements in a 2D array
        for(int row = 0; row < num.length; row++) {
            for(int column = 0; column <num[row].length; column++) {
                System.out.println(num[row][column]);
            }
        }

        //For each loop

        //Access individual array inside the 2D array
        for(int [] innerArray: num) {
            //Access elements inside the row
            for( int data : innerArray) {
                System.out.println(data);
            }
        }

        //Initialize 3D array

        int [][][] numbersss = {
            {
                {1,2,3},
                {4,5,6}
            },
            {
                {7,8,9},
                {10,11,12},
                {13,14,15}
            }
        };

        //Loop through using for each loop
        for (int[][] array2D: numbersss) {
            for (int[] array1D: array2D) {
                for(int item: array1D) {
                    System.out.println(item);
                }
            }
        }


    }
}
