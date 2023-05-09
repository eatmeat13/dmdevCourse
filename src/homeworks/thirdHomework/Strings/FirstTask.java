package homeworks.thirdHomework.Strings;

/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class FirstTask {
    public static void main(String[] args) {
        System.out.println(deleteAllRepeatedChars("abc Cpddd Dio OsfWw"));
    }

    public static String deleteAllRepeatedChars(String string) {
        char[] chars = string.replaceAll("\\s+", "").toUpperCase().toCharArray();
        StringBuilder result = new StringBuilder();
        result.append(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] != chars[i]) {
                result.append(chars[i]);
            }
        }
        return result.toString();
    }
}
