package Array;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={ 1,2,3,4,5,6,7,8,9};
        for (int i=0;i<(arr.length)/2;i++){
            for (int j=arr.length-1;i>(arr.length)/2;i--){
                int temp=0;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.println(arr);
    }
}
