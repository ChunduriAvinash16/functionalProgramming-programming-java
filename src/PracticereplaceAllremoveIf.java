import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticereplaceAllremoveIf {
    public static void main(String[] args) {
        //List.of() --> creates an immutable collection
        //Arrays.asList returns a fixed-size list backed by the given array.
        //   modification is possible not adding or removing elements from the list
        List<String> companies1 = new ArrayList<>(Arrays.asList("Amazon", "Benz", "Cognizant", "Deloitte", "Apple",
                "Tesla", "Google", "Netflix", "Spotify", "HP", "Dell", "Oracle", "Nvidia"));
        companies1.replaceAll(company -> company.toUpperCase());
        System.out.println(companies1);

        companies1.removeIf(cm -> cm.length() > 4);
        System.out.println(companies1);
    }
}
