import java.util.Arrays;

public class SimplePigLatin {

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
    }

    public static String pigIt(String str) {

        String[] words = str.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Проверка, есть ли в слове буквы
            if (word.matches(".*[a-zA-Z].*")) {
                // Перестановка первой буквы в конец слова и добавление "ay"
                result.append(word.substring(1)).append(word.charAt(0)).append("ay ");
            } else {
                // Если в слове нет букв, оставляем его без изменений
                result.append(word).append(" ");
            }
        }

        // Удаление лишнего пробела в конце
        return result.toString().trim();
    }
}
//https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java