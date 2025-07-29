package CommonStreamAPIQuestionsPractice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Q1to10 {
    public static void main(String[] args) {
        //Filter Even Numbers;
        List<Integer> list = List.of(12,13,14,12,4,15,16,17,3,4,-10);
        List<Integer> evenNumbers = list.stream().filter(num -> num%2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        //Find the maximum
        Optional<Integer> optionalMax = list.stream().max(Integer::compare);
        int maxValue = list.stream().mapToInt(Integer::intValue).max().orElse(-1);
        System.out.println(optionalMax.get());
        System.out.println(maxValue);

        //Sum of elements in the list
        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of elements in the list : " + sum);
        
        //List of names to upperCase
        List<String> names = List.of("Raghu", "ram", "abdul", "edward");
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("Upper Case Names :" + upperCaseNames);

        //Sort the list of integer in ascending order
        List<Integer> descendingOrder = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<Integer> ascendingOrder = list.stream().mapToInt(Integer::intValue).sorted().boxed().collect(Collectors.toList());
        System.out.println("Descending Order : " + descendingOrder);
        System.out.println("Ascending Order : " + ascendingOrder);

        //Number of elements greater than 5
        long count = list.stream().filter(num -> num > 5).count();
        System.out.println("Number of elements greater than 5 is : " + count);

        //Get the Distinct elements from the list
        List<Integer> distinctNumbers = list.stream().distinct().toList();
        System.out.println("Distinct numbers in the list : "+distinctNumbers);

        //reduce to sum
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println("Reduce to sum : " + reduce );

        //Return any integer from the list
        Optional<Integer> any = list.stream().findAny();
        System.out.println("Random number from the list : " + any.orElse(-1));

        //List the First Names
        List<String> fullNames = List.of("Abdul Aziz", "Ram Gopal", "Pawan Kalyan", "Edward Williams");
        List<String> firstNames = fullNames.stream().map(fullName -> fullName.split(" ")[0]).collect(Collectors.toList());
        System.out.println("First Names from the list : " + firstNames);
    }
}
