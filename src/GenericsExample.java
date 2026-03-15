import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");

        for (String item : list) {
            System.out.println(item);
        }
    }
}