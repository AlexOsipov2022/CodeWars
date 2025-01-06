public class CharFunction {
    public static void main(String[] args) {
        System.out.println(countLetterOccurrences("String word", 'S'));
    }

    public static int countLetterOccurrences(String word, char letter) {
        // Convert the letter to uppercase to ensure case-insensitive comparison
        letter = Character.toUpperCase(letter);

        // Convert the word to uppercase and count the occurrences of the letter
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.toUpperCase(word.charAt(i)) == letter) {
                count++;
            }
        }

        // Return the count of occurrences
        return count;
    }
}
