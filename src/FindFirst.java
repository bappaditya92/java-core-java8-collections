import java.util.Arrays;
import java.util.List;


import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
        int first = numbers.stream()
                .sorted()
                .findFirst()
                .get();
        System.out.println(first); // Output: 1
    }
}
