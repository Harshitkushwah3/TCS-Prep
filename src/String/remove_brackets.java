package String;

public class remove_brackets {
    public static void main(String[] args) {
        String str="a+((b-c+d))";
//        System.out.println(remove(str));
        System.out.println(rem(str));
    }
//    static String remove(String str){
//        String str1="";
//        for (int i=0;i<str.length();i++){
//            char ch= str.charAt(i);
//            if (ch!='(' && ch!=')'){
//                str1=str1+ch;
//            }
//        }
//        return str1;
//    }

    // or

static String rem(String inp){
        StringBuilder str=new StringBuilder("");
        for (int i=0;i<inp.length();i++){
            char cha=inp.charAt(i);
            if (cha!='(' && cha != ')'){
                str.append(cha);
            }
        }
        return str.toString();
}
}
