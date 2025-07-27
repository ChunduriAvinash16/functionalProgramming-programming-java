import java.util.List;

public class s2e7e9 {
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
    }
}
