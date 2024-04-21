package String;

public class Remove_space {
    public static void main(String[] args) {
        String str="What are you doing ?";
        System.out.println(remove(str));
    }
    static String remove(String str){
        String str1="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (ch !=' '){
                str1=str1+ch;
            }
        }
        return str1;
    }
}
