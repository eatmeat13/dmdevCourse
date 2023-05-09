package homeworks.sixthhomework;

import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class CourseInformation {
    private final List<Student> students;
    private final double averageGrade;

    public CourseInformation(List<Student> students, double averageGrade) {
        this.students = students;
        this.averageGrade = averageGrade;
    }

    public List<Student> getStudents() {
        return students;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
    public static CourseInformation getCourseInformation(List<Student> students){
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparing(Student::getSurname).thenComparing(Student::getName))
                .collect(toList());

        double averageGrade = students.stream()
                .flatMapToInt(s -> s.getMarks().stream().mapToInt(Integer::intValue))
                .average().orElse(Double.NaN);

        return new CourseInformation(sortedStudents, averageGrade);
    }

    @Override
    public String toString() {
        return "CourseInformation{" +
                "students=" + students +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
