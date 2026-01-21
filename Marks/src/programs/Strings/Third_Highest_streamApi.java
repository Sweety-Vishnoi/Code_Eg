package programs.Strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Third_Highest_streamApi {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 5, 15, 30, 25, 20);
        int n = 3; // 3rd highest
        Optional<Integer> thirdHighest = numbers.stream()
                .distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort descending
                .skip(n - 1) // Skip first (n-1) elements
                .findFirst(); // Get the nth element

        thirdHighest.ifPresentOrElse(
                num -> System.out.println("3rd highest number: " + num),
                () -> System.out.println("Not enough elements in the list.")
        );
    }
}
