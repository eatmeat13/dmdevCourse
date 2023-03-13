package sixthhomework;

import java.util.List;
import java.util.Objects;

/**
 * Дан список студентов с полями:
 * - Имя
 * - Фамилия
 * - Номер курса в университете
 * - Список оценок за учебу
 *
 * Преобразовать этот список студентов в ассоциативный массив, где ключом является номер курса, а значением:
 *
 * Средняя оценка студентов этого курса, количество оценок у которых больше 3-х
 *
 * Список студентов данного курса, но только с полями Имя и Фамилия.
 * Список должен быть отсортированы по этим двум полям
 *
 * Объект с двумя полями:
 * - Отсортированный список студентов с пункта 2
 * - Средняя оценка этих студентов
 */
public class Student {
    private String name;
    private String  surname;
    private int numberOfCourse;
    private List<Integer> marks;

    public Student(String name, String surname, int numberOfCourse, List<Integer> marks) {
        this.name = name;
        this.surname = surname;
        this.numberOfCourse = numberOfCourse;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getNumberOfCourse() {
        return numberOfCourse;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return numberOfCourse == student.numberOfCourse && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, numberOfCourse, marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberOfCourse=" + numberOfCourse +
                ", marks=" + marks +
                '}';
    }
}
