package HW_13;

public class HW_13_3 {

    public static String tripleTrouble(String one, String two, String three) {
        String result = "";
        for (int i = 0; i < one.length(); i++) {
            result = result + one.charAt(i) + two.charAt(i) + three.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("aaa", "bbb", "ccc"));
    }

}
//https://www.codewars.com/kata/5704aea738428f4d30000914/train/java