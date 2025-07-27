package custom;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorPractice {
    public static void main(String[] args) {
        List<Student> list = StudentList.getStudentList();
        List<Student> increasingOrderByAge = list.stream().sorted(Comparator.comparing(Student::getAge)).collect(Collectors.toList());
        System.out.println(increasingOrderByAge);

        List<Student> decreasingOrderByAge = list.stream().sorted(Comparator.comparingInt(Student::getAge).reversed()).collect(Collectors.toList());
        System.out.println(decreasingOrderByAge);

        List<Student> increasingByAgeAndDecreasingOrderByMarks = list.stream().sorted(Comparator.comparingInt(Student::getAge)
                .thenComparingInt(Student::getMarks)
                .reversed()).collect(Collectors.toList());
        System.out.println(increasingByAgeAndDecreasingOrderByMarks);
    }
}
