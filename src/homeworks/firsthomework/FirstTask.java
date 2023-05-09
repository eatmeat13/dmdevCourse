package homeworks.firsthomework;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * Протестировать функцию в main.
 */
public class FirstTask {
    public static void main(String[] args) {
        System.out.println(searchQuarterOfHour(40));
    }

    public static int searchQuarterOfHour(int minutes) {
        if (minutes >= 0 && minutes <= 15) {
            return 1;
        }
        if (minutes >= 16 && minutes <= 30) {
            return 2;
        }
        if (minutes >= 31 && minutes <= 45) {
            return 3;
        }
        if (minutes >= 46 && minutes <= 59) {
            return 4;
        } else {
            return -1;
        }
    }
}
