package secondhomework.arrays;

import java.util.Arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 * Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */

public class FirstTask {

    public static void main(String[] args) {
        int[] array = {3, 5, -6, 3, 2, -9, 0, -123};
        System.out.println(Arrays.toString(multiplyNotNullNumberOnLength(array)));
    }

    public static int[] multiplyNotNullNumberOnLength(int[] array) {
        int count = 0;
        int current = 0;
        for (int num : array) {
            if (num >= 0) {
                count++;
            }
        }
        int[] result = new int[count];
        for (int num : array) {
            if (num >= 0) {
                result[current] = num * count;
                current++;
            }
        }
        return result;
    }
}
