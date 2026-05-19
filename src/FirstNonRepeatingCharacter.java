import java.util.*;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String str = "xxxyyyaaaaccccfddattta";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}