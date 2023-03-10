package secondhomework.arrays;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */
public class SecondTask {
    public static void main(String[] args) {
        char[] chars = {'a', '6', 'y', 'P', 'T', 'q', '9', '+' };
        int[] ints = convertArrayCharToArrayInt(chars);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public static int[] convertArrayCharToArrayInt(char[] chars) {
        int sum = 0;
        double avg;
        int[] current = new int[chars.length];
        for (int i = 0; i < current.length; i++) {
            current[i] = chars[i];
            sum += current[i];
        }
        avg = (double) sum/ current.length;
        return makeMassiveWithLengthOfIntsBiggerThanAvg(current, avg);
    }

    public static int[] makeMassiveWithLengthOfIntsBiggerThanAvg(int[] ints, double avg){
        int count = 0;
        int current = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > avg) {
                count++;
            }
        }
            int[] result = new int[count];
            for (int  i = 0; i < ints.length; i++) {

                if (ints[i] > avg) {
                    result[current] = ints[i];
                    current++;
            }
        }
        return result;
    }
}
