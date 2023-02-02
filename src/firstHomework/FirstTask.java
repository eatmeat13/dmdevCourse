package firstHomework;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */

public class FirstTask {

    public static void main(String[] args) {
        System.out.println(quarterOfHour(40));

    }

    public static int quarterOfHour(int minutes) {
        if (0 <= minutes && minutes <= 15) {
            return 1;
        }
        if (16 <= minutes && minutes <= 30) {
            return 2;
        }
        if (31 <= minutes && minutes <= 45) {
            return 3;
        }
        if (46 <= minutes && minutes <= 59) {
            return 4;
        } else {
            return -1;
        }
    }
}
