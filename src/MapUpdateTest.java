import java.util.*;

public class MapUpdateTest {

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<String,String>();
        map.put("Clean Code", "Robert C. Martin");
        map.put("Design Patterns", "Erich Gamma");
        map.put("Refactoring", "Martin Fowler");
        map.put("The Pragmatic Programmer", "Andrew Hunt");
        map.put("Head First Java", "Kathy Sierra");

        map.computeIfPresent("Clean Code", (key, value) -> "Uncle Bob");

        map.computeIfAbsent("Introduction to Algorithms", (value) -> "Thomas H. Cormen");

        map.entrySet().iterator()
                .forEachRemaining(System.out::println);

    }
}
