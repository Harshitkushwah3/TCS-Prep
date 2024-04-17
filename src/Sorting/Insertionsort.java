package Sorting;

import java.util.Arrays;

public class Insertionsort {

    public static void main(String[] args) {
        int[] arr={8,7,9,2,46,3,15,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr){
        int n= arr.length;
        for (int i = 0; i <= n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

    }
}
