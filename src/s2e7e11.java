import java.util.List;
import java.util.stream.Collectors;

public class s2e7e11 {
    public static void main(String[] args) {
        //Square every umber in the list and sum them
        List<Integer> list = List.of(12, 3, 4, 5, 1, 6);
        Integer sumOfSquares = list.stream()
                //.map(number -> number * number)
                .reduce(0, (x, y) -> x + (y * y));
        //.reduce(0, Integer::sum);
        System.out.println("Sum of squares: " + sumOfSquares);


        Integer sumOfCubes = list.stream().reduce(0, (x, y) -> x + (y * y * y));
        System.out.println("Sum of cubes: " + sumOfCubes);

        Integer sumOfOddNumbers = list.stream().reduce(0, (x, y) -> {
            if (y % 2 != 0) {
                return x + y;
            }
            return x;
        });
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
        //Create a list of even numbers filtered from the list
        List<Integer> evenList = list.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        System.out.println("Even number List :" + evenList);

        //create a list of length of companies
        List<String> companies = List.of("Google", "Amazon", "Microsoft", "Apple", "Facebook", "Tesla");
        List<Integer> lengthList = companies.stream().map(String::length).collect(Collectors.toList());
        System.out.println("Company length List :" + lengthList);
    }
}
