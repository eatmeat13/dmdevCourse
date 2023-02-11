package secondhomework.arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 */

public class ThirdTask {

    public static void main(String[] args) {
        int[] array = {-4, 0, 1, 9, 0, -18, 3};
        int[][] separateInts = separateArray(array);
        for (int[] separateInt : separateInts) {
            for (int i : separateInt) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int countPlus(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j > 0) {
                count++;
            }
        }
        return count;
    }

    public static int countZero(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j == 0) {
                count++;
            }
        }
        return count;
    }

    public static int countMinus(int[] array) {
        int count = 0;
        for (int j : array) {
            if (j < 0) {
                count++;
            }
        }
        return count;
    }


    public static int[][] separateArray(int[] array) {
        int currentMinus = 0;
        int currentZero = 0;
        int currentPlus = 0;
        int[][] result = new int[3][];
        result[0] = new int[countMinus(array)];
        result[1] = new int[countZero(array)];
        result[2] = new int[countPlus(array)];
        for (int j : array) {
            if (j < 0) {
                result[0][currentMinus] = j;
                currentMinus++;
            } else if (j == 0) {
                result[1][currentZero] = j;
                currentZero++;
            } else {
                result[2][currentPlus] = j;
                currentPlus++;
            }
        }
        return result;
    }
}
