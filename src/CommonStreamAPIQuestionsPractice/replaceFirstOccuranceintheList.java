package CommonStreamAPIQuestionsPractice;

import java.util.Arrays;
import java.util.List;


public class replaceFirstOccuranceintheList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,13,4,15,16,4,17);
        int key = 4;
//        for(int i = 0; i<list.size(); i++) {
//            if(list.get(i) == key) {
//                list.set(i,14);
//                break;
//            }
//        }
        list.set(list.indexOf(4),14);

//        Integer value = list.stream().filter(num -> num == key).findFirst().orElse(-1);
//        list.set(list.indexOf(value), 14);
        System.out.println(list);
    }
}
