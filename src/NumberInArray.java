public class NumberInArray {
    public static void main(String[] args) {
        System.out.println(containsThreeConsecutiveNumbers(new int[] {1, 2, 3, 7, 5}));
    }

    public static boolean containsThreeConsecutiveNumbers(int[] numbers) {
        // Iterate through the array and check for three consecutive numbers
        for (int i = 0; i < numbers.length-2; i++) {
            if (numbers[i] + 1 == numbers[i + 1] && numbers[i + 1] + 1 == numbers[i + 2]) {
                return true;
            }
        }

        // If we didn't find any consecutive numbers, return false
        return false;
    }
//    You can call this function with an array of integers as the argument. For example:

//    boolean result = containsThreeConsecutiveNumbers(new int[] {1, 2, 3, 4, 5}); // Returns true
//    boolean result = containsThreeConsecutiveNumbers(new int[] {1, 2, 4, 5, 6}); // Returns false
//    boolean result = containsThreeConsecutiveNumbers(new int[] {1, 3, 5, 7, 9}); // Returns false
}
