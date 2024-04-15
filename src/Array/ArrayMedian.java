/*

Median formulae for even no of values := ((n/2)th term + (n/2 +1)th term)/2;

Median formulae for odd no of values := ((n+1)/2 th term);

*/

package Array;

import java.util.Arrays;

public class ArrayMedian {
    public static void main(String[] args) {
        int [] arr ={1,3,2,5,4,6,7,8,9,10};
        int k=arr.length;
        System.out.println(k);
        float median=0;
        Arrays.sort(arr);
        if (k%2==0){
            median=(arr[k/2]+arr[(k/2)-1])/2;
            System.out.println(median);
        }
        else{
            median=arr[(k)/2];
            System.out.println(median);
        }
    }
}
