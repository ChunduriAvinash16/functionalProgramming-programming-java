import java.util.List;

public class s1e1e6 {
    public static void main(String[] args) {
        //Print only odd numbers
        List<Integer> list = List.of(12,3,4,5,123,45,67);
        list.stream().filter(num -> num%2!=0).forEach(System.out::println);

        System.out.println("-------------------");

        //Print all the names individually
        List<String> names = List.of("John", "Jane", "Doe", "Alice", "Bob");
        names.stream().forEach(System.out::println);

        //Print the Name conataining 'a'
        System.out.println("-------------------");
        names.stream().filter(name -> name.contains("a")).forEach(System.out::println);

        //Print all the names with atleast 4 characters
        System.out.println("-------------------");
        names.stream().filter(name -> name.length() >=4).forEach(System.out::println);

        //Print cubes of odd numbers
        System.out.println("-------------------");
        list.stream()
                .filter(number ->number%2!=0)
                .map(number -> number*number*number)
                .forEach(System.out::println);

        //Print the number of characters in each name
        System.out.println("-------------------");
        names.stream().map(String::length)
                .forEach(System.out::println);
    }
}
