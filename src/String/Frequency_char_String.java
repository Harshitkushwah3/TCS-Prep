package String;

import java.util.HashMap;

public class Frequency_char_String {
    public static void main(String[] args) {
        String str= "ABBAJRKSAHDISAKSJSNCK";
//        map(str);
        freq(str);
    }
    static void freq(String str){
        boolean visit[]=new boolean[str.length()];
        for (int i=0;i<str.length();i++){
            if (visit[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<str.length();j++){
                if (str.charAt(i)==str.charAt(j)){
                    visit[j]=true;
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " " + count);
        }
    }

//    static void map(String str){
//        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
//        for (int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//                if (map.containsKey(ch)){
//                    int count = map.get(ch);
//                    count++;
//                    map.replace(ch,count);
//                }
//                else {
//                    map.put(ch,1);
//            }
//        }
//        for (Character key:map.keySet()){
//            System.out.println(key+""+map.get(key));
//        }
//    }
}
