package custom;

import java.util.List;

public class PracticeAllMatchAnyMatchNoneMatch {
    public static void main(String[] args) {
        List<Student> students = StudentList.getStudentList();

        //allMatch
        System.out.println(students.stream().allMatch(student -> student.getMarks() >= 800));
        //anyMatch
        System.out.println(students.stream().anyMatch(student -> student.getMarks() > 800));
        System.out.println(students.stream().anyMatch(student -> student.getMarks() < 800));
        //noneMatch
        System.out.println(students.stream().noneMatch(student -> student.getMarks() > 1000));

    }
}
