import java.util.List;
import java.util.function.Supplier;

public class MethodReferncesExample {
    static void printName(String name) {
        System.out.println(name);
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> companies = List.of("Oracle", "Amazon", "Apple", "Google");
        companies.stream().map(str -> str.toUpperCase())
                .forEach(str -> System.out.println(str));

        companies.stream().map(String::toUpperCase)
                .forEach(MethodReferncesExample::printName);

        Supplier<String> integerSupplier = () -> new String();
        Supplier<String> integerSupplier1 = String::new;
    }
}
