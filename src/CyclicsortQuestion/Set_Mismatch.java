/*
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.
*/
// question link
//https://leetcode.com/problems/set-mismatch/description/
package CyclicsortQuestion;
import java.util.Arrays;

import static CyclicsortQuestion.All_Missing_num_Array.swap;
public class Set_Mismatch {
    public static void main(String[] args) {
        int []arr={1,1};
        int [] a=findErrorNums(arr);
        System.out.println(" Duplicate and missing nos. are respectively "+Arrays.toString(a));
    }
    static int[] findErrorNums(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
//        for (int index = 0; index < arr.length; index++) {
//            if (arr[index] != index + 1) {
//                return new int[] {arr[index], index+1};
//            }
//        }
//        return new int[] {-1, -1};

        // or
        int[] result = {-1, -1};
// search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                result[0] = arr[index];
                result[1] = index + 1;
                return result;
            }
        }
        return result;

    }
}

