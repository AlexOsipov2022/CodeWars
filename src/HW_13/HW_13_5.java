package HW_13;

public class HW_13_5 {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
                return sum;
    }

    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{100,200,300}, new int[]{400,500,600}));
    }
}
