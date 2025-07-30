package codingQuestions;

import CommonStreamAPIQuestionsPractice.Notes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CountNumberOfWords {
    public static void main(String[] args) {
        String input = "This is  an example\tstring";
        String[] split = input.split("\\s+");

        Map<String, Long> collect = Arrays.stream(split)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
        System.out.println(collect.size());

        HashMap<String, Integer> map = new HashMap<>();
        for (String word : split) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map.size());

    }
}
