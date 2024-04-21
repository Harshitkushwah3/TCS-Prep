package String;

public class Reverse_String {
    public static void main(String[] args) {
        String str=" Harshit ";
        System.out.println(reverse(str));
    }
    static String reverse(String str){
        String str1="";
        for (int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            str1=str1+ch;
        }
        return str1;
    }
}
