import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SupplierAndUnaryOperatorExamples {
    public static void main(String[] args) {
        Supplier<Integer> randomSupplier = () -> {
            Random random = new Random();
            return random.nextInt(10);
        };
        System.out.println(randomSupplier.get());

        UnaryOperator<String> unaryOperator = (str) -> "Hello " + str;
        System.out.println(unaryOperator.apply("Avinash"));
    }
}
