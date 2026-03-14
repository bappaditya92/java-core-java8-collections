import java.util.*;

public class LongestString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("java", "springboot", "microservices", "aws");

        String longest = list.stream()
                .max(Comparator.comparing(String::length))
                .get();

        System.out.println(longest);
    }
}
