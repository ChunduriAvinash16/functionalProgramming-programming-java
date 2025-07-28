package custom;

import java.util.List;
import java.util.OptionalInt;

public class PracticeSumAverageCount {
    public static void main(String[] args) {
        List<Student> list = StudentList.getStudentList();

        double average = list.stream().mapToInt(Student::getAge).average().orElse(0.0);
        System.out.println(average); //13.9375

        int sum = list.stream().mapToInt(Student::getMarks).sum();
        System.out.println(sum); //14110

        long count = list.stream().count();
        System.out.println(count); //16

        OptionalInt max = list.stream().mapToInt(Student::getAge).max();
        System.out.println(max.getAsInt()); //15
    }
}
