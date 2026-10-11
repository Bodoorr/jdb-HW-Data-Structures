package com.ga.homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {

//    Implement the rotation in a function called rotate.
//    Handle cases where d > n. (d%n)
//    Test the function with multiple values of d and array sizes.
    public static void rotate(int[] arr, int d, int n) {
        if (n==0){ //if size =0
            return;
        }

        for (int j=0; j< d % n; j++){
            int first= arr [0]; //first element

            for (int i=0; i< n-1; i++){
                //array[5,6,7]
                //after[6,7,5]
                arr[i]= arr[i+1];   // arr[0]=5 -- arr[0+1]=arr[1]=6
                // [6,7,]
            }
            //add the first to the last
            arr[n-1]= first;
        }

    }

    public static void main(String[] args) {
        int[] arr= {};
        int d=1; //if 1 time //20,30,10

        int d1=2; //if 2 times //30,10,20

        int d2=3; //if 3 times //10,20,30

        int d4=0; //if 0 time //10,20,30


//        rotate(arr,d,arr.length);
//        rotate(arr,d1,arr.length);
//        rotate(arr,d2,arr.length);
//        rotate(arr,d4,arr.length);

        System.out.println(Arrays.toString(arr));

    }
}
