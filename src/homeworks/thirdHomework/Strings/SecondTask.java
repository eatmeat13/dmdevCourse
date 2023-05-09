package homeworks.thirdHomework.Strings;

import java.util.Arrays;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class SecondTask {

    public static void main(String[] args) {
        String str = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] digits = getDigitsFromString(str);
        System.out.println(Arrays.toString(digits));

        int sum = getSumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);
    }

    public static int[] getDigitsFromString(String str) {
        StringBuilder digitsStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                digitsStr.append(ch);
            }
        }
        int[] digits = new int[digitsStr.length()];
        for (int i = 0; i < digitsStr.length(); i++) {
            digits[i] = digitsStr.charAt(i) - '0';
        }
        return digits;
    }

    public static int getSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
}
