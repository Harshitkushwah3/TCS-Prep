package String;

public class sum_num_string {
    public static void main(String[] args) {
        String s="1sd22f";
        System.out.println(sum(s));
    }
    static  int  sum(String str){
        int sum=0;
        int num=0;
        for (int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if ((ch>= '0') && (ch <= '9')){
                num=num*10+(ch-'0');
            }
            else {
                sum+=num;
                num=0;
            }
        }
        sum+=num;
        return sum;
    }
}
