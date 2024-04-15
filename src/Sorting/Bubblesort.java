/*
In Bubble Sort algorithm,

=> traverse from left and compare adjacent elements and the higher one is placed at right side.
=> In this way, the largest element is moved to the rightmost end at first.
=> This process is then continued to find the second largest and place it and so on until the data is sorted.

:==> Bubble sort is also known as sinking or exchanging sort
*/
package Sorting;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));

        //other method to print the values

//        for (int i = 0; i < arr.length; i++) {
//            if (i < arr.length - 1) {
//                System.out.print(arr[i] + ", ");
//            } else {
//                System.out.print(arr[i]);
//            }
//        }
    }
    static void sort(int [] arr){
        boolean swap;
         for (int i=0;i<arr.length;i++){
             swap=false;
             for(int j=1;j<arr.length-i;j++){
                 if (arr[j]<arr[j-1]){
                     int temp=arr[j];
                     arr[j]=arr[j-1];
                     arr[j-1]=temp;
                     swap = true;
                 }
             }
             if (!swap){
                 break;
             }
         }
    }
}
