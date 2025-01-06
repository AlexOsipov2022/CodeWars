package RedRover_HW_13;

import java.util.Arrays;

public class HW_13_8 {
    public static int[] reverse(int n) {
        int[] result = new int[(n)];
            for (int i = 0; i < n; i++) {
            for (int j = n; j > 0; j--) {
                result[i] = j;
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(7)));
    }
}
//https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java