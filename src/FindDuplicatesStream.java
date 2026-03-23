import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicatesStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 1, 6, 3);

        Set<Integer> duplicates = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println("Duplicates: " + duplicates);
    }
}
