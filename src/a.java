class TUF {
    public static String capitalizeFirstAndLast(String str) {
        StringBuilder result = new StringBuilder();

        // Split the string into words
        String[] words = str.split("\\s+");

        for (String word : words) {
            if (word.length() > 1) {
                // Capitalize first letter
                char firstChar = Character.toUpperCase(word.charAt(0));
                // Capitalize last letter
                char lastChar = Character.toUpperCase(word.charAt(word.length() - 1));

                // Append capitalized first and last letters with the rest of the word
                result.append(firstChar).append(word.substring(1, word.length() - 1)).append(lastChar);
            } else {
                // For single-letter words, simply capitalize the letter
                result.append(Character.toUpperCase(word.charAt(0)));
            }

            // Append space between words
            result.append(" ");
        }

        // Remove trailing space and return the result
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String str = "Take u Forward is Awesome";
        System.out.println("String after capitalizing first and last letter of each word:");
        System.out.println(capitalizeFirstAndLast(str));
    }
}
