package Array;

public class ArrayAvg {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        int avg=0;
        for(int i=0;i<arr.length;i++){
            avg+=arr[i];
        }
        System.out.println(avg/arr.length);
    }
}
