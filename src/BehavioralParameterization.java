import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class BehavioralParameterization {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 13, 14, 16, 17, 19);
        //Predicate<Integer> evenPredicate = x -> x % 2 == 0;
        filterAndPrint(list, x -> x % 2 == 0);
        //Predicate<Integer> oddPredicate = x -> x % 2 != 0;
        filterAndPrint(list, x -> x % 2 == 1);


        Function<Integer, Integer> mappingFunction = x -> x * x;
        List<Integer> sqauredList = mapandCreateNewList(list, x -> x * x);
        List<Integer> cubedList = mapandCreateNewList(list, x -> x * x * x);
        List<Integer> doubledList = mapandCreateNewList(list, x -> x + x);
        System.out.println(sqauredList);
        System.out.println(cubedList);
        System.out.println(doubledList);
    }

    private static List<Integer> mapandCreateNewList(List<Integer> list, Function<Integer, Integer> mappingFunction) {
        return list.stream().map(mappingFunction).collect(Collectors.toList());
    }

    private static void filterAndPrint(List<Integer> list, Predicate<Integer> evenPredicate) {
        list.stream().filter(evenPredicate).forEach(System.out::println);
    }
}
