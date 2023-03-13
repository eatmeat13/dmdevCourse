package sixthhomework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 */
public class ThirdTask {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Leonid", "Myasoedov", 4, List.of(2, 2, 2, 2)));
        students.add(new Student("Ivan", "Ivanov", 3, List.of(2, 3, 4, 5, 2)));
        students.add(new Student("Vasya", "Smirnov", 2, List.of(3, 3, 3, 3, 3)));
        students.add(new Student("Vika", "Ulyanova", 5, List.of(4, 3, 4, 2, 2)));
        students.add(new Student("Sveta", "Ulyanova", 4, List.of(3, 3, 3, 3)));
        students.add(new Student("Gleb", "Jiglov", 1, List.of(0, 5, 5, 0)));

        Map<Integer, CourseInformation> courseMap = students.stream()
                .collect(groupingBy(Student::getNumberOfCourse,
                        collectingAndThen(toList(), CourseInformation::getCourseInformation)));
        System.out.println(courseMap);
    }
}