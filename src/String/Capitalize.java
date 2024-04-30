// In this problem we have to capitalize the 1st and last character of word in a string.
package String;

public class Capitalize {
    public static void main(String[] args) {
        String str = "Take u Forward is Awesome";
        System.out.println("String after capitalizing first and last letter of each word:");
        System.out.println(New (str));
    }
    static String New(String str){
        StringBuilder result = new StringBuilder();

        for (String word : str.split("\\s+")) {
            System.out.println(word);
            if (word.length() > 1) {
                char fCh = Character.toUpperCase(word.charAt(0));
                char lCh = Character.toUpperCase(word.charAt(word.length() - 1));
                result.append(fCh).append(word, 1, word.length() - 1).append(lCh);
            } else {
                result.append(Character.toUpperCase(word.charAt(0)));
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}

