package FirstHomework;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */

public class FirstTask {

    public static void main(String[] args) {
        System.out.println(quarterOfHour(70));

    }

    public static int quarterOfHour(int minutes) {
        int quarter = -1;
        if (0 <= minutes && minutes <= 15) {
            quarter = 1;
        }
        if (16 <= minutes && minutes <= 30) {
            quarter = 2;
        }
        if (31 <= minutes && minutes <= 45) {
            quarter = 3;
        }
        if (46 <= minutes && minutes <= 59) {
            quarter = 4;
        }
        return quarter;
    }
}
