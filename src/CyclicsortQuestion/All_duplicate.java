/*
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
*/
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
package CyclicsortQuestion;

import java.util.ArrayList;
import java.util.List;
// here I am importing swap class form another program,it is in same package
import static CyclicsortQuestion.All_Missing_num_Array.swap;

public class All_duplicate {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,8,2,3,1};
        List<Integer> res=findDuplicates(arr);
        System.out.println("duplicates are "+ res );

    }
    static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index+1) {
                ans.add(arr[index]);
            }
        }
        return ans;
    }
}

