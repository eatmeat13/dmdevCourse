package sixthhomework;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 * <p>
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 * <p>
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

public class FirstTask {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Leonid", "Myasoedov", 4, List.of(2, 2, 2)));
        students.add(new Student("Ivan", "Ivanov", 3, List.of(2, 3, 4, 5, 2)));
        students.add(new Student("Vasya", "Smirnov", 2, List.of(3,3, 3, 3, 3)));
        students.add(new Student("Vika", "Ulyanova", 5, List.of(4, 3, 4, 2, 2)));
        students.add(new Student("Sveta", "Ulyanova", 4, List.of(3, 5, 3,2)));
        students.add(new Student("Gleb", "Jiglov", 4, List.of(0, 5, 5, 0)));

        Map<Integer, Double> collect = students.stream().
                filter(s -> s.getMarks().size() > 3).
                collect(groupingBy(Student::getNumberOfCourse,
                        collectingAndThen(toList(),
                                studentsList -> {
                                    double averageMark = studentsList.stream().
                                            flatMapToInt(student -> student.getMarks().stream().mapToInt(Integer::intValue))
                                            .average().orElse(0.0);
                                    return averageMark;
                                })));
        System.out.println(collect);
    }
}
