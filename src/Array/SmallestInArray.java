package Array;

import java.util.Arrays;

public class SmallestInArray {
    public static void main(String[] args) {
        int [] a = {2,5,1,3,0};
        System.out.println("smallest no is " + sort(a));
    }
    static int sort(int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }

//    public static void main(String[] args) {
//        int [] arr = {2,5,1,3,0};
//        int small=arr[0];
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]<small){
//                small=arr[i];
//            }
//        }
//        System.out.println(small);
//    }
}
