package secondhomework.loops;

import java.util.Scanner;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */
public class SecondTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        long input = scanner.nextLong();
        System.out.println("Обратное число : " + reverseNumber(input));
    }

    private static long reverseNumber(long input) {
        long result = 0;
        boolean flag = false;
        if (input < 0) {
            flag = true;
            input *= (-1);
        }
        while (input > 0) {
            long current = input % 10;
            result = result * 10 + current;
            input /= 10;
        }
        if (flag) {
            result *= (-1);
        }
        return result;
    }
}
