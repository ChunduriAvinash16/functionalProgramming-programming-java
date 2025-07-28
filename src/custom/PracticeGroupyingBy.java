package custom;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticeGroupyingBy {
    public static void main(String[] args) {
        List<Student> list = StudentList.getStudentList();
        System.out.println(
                list.stream().collect(Collectors.groupingBy(Student::getAge)));
        //{13=[{Raghu:13:900}, {Meera:13:860}, {Kiran:13:890}, {Priya:13:920}, {Siddharth:13:940}, {Pooja:13:895}],
        // 14=[{Sneha:14:875}, {Vikram:14:820}, {Divya:14:845}, {Ravi:14:800}, {Isha:14:910}],
        // 15=[{Arjun:15:910}, {Ananya:15:935}, {Manoj:15:880}, {Neha:15:870}, {Aditya:15:860}]}


        System.out.println(
                list.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.counting())));
        //{13=6, 14=5, 15=5}


        System.out.println(
                list.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.maxBy(Comparator.comparingInt(Student::getMarks)))));
        //{13=Optional[{Siddharth:13:940}], 14=Optional[{Isha:14:910}], 15=Optional[{Ananya:15:935}]}

        System.out.println(
                list.stream().collect(Collectors.groupingBy(Student::getAge, Collectors.mapping(Student::getName, Collectors.toList() )))
        //{13=[Raghu, Meera, Kiran, Priya, Siddharth, Pooja], 14=[Sneha, Vikram, Divya, Ravi, Isha], 15=[Arjun, Ananya, Manoj, Neha, Aditya]}


        );
    }
}
