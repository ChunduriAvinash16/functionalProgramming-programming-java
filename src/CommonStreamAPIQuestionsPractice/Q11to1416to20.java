package CommonStreamAPIQuestionsPractice;

import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Q11to1416to20 {
    public static void main(String[] args) {
        //Check all the numbers in the list are positive
        List<Integer> list = List.of(12,13,14,15,16,2,3,4,5,6);
        boolean isPositive = list.stream().allMatch(num -> num > 0);
        System.out.println("All numbers in the list are positive : " + isPositive);

        //Check if there are no negative numbers in the list
        boolean allPositive = list.stream().noneMatch(num -> num < 0);
        System.out.println("if there are no negative numbers in the list : " + allPositive);

        //First element of the list
        Integer findFirst = list.stream().findFirst().orElse(0);
        System.out.println("First Element of the list : " +findFirst);

        //Flat Map the nested list
        List<List<Integer>> matrix = List.of(
                List.of(12,14),
                List.of(13,15)
        );
        List<Integer> flattenList = matrix.stream().flatMap(List::stream).collect(Collectors.toList());
        System.out.println("Flatten List :" + flattenList);

        //Peeking
        List<Integer> peekList = list.stream().peek(System.out::println).toList();

        //Limiting the Stream
        List<Integer> limited = list.stream().limit(4).collect(Collectors.toList());
        System.out.println("limited :"+ limited);

        //Skip first 2 elements of the list
        List<Integer> skipFirst2 = list.stream().skip(2).collect(Collectors.toList());
        System.out.println("skipFirst2 : " + skipFirst2);

        //Convert list of integer to set to remove duplicates
        Set<Integer> unique = list.stream().collect(Collectors.toSet());
        Set<Integer> unique1 = new HashSet<>(list);
        System.out.println("Unique elements : " + unique);

        //Summarizing statics
        IntSummaryStatistics intSummaryStatistics = list.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(intSummaryStatistics);
    }
}
