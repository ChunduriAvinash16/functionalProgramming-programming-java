import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionPredicateConsumer {
    public static void main(String[] args) {
        BiPredicate<Integer,String> biPredicate = (number, name) -> {
            return number%2==0 && name.length()%2==0;
        };
        System.out.println(biPredicate.test(12,"Raju"));

        BiFunction<Integer,String,String> biFunction = (number, name) -> {
            return name+" "+number;
        };
        System.out.println(biFunction.apply(13,"Ravi"));

        BiConsumer<Integer,String> biConsumer = (number, name) -> {
            System.out.println(number);
            System.out.println(name);
        };
        biConsumer.accept(123,"Sidd");
    }
}
