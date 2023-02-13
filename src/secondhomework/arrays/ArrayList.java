package secondhomework.arrays;

public class ArrayList {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] deletes = plusElementOfIndex(array, 10, 3);
        for (int delete : deletes) {
            System.out.println(delete);
        }


    }

    public static int[] plusElement(int[] array, int element) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
            result[result.length - 1] = element;
        }
        return result;
    }

    public static int[] deleteElement(int[] array, int index) {
        int[] result = new int[array.length - 1];
        for (int i = 0; i < array.length; i++) {
            int count = i;
            if (i != index) {
                if (i > index) {
                    count = i - 1;
                }
                result[count] = array[i];
            }
        }
        return result;
    }

    public static int[] plusElementOfIndex(int[] array, int element, int index) {
        int[] result = new int[array.length + 1];
        int count = 0;
        for (int i = 0; i < result.length; i++) {
            if (i == index) {
                result[i] = element;
            } else {
                result[i] = array[count];
                count++;
            }
        }
        return result;
    }
}


