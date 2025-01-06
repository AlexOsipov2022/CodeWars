import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.list;

public class GetMinMax {
    public static void main(String[] args) {
        List<Integer> list = List.of(50, 7, 8, 9, -11);
        System.out.println(Arrays.toString(getMinMax(list)));
        System.out.println(Arrays.toString(getMM(list)));

    }

    static int[] getMinMax(List<Integer> list) {

        int minInt = Integer.MAX_VALUE;
        int maxInt = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < minInt) {
                minInt = list.get(i);
            }
            if ((list.get(i) > maxInt)) {
                maxInt = list.get(i);
            }
        }
        List<Integer> resultList = new ArrayList<>();
        resultList.add(minInt);
        resultList.add(maxInt);

        int[] result = resultList.stream().mapToInt(h -> h).toArray();
        return result;
}
    static int[] getMM(List<Integer> list) {
        return new int[]{Collections.min(list), Collections.max(list)};
    }
}
//https://www.codewars.com/kata/57a1ae8c7cb1f31e4e000130/train/java