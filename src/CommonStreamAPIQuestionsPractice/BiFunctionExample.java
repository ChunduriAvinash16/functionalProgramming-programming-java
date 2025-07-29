package CommonStreamAPIQuestionsPractice;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<String,String,String> biFunction = (str1, str2) -> getUpperCase(str1) +" "+ getUpperCase(str2);
        String apply = biFunction.apply("Hello", "Good");
        System.out.println(apply);


        ArrayList<Integer> list = new ArrayList<>(List.of(12,13,14));
        System.out.println(list.get(0));
    }

    private static String getUpperCase(String str1) {
        return str1.toUpperCase();
    }
}
