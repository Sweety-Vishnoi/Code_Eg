package programs.designpattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TableOfTwo {
        public static void main(String[] args) {
            System.out.println("Table of 2:");
            IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(n -> System.out.println("2 x " + (n / 2) + " = " + n));


            System.out.println("Table of 3:");
            IntStream.rangeClosed(1, 10).forEach(i -> System.out.println("3 x " + i + " = " + (i * 3)));

            IntStream.rangeClosed(1,10).map(i-> i*3).forEach(n->System.out.println(n));

            System.out.println("Fibonacci Series (Java 8):");
            /* todo How It Works
                Stream.iterate() generates Fibonacci numbers using an array {previous, current}.
                 limit(10) ensures it prints 10 numbers in the sequence.
                  map(f -> f[0]) extracts the first value from each pair.
                     forEach(System.out::print) prints the numbers efficiently  */

            Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                    .limit(10).map(f -> f[0])
                    .forEach(System.out::println);

        }
    }

