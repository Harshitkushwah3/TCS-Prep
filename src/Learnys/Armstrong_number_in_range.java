package Learnys;

import java.util.Scanner;
class Armstrong_number_in_range {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int upp=sc.nextInt();
        boolean found=false;
        for(int i=low;i<=upp;i++){
            if(arm(i)){
                System.out.print(i+" ");
                found=true;
            }
        }
        if (!found) {
            System.out.println("-1");
        }
    }
    static boolean arm (int num) {
        int org_num, rem, res = 0, n = 0;
        org_num = num;
        for (org_num = num; org_num != 0; org_num /= 10, ++n) ;
        org_num = num;
        while (org_num != 0) {
            rem = org_num % 10;
            res += Math.pow(rem, n);
            org_num /= 10;
        }
        return res == num;
    }
}