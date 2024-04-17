/*
==> Selection sort is a simple and efficient sorting algorithm that works by repeatedly selecting the smallest (or largest) element from the unsorted portion of the list and moving it to the sorted portion of the list.


==> The algorithm repeatedly selects the smallest (or largest) element from the unsorted portion of the list and swaps it with the first element of the unsorted part. This process is repeated for the remaining unsorted portion until the entire list is sorted.
*/
package Sorting;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int [] arr={1,8,6,7,9,1,5,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr){
        // here it finds the minimum in array
        for (int i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]>arr[min]){
                    min=j;
                }
            }


            // here it swap the values
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
