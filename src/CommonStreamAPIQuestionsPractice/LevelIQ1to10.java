package CommonStreamAPIQuestionsPractice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class LevelIQ1to10 {
    public static void main(String[] args) {
        int[] nums = {12,13,14,15,16};
        Map<Boolean, List<Integer>> collect = Arrays.stream(nums).boxed().collect(Collectors.partitioningBy(num -> num % 2 == 0));
        System.out.println(collect);

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        List<String> collect1 = myList.stream().map(Object::toString).filter(num -> num.startsWith("1")).collect(Collectors.toList());
        System.out.println(collect1);

        Arrays.stream(nums).boxed().map(num -> num+"").filter(num -> num.startsWith("1")).forEach(num -> System.out.print(num+" "));

        System.out.println("\n Approach 1");
        //Duplicate elements in the list
        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Map<Integer, Long> collect2 = myList1.stream().collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));
        System.out.println(collect2);
        List<Integer> list = collect2.keySet().stream().filter(key -> collect2.get(key) > 1).toList();
        System.out.println(list);

        List<Integer> unique = myList1.stream()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println("Approach 2"+unique);

        Set<Integer> set = new HashSet<>();
        List<Integer> list1 = myList1.stream().filter(val -> !set.add(val)).toList();
        System.out.println("Approach 3"+list1);

        //Total number elements using stream
        long count = myList1.stream().count();
        System.out.println("Total number of elements : " + count);

        //Maximum value
        Integer maxValue = myList1.stream().max(Integer::compare).orElse(-1);
        System.out.println("Maximum Value : " + maxValue);

        //Find the first non repeated chracter
        String input = "Java articles are Awesome";

        Character c2 = input.chars().mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Character::charValue, LinkedHashMap::new ,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(c2);

        Character c1 = input.chars()
                .mapToObj(c -> (char) c)
                .map(Character::toLowerCase)
                .filter(c -> input.indexOf(c) == input.lastIndexOf(c))
                .findFirst().orElse(null);
        System.out.println(c1);

        //Find the first repeated character
        Character repetedCharacter = input.chars().mapToObj(c -> Character.toLowerCase((char) c))
                .collect(Collectors.groupingBy(Character::charValue, LinkedHashMap::new ,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
        System.out.println(repetedCharacter);

        //Given Array Of integer return true if the value appears atleast 2 >= 2 false if it is distinct
        Set<Integer> hashSet = new HashSet<>(myList1);
        if(myList1.size() == hashSet.size()){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        HashSet<Integer> hashSet1 = new HashSet<>();
        System.out.println(
            myList1.stream().allMatch(hashSet1::add));


        //Jav 8 Date and Time API
        //java.time
        System.out.println("Local Date : " + LocalDate.now());
        System.out.println("Local Time : " + LocalTime.now());
        System.out.println("Local Date and Time : " + LocalDateTime.now());

        // How to convert a List of objects into a Map by considering duplicated keys and store them in
        //sorted order?
        List<Notes> noteList = new ArrayList<>();
        noteList.add(new Notes(1, "note1", 11));
        noteList.add(new Notes(2, "note2", 22));
        noteList.add(new Notes(3, "note3", 33));
        noteList.add(new Notes(4, "note4", 77));
        noteList.add(new Notes(4, "note4", 44));
        noteList.add(new Notes(5, "note5", 55));
        noteList.add(new Notes(6, "note4", 66));

        TreeMap<String, Integer> collect3 = noteList
                .stream()
                .sorted(Comparator.comparingInt(Notes::getTagId).reversed()) //77,66,55,44,33,22,11
                .collect(Collectors.toMap(Notes::getName, Notes::getTagId, (oldValue,newValue) -> oldValue, TreeMap::new));
        System.out.println(collect3);


        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        Map<String, Long> collect4 = names.stream().collect(Collectors.groupingBy((c) -> c, Collectors.counting()));
        System.out.println(collect4);


        List<String> collect5 = names.stream()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(collect5);

        Optional.ofNullable(list1).orElseGet(Collections::emptyList).stream().filter(Objects::nonNull);

        String s = "string data to count each character";
        Map<String, Long> collect6 = Arrays.stream(s.split(""))
                .filter(s1 -> !s1.equals(" "))
                .collect(Collectors.groupingBy(s1 -> s1,LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect6);
    }
}
