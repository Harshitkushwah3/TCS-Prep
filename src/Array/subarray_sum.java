package Array;

public class subarray_sum {
    public static void main(String[] args) {
        int[] arr={3,4,-7,1,3,3,1,-4};
        int k=7;
        System.out.println(arr(arr,k));
    }
    static  int arr(int []arr, int k){
        int res=0;
        for (int i=0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++) {
                sum += arr[j];
                if (sum == k) {
                    res++;
                }
            }
        }
        return res;
    }
}
