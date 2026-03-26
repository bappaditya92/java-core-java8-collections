import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");

        System.out.println("Fruit List: " + fruits);
        System.out.println("First fruit: " + fruits.get(0));
        fruits.remove("Mango");
        System.out.println("Total fruits: " + fruits.size());
        System.out.println("All fruits:");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}