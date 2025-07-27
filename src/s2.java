import java.util.List;

public class s2 {
    /*
    Aggregator: 0, Number: 12
    Aggregator: 12, Number: 3
    Aggregator: 15, Number: 4
    Aggregator: 19, Number: 5
    Aggregator: 24, Number: 123
    Aggregator: 147, Number: 45
    Aggregator: 192, Number: 67
     */
    public static int sum(int aggregator, int number) {
        System.out.println("Aggregator: " + aggregator + ", Number: " + number);
        return aggregator + number;
    }

    public static void main(String[] args) {
        //reduce Example
        List<Integer> list = List.of(12, 3, 4, 5, 123, 45, 67);
        Integer sumOfList = list.stream()
                .reduce(0, Integer::sum);
        //.reduce(0,(x,y) -> x+y);
        //.reduce(0, s2::sum);
        System.out.println("Sum of the list: " + sumOfList);

        System.out.println(list.stream().reduce(0, (x, y) -> x)); // 0
        System.out.println(list.stream().reduce(0, (x, y) -> y)); // 67
        System.out.println("Max Element using reduce: " + list.stream().reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y)); // 123
        System.out.println("Min Element using reduce: " + list.stream().reduce(Integer.MAX_VALUE, (x, y) -> x < y ? x : y)); // 3
    }
}
