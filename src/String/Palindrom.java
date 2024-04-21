package String;

public class Palindrom {
    public static void main(String[] args) {
        String a="123454321";
        System.out.println(search(0,a));

    }
    static  boolean search (int i ,String a){
        if(i>=a.length()/2){ // here we find the mid-value for checking that the all index are check or not
            return true;
        }
        if (a.charAt(i) != a.charAt(a.length()-i-1)){
            return false;
        }
        return search(i+1,a);
    }
}
