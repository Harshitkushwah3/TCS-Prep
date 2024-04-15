package Array;
public class SecondSmallLarger {
        public static void main(String[] args) {
        int[]a ={8,10,10,5,5,5,5,5,7,9};
        System.out.println(" second smaller " + small(a) + " Second larger " + large(a));
    }
    static int small(int[] arr){
        int sm=arr[0];
        int ssm=Integer.MAX_VALUE;
        for (int i=1 ;i< arr.length;i++){
            if (arr[i]<sm){
                ssm=sm;
                sm=arr[i];
            }
            else if (arr[i]!=sm && arr[i]<ssm){
                ssm =arr[i];
            }
        }
        return ssm;
    }
    static int large(int [] arr){
            int lar=arr[0];
            int slarg=Integer.MIN_VALUE;
            for(int i=1;i<arr.length;i++){
                if (arr[i]>lar){
                    slarg=lar;
                    lar=arr[i];
                }
                else if (arr[i] < lar && arr[i]>slarg){
                    slarg=arr[i];
                }
            }
            return slarg;
    }
}
