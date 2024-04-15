package Array;

import java.util.Arrays;

public class LargerInArray {
//    public static void main(String[] args) {
//        int [] a = {2,5,1,3,0};
//        System.out.println("smallest no is " + sort(a));
//    }
//    static int sort(int [] arr){
//        int i= arr.length;
//        Arrays.sort(arr);
//        return arr[i-1];
//    }

    public static void main(String[] args) {
        int [] arr = {2,5,1,3,0};
        int j=arr.length;
        int small=arr[j-1];
        for (int i=0;i<j;i++){
            if (arr[i]>small){
                small=arr[i];
            }
        }
        System.out.println(small);
    }
}
