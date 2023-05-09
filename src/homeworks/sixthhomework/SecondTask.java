package homeworks.sixthhomework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;

/**
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 */
public class SecondTask {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Leonid", "Myasoedov", 4, List.of(2, 2, 2)));
        students.add(new Student("Ivan", "Ivanov", 3, List.of(2, 3, 4, 5, 2)));
        students.add(new Student("Vasya", "Smirnov", 2, List.of(3, 3, 3, 3, 3)));
        students.add(new Student("Vika", "Ulyanova", 5, List.of(4, 3, 4, 2, 2)));
        students.add(new Student("Sveta", "Ulyanova", 4, List.of(3, 5, 3, 2)));
        students.add(new Student("Gleb", "Jiglov", 4, List.of(0, 5, 5, 0)));

        Map<Integer, List<String>> collect = students.stream().
                sorted(Comparator.comparing(Student::getSurname).thenComparing((Student::getName))).
                collect(groupingBy(Student::getNumberOfCourse,
                        mapping(student -> student.getSurname() + " " + student.getName(), toList())));
        System.out.println(collect);
    }
}
