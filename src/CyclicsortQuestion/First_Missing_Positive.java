/*Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
*/
// https://leetcode.com/problems/first-missing-positive/description/
package CyclicsortQuestion;
import static CyclicsortQuestion.All_Missing_num_Array.swap;
public class First_Missing_Positive {
    public static void main(String[] args) {
        int [] arr= {3,4,-1,1};
        int res=firstMissingPositive(arr);
        System.out.println(res);
    }
    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return arr.length + 1;
    }

}
