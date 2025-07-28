import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class flatMapPractice {
    public static void main(String[] args) {
        List<String> companies = List.of("Amazon", "Benz", "Cognizant", "Deloitte", "Apple", "Tesla", "Google", "Netflix", "Spotify", "HP", "Dell", "Oracle", "Nvidia");
        System.out.println("Amazon".split(""));


        List<String[]> collect = companies.stream().map(str -> str.split("")).collect(Collectors.toList());
        List<String> collect1 = companies.stream().map(str -> str.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        List<String> collect2 = companies.stream().map(str -> str.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(collect);
        System.out.println(collect1);
        System.out.println(collect2);

        List<List<Integer>> matrix = List.of(
                List.of(12, 13),
                List.of(13, 12),
                List.of(14, 15)
        );
        System.out.println(matrix);

        Set<Integer> list = matrix.stream().flatMap(List::stream).collect(Collectors.toSet());
        System.out.println(list);

        List<String> companies1 = List.of("Amazon", "Benz", "Cognizant", "Deloitte", "Apple", "Tesla", "Google", "Netflix", "Spotify", "HP", "Dell", "Oracle", "Nvidia");

        List<List<String>> collect3 = companies.stream()
                .flatMap(company ->
                        companies1
                                .stream()
                                .filter(company2 -> company.length() == company2.length())
                                .map(company2 -> List.of(company, company2)))
                .filter(l -> !l.get(0).equals(l.get(1)))
                .collect(Collectors.toList());
        System.out.println(collect3);


        List<List<String>> list1 = companies.stream()
                .flatMap(company -> companies1.stream().map(company2 -> List.of(company, company2))).toList();
        System.out.println(list1);


    }
}
