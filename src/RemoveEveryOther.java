import java.util.Arrays;

public class RemoveEveryOther {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeEveryOther(new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
    }

    public static Object[] removeEveryOther(Object[] arr) {

        Object[] result = new Object[(arr.length + 1) / 2];
        int ires = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            result[ires++] = arr[i];
        }
        return result;
    }
}
