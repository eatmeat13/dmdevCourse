package FirstHomework;

/**
 * Даны 3 переменные:
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 * Например:
 * Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
 * Результат: 34.5 (24.4 + 10.1)
 */

public class SecondTask {

    public static void main(String[] args) {

        System.out.println(calculator(1123.4,0,'/'));

    }

    public static double calculator(double operand1, double operand2, char operation) {
        double result = 0;

        if (operation == '+') {
            result = operand1 + operand2;
        }
        if (operation == '-') {
            result = operand1 - operand2;
        }
        if (operation == '*') {
            result = operand1 * operand2;
        }
        if (operation == '/') {
            result = operand1 / operand2;
        }
        if (operation == '%') {
            result = operand1 % operand2;
        }

        return result;
    }


}