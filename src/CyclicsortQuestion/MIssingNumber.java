package CyclicsortQuestion;
public class MIssingNumber {
    public static void main(String[] args) {
        int [] arr = {1,5,0,8,9,6,7,12,11,2,4,3};
        System.out.println(sort(arr));
    }
    static int sort(int [] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        // search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index) {
                return index;
            }
        }
        // case 2
        return arr.length;
    }
}
