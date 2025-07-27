package custom;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeSkipLimittakeWhiledropWhile {
    public static void main(String[] args) {
        List<Student> list = StudentList.getStudentList();
        System.out.println(list);
        System.out.println(list.stream().limit(2).collect(Collectors.toList()));
        System.out.println(list.stream().skip(2).collect(Collectors.toList()));

        System.out.println(list.stream().limit(5).skip(3).toList());

        //[{Raghu:13:900}, {Sneha:14:875}, {Arjun:15:910}, {Meera:13:860}, {Vikram:14:820}, {Ananya:15:935}, {Kiran:13:890}, {Divya:14:845}, {Manoj:15:880},{Priya:13:920},
        // {Ravi:14:800}, {Neha:15:870}, {Siddharth:13:940}, {Isha:14:910}, {Aditya:15:860}, {Pooja:13:895}]
        System.out.println(list.stream().takeWhile(student -> student.getMarks() >= 820).toList());
        System.out.println(list.stream().dropWhile(student -> student.getMarks() >= 820).toList());
    }
}
