import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortHashMapByValue {

    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Ankit", 95);
        scores.put("Akash", 80);
        scores.put("Sourav", 97);
        scores.put("Aditya", 78);
        scores.put("Munni", 65);

        System.out.println(scores);
        scores = sortByValue(scores);
        System.out.println(scores);
    }

    private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
        Map<String, Integer> sortedByValue = new LinkedHashMap<>();

        Set<Entry<String, Integer>> entrySet = scores.entrySet();
        System.out.println(entrySet);
        List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
        System.out.println(entryList);

        entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
        System.out.println(entryList);
        for (Entry<String, Integer> e : entryList)
            sortedByValue.put(e.getKey(), e.getValue());

        return sortedByValue;
    }

}