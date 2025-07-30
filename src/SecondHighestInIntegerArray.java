import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class SecondHighestInIntegerArray {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 9, 2, 6};
        Integer i = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).distinct().toList().get(1);
        System.out.println(i);

        List<Integer> list = Arrays.asList(5, 3, 7, 9, 2, 6);
        Integer i1 = list.stream().distinct().sorted().toList().get(list.size() - 2);
        System.out.println(i1);

        //2,3,5,6,7,9
        Optional<Integer> first = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(first.get());

        List<Set<Integer>> list1 = List.of(
                Set.of(3, 5),
                Set.of(62, 5, 9),
                Set.of(4, 1, 8)
        );
        Stream<Integer> integerStream = list1.stream().flatMap(innerList -> innerList.stream());
        List<Integer> oddNumber = integerStream.filter(num -> num % 2 == 1).toList();
        System.out.println(oddNumber);

        //Maximum Salary for a Deparment
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Raghu","IT", 100));
        employees.add(new Employee("Ramu","HR", 1200));
        employees.add(new Employee("Ravi","IT", 120000));
        employees.add(new Employee("Ramya","Fin", 12500));
        employees.add(new Employee("Sidd","IT", 130000));
        employees.add(new Employee("Suma","HR", 1250));
        employees.add(new Employee("Monika","IT", 120000));

        Map<String, Optional<Employee>> collect = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));

        Map<String, List<String>> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment))
                .entrySet().stream()
                .collect(Collectors.toMap(
                        e -> e.getKey(),
                        entry -> {
                            int maxValue = entry.getValue().stream().mapToInt(Employee::getSalary).max().orElse(0);
                            return entry.getValue().stream()
                                    .filter(e -> e.getSalary() == maxValue)
                                    .map(Employee::getName)
                                    .toList();
                        }
                ));
        System.out.println(collect1);
        System.out.println(collect);
        String s1 = "aabbcde";

        s1.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Character::charValue, LinkedHashMap::new, Collectors.counting()));
    }
}
