package String;

public class sum_num_string {
    public static void main(String[] args) {
        String s="123sdf";
        System.out.println(sum(s));
    }
    static  int  sum(String str){
        int sum=0;
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (Character.isDigit(ch) ){
                sum+=Character.getNumericValue(ch);
            }
        }
        return sum;
    }
}
