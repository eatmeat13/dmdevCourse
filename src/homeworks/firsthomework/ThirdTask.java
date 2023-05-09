package homeworks.firsthomework;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */

public class ThirdTask {

    public static void main(String[] args) {
        int a1 = 30;
        int b1 = 30;
        int a2 = 30;
        int b2 = 30;
        double s1 = calculateTriangleArea(a1, b1);
        double s2 = calculateTriangleArea(a2, b2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("------------------");
        compareTriangleArea(s1, s2);

    }

    public static double calculateTriangleArea(int firstSight, int secondSight) {
        return (double) firstSight * secondSight / 2;
    }

    public static void compareTriangleArea(double firstSquare, double secondSquare) {
        if (firstSquare == secondSquare) {
            System.out.println("Треугольники равны");
        } else if (firstSquare > secondSquare) {
            System.out.println("Первый треугольник больше");
        } else System.out.println("Первый треугольник меньше");
    }
}
