import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2,3,4,5}, new int[]{2})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {

        List<Integer> bList = new ArrayList<>();
        for(int num : b) {
            bList.add(num);
        }

        List<Integer> result = new ArrayList<>();

        for(int num : a){
            if( !bList.contains(num) ) {
                result.add(num);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();

    }
}
//https://www.codewars.com/kata/523f5d21c841566fde000009/train/java