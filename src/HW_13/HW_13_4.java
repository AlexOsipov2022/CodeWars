package HW_13;

import java.util.HashMap;
import java.util.Map;

public class HW_13_4 {
    public static String position(char alphabet) {
//        String alhabit = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
//        String[] alhabitChar = alhabit.split(" ");
//
//        Map<Character, Integer> result = new HashMap<>();
//        for (int i = 0; i < 26; i++) {
//            char character = alhabitChar[i].charAt(0);
//            result.put(character, i);
//        }
//        Integer position = null;
//        for (int i = 0; i < 26; i++) {
//            if (alphabet == result.get(i)) {
//                position = result.get(alphabet);
//            }
//
//        }

        return "Position of alphabet: " + (alphabet - 'a' + 1);
    }

    public static void main(String[] args) {
        System.out.println(position('f'));
    }


}
//https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java