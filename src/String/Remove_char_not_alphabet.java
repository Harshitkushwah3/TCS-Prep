package String;

public class Remove_char_not_alphabet {
    public static void main(String[] args) {
        String str=" take12% *&u ^$#forward ";
        System.out.println(remove(str));

    }
    static String remove(String str){
        String str1 = " ";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch>='A'&& ch<='Z'  || ch>='a' && ch <='z'){
                str1=str1+ch;
            }
        }
        return str1;
    }
}
