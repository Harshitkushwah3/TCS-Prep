package String;

public class count_num_lett_space {
    public static void main(String[] args) {
        String str=" HARSHIT KUSHWAH ";
        count(str);

    }
    static void count(String a){
        int v=0,c=0 ,s=0;
        int len=a.length();
        System.out.println("length of string is " + len);
        a=a.toLowerCase();
        for (int i=0;i<len;i++){
            char ch= a.charAt(i);
            if (ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v++;
            } else if (ch>='a' && ch<='z') {
                c++;
            } else if (ch==' ') {
                s++;
            }
        }

        System.out.println( " Vowels are " + v + " Consonant are " + c + " spaces are " + s);
    }
}
