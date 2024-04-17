/*
Here we use Arraylist <Integer> because here we use an array  which have dynamic length so to reduce the space complexity we use ArrayList<Integer> here.
==> Here the values in array is equal the value of N where the values is in range of 1 to N.
*/
package CyclicsortQuestion;

import java.util.ArrayList;
import java.util.List;

public class All_Missing_num_Array {
    public static void main(String[] args) {
        int[] arr = {4, 3,3, 7, 2, 2, 3, 1,1};
        List<Integer> res = sort(arr);
        System.out.println("missing number " + res);
    }

    static List<Integer> sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }

        // just find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

