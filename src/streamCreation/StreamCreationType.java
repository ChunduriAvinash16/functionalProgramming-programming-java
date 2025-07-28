package streamCreation;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreationType {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 14, 15, 16, 2, 3, 4);
        Stream<Integer> stream = list.stream();

        Stream<Integer> stream1 = Stream.of(12, 14, 13, 16, 2, 3, 4);

        int[] arr = {12, 14, 13, 16, 2, 3, 4};
        IntStream stream2 = Arrays.stream(arr);
        System.out.println(stream2);
        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);

        //exclude 10
        int sum1 = IntStream.range(1, 10).sum();
        System.out.println(sum1);

        //include 10
        int sum2 = IntStream.rangeClosed(1, 10).sum();
        System.out.println(sum2);

        System.out.println(
                IntStream.iterate(1, num -> num + 2).limit(10).peek(System.out::println).sum());

        System.out.println(IntStream.iterate(0, e -> e + 2).limit(10).sum());

        System.out.println(IntStream.iterate(1, num -> num * 2).limit(10).peek(System.out::println).sum());

        //boxed --> to convert primitive to Wrapper Class
        List<Integer> collect = IntStream.iterate(1, num -> num + 3).limit(10).boxed().collect(Collectors.toList());

        System.out.println("----------------------------------------------");
        System.out.println(
                IntStream.rangeClosed(1, 10).reduce(1, (x, y) -> x * y));

        System.out.println(
                LongStream.rangeClosed(1, 20).reduce(1L, (x, y) -> x * y));

        System.out.println(
                LongStream.rangeClosed(1, 30).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));
    }
}
