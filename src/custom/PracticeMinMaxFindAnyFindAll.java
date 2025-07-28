package custom;

import java.util.Comparator;
import java.util.List;

public class PracticeMinMaxFindAnyFindAll {
    public static void main(String[] args) {
        List<Student> list = StudentList.getStudentList();
        System.out.println(list);
        //[{Raghu:13:900}, {Sneha:14:875}, {Arjun:15:910}, {Meera:13:860}, {Vikram:14:820}, {Ananya:15:935}, {Kiran:13:890}, {Divya:14:845},
        // {Manoj:15:880}, {Priya:13:920}, {Ravi:14:800}, {Neha:15:870}, {Siddharth:13:940}, {Isha:14:910}, {Aditya:15:860}, {Pooja:13:895}]
        System.out.println(
                list.stream().max(Comparator.comparingInt(Student::getAge))); // Optional[{Arjun:15:910}]

        System.out.println(
                list.stream().min(Comparator.comparingInt(Student::getAge))); //Optional[{Meera:13:860}]

        System.out.println(
                list.stream().min(Comparator.comparingInt(Student::getAge).reversed())); //Optional[{Arjun:15:910}]

        System.out.println(
                list.stream().max(Comparator.comparingInt(Student::getAge).reversed())); //Optional[{Raghu:13:900}]

        System.out.println(
                list.stream().filter(student -> student.getMarks() < 600).findFirst()); //Optional.empty

        System.out.println(
                list.stream().filter(student -> student.getMarks() > 600).findFirst()); //Optional[{Raghu:13:900}]

        System.out.println(
                list.stream().filter(student -> student.getMarks() > 600).findAny());
    }
}
