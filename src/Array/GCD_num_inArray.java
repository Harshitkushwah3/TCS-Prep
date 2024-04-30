package Array;

public class GCD_num_inArray {
    public static void main(String[] args) {
        int [] arr={2, 4, 6, 8,16};
        int n=arr.length;
        System.out.println(argcd(arr,n));
    }
    static int gcd(int a, int b){
        if (b==0){
            return a;
        }
        return  gcd(b,a%b);
    }
    static  int argcd(int[] arr, int n){
        int res=arr[0];
        for (int i=1;i<arr.length;i++){
            res=gcd(res,arr[i]);
        }
        return res;
    }
}
