package HW_13;

public class HW_13_6 {
    public static String boolToWord(boolean b)
    {
        if (b == true){
            return "YES";
        }
        return "NO";
//        return b ? "Yes" : "No";
    }

    public static void main(String[] args) {
        System.out.println(boolToWord(true));
    }
}
//https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java