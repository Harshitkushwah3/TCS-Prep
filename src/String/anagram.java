package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {    String a="PEEK";
        String b="KEEP";
        System.out.println(ana(a,b));

        String c="Mother In Law";
        String d="Hitler Woman";
        System.out.println(ana(c,d));
    }


    static boolean ana(String a, String b) {
        String a1 = a.replace("\\s", "");
        String b1 = b.replace("\\s", "");

        if (a1.length() != b1.length()) {
            return false;
        } else {
            char[] Aaa = a1.toLowerCase().toCharArray();
            char[] Baa = b1.toLowerCase().toCharArray();
            Arrays.sort(Aaa);
            Arrays.sort(Baa);
            for (int i = 0; i < Aaa.length; i++) {
                if (Aaa[i] != Baa[i]) {
                    return false;
                }
            }
            return true;
        }
    }
}

