package custom;

import java.util.List;

public class StudentList {
    static List<Student> getStudentList() {
        return List.of(
                new Student("Raghu", 13, 900),
                new Student("Sneha", 14, 875),
                new Student("Arjun", 15, 910),
                new Student("Meera", 13, 860),
                new Student("Vikram", 14, 820),
                new Student("Ananya", 15, 935),
                new Student("Kiran", 13, 890),
                new Student("Divya", 14, 845),
                new Student("Manoj", 15, 880),
                new Student("Priya", 13, 920),
                new Student("Ravi", 14, 800),
                new Student("Neha", 15, 870),
                new Student("Siddharth", 13, 940),
                new Student("Isha", 14, 910),
                new Student("Aditya", 15, 860),
                new Student("Pooja", 13, 895)
        );
    }
}
