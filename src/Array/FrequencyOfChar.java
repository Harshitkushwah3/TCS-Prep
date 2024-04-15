package Array;
public class FrequencyOfChar {
    public static void main(String[] args) {
        int [] arr = {10,5,10,15,10,5};
        int n=arr.length;
        countfreq(arr,n);
    }
    static void countfreq(int [] arr,int n){
        boolean visit[]=new boolean[n];
        for (int i=0;i<n;i++){
            if (visit[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    visit[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
