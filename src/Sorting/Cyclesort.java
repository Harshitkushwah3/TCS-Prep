/*
==> This question is asked in MNCs like google,microsoft etc.
==> When given nos. from a rage of 1 to N => always use cycle sort because the complexity.

// Here’s a step-by-step explanation of the cycle sort algorithm:

=> Start with an unsorted array of n elements.
=> Initialize a variable, cycleStart, to 0.
=>For each element in the array, compare it with every other element to its right. If there are any elements that are smaller than the current element, increment cycleStart.
=>If cycleStart is still 0 after comparing the first element with all other elements, move to the next element and repeat step 3.
=>Once a smaller element is found, swap the current element with the first element in its cycle. The cycle is then continued until the current element returns to its original position.
=>Repeat steps 3-5 until all cycles have been completed.
/*
In this the index of value is the value -1 .

*/

package Sorting;
import java.util.Arrays;
public class Cyclesort {
    public static void main(String[] args) {
        int[] arr = {1,8,5,2,3,4,7,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort (int [] arr){
        int i=0;
        while (i< arr.length-1){
            int curr_index=arr[i]-1;
            if (arr[i]!=arr[curr_index]){
                int temp=arr[i];
                arr[i]=arr[curr_index];
                arr[curr_index]=temp;
            }
            else {
                i++;
            }
        }
    }
}
