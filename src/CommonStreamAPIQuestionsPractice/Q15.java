package CommonStreamAPIQuestionsPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " : " + age;
    }
}
public class Q15 {
    public static void main(String[] args) {
        List<User> users = List.of(
                new User("Raju",14),
                new User("Ravi",13),
                new User("Suma",11),
                new User("Monika",15),
                new User("Harish",11),
                new User("Ramya",15),
                new User("Siddharth",15)
        );
        Map<Integer, List<User>> collect = users.stream().collect(Collectors.groupingBy(User::getAge));
        System.out.println("Goupying by age : " + collect);
    }
}
