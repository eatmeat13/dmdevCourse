package secondhomework.loops;

import java.util.Scanner;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        long input = scanner.nextLong();
        System.out.println("Количество четных чисел - " + countEvenNumbers(input));
        System.out.println("Количество нечетных чисел - " + countOddNumbers(input));
    }

    private static int countOddNumbers(long input) {
        int count = 0;
        for (long currentValue = input; currentValue > 0; currentValue /= 10) {
            if (currentValue % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    private static int countEvenNumbers(long input) {
        int count = 0;
        for (long currentValue = input; currentValue > 0; currentValue /= 10) {
            if (currentValue % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
